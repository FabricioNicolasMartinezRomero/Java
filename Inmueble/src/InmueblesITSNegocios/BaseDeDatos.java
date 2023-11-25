package InmueblesITSNegocios;

import java.sql.Connection;//Libreria para interactuar con la bd
//Importamos la librerias para usar sql
import java.sql.DriverManager;//Libreria de control de drivers
import java.sql.ResultSet;//Libreria que representa los resultados de las consultas a la bd
import java.sql.SQLException;//Libreria de Control de exepciones de la bd
import java.sql.Statement;//Libreria que se usa para enviar y hacer consultas a la bd

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BaseDeDatos {

		private static Connection conexion = null;
		private static Statement sentencia = null;
		private static ResultSet resultado = null;
		private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		private static final String RUTABASEDATOS = "jdbc:mysql://192.168.2.52:3306/fmartinez";
		private static final String USUARIO = "fmartinez";
		private static final String CLAVE = "55310173";
		
		//Metodo para el driver
		public static boolean validarDriver() {
			//Ejecutamos una sentencia y si pasa un error ejecuta el catch
			try {
				//Agregamos el driver de sql
				Class.forName(DRIVER);
				return true;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"No se han podido cargar los drivers","Aviso",JOptionPane.WARNING_MESSAGE);
				return false;
			}
		}
		
	//Metodo para la conexion a la bd 	
	public static int validarTipoUsuario(JTextField nombre, JPasswordField pass) {
		int rango=0;
		try {
			//Generamos la consulta 
			String consulta = "select*from usuarios where nombre_usuario = '"+nombre.getText()+"' and contrasenia_usuario  = '"+String.valueOf(pass.getPassword())+"';";
			//Al objeto de conexion le pasamos la conexionn de la bd
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			//Creamos la consulta a la base de datos conectada
			sentencia = conexion.createStatement();
			//Ejecutamos la consulta y la guardamos en el obj ResultSet
			resultado = sentencia.executeQuery(consulta);
			//Recorremos la tabla de la bd
			while(resultado.next()) {
				//Obtenemos los resultados de la consulta de la fila rango
				    rango = resultado.getInt("rango_usuario");
				    return rango;
			}
			
		    conexion.close();
		    
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Error, No se ha podido establecer coneccion con la base de datos","Aviso",JOptionPane.WARNING_MESSAGE);
			
		}
		return rango;
	}

	public static void agregarUsuario(JTextField nombre,JPasswordField pass,int rango) {
		try {
			String consulta = "insert into usuarios values ('"+nombre.getText()+"','"+String.valueOf(pass.getPassword())+"',"+rango+");";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
			conexion.close();
			 JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error, Ya existe un usuario con ese nombre","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		}
	
	public static void eliminarUsuario(JTextField nombre) {
		
		try {
			String consulta = "delete from usuarios where nombre_usuario ='"+nombre.getText()+"';";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			int columnas = sentencia.executeUpdate(consulta);
			conexion.close();
			 if(columnas>0) {
	             	JOptionPane.showMessageDialog(null, "Se han cambiado los datos del Usuario ");
	             }else {
	             	JOptionPane.showMessageDialog(null, "Aviso, el Usuario no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
	         }	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error,El usuario ingresado no existe","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public static void crearCliente(JTextField ci,JTextField nom,JTextField ape,JTextField anio,JTextField mes, JTextField dia, JTextField email, JTextField tel) {
		try {
			String consulta = "insert into clientes values ("+Integer.parseInt(ci.getText())+",'"+nom.getText()+"','"+ape.getText()+"','"
		+Integer.parseInt(anio.getText())+"-"+Integer.parseInt(mes.getText())+"-"+Integer.parseInt(dia.getText())+"','"+email.getText()+"',"+Integer.parseInt(tel.getText())+");";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
			JOptionPane.showMessageDialog(null, "Cliente ingresado con exito");
			conexion.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error,El usuario ingresado ya existe","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public static void eliminarCliente(JTextField ci) {
		
		try {
			String consulta = "DELETE FROM clientes WHERE ci_cliente = "+Integer.parseInt(ci.getText())+" AND ci_cliente NOT IN "
					+ "(SELECT ci_comprador FROM contrato_compra WHERE ci_comprador = "+Integer.parseInt(ci.getText())+");";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			int tablas = sentencia.executeUpdate(consulta);
			conexion.close();
			if(tablas>0) {
				JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
			}else {
				JOptionPane.showMessageDialog(null, "Aviso , El cliente no se puede elimnar porque esta afiliado a un contrato o no existe","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error, No se ha podido establecer coneccion con la base de datos","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
		
		
	}
	
	public static void ingresarInmueble(JTextField ciDuenio,JTextField padron, JTextField precio , JTextField depa, JTextField calle,JTextField Npuerta) {
		try {
			String consulta = "insert into inmueble values ("+Integer.parseInt(padron.getText())+","+Integer.parseInt(ciDuenio.getText())+","+Integer.parseInt(precio.getText())+",'"+depa.getText()+"','"+calle.getText()+"',"+Npuerta.getText()+");";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
		    conexion.close();
		    JOptionPane.showMessageDialog(null, "Se ha ingresado el inmueble");
		}catch(SQLException e) {
		

		} catch (Exception e) {
		
		}
		}
	
	public static void ingresarTerreno(JTextField padron , JTextField tamanio) {
		try {
			String consulta = "insert into terreno values("+Integer.parseInt(padron.getText())+","+Integer.parseInt(tamanio.getText())+");";
			
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
		    sentencia.executeUpdate(consulta);
		    conexion.close();
		} catch (Exception e) {
		
		}
		
	}
	
	public static void ingresarTerrenoServicios(JTextField padron , String servicios) {
		try {
			String consulta = "insert into terreno_servicios values ("+Integer.parseInt(padron.getText())+", '"+servicios+"');";
		     conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		     sentencia = conexion.createStatement();
		     sentencia.executeUpdate(consulta);
		     conexion.close();
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Aviso,El inmueble o cliente no se encuentran ingresados","Aviso",JOptionPane.WARNING_MESSAGE);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Aviso,El inmueble o cliente no se encuentran ingresados","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public static void ingresarHabitable(JTextField Padron , String tipo ,JTextField tamanio,int cantHabitaciones, int cantBanios) {
		try {
			String consulta = "insert into habitable values ("+Integer.parseInt(Padron.getText())+",'"+tipo+"',"+Integer.parseInt(tamanio.getText())+","+cantHabitaciones+","+cantBanios+");";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
			conexion.close();
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Aviso,El cliente o inmueble no estan Ingresados","Aviso",JOptionPane.WARNING_MESSAGE);
		     System.out.println(e.getMessage());
		}
	}

	public static void ingresarHabitableComodidades(JTextField Padron , String comodidades) {
		try {
			String consulta = "insert into habitable_Comodidades values ("+Integer.parseInt(Padron.getText())+",'"+comodidades+"');";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
			conexion.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
  
    public static void ingresarHabitableOtrasHabitaciones(JTextField Padron , String habitaciones ) {
		
    	try {
			String consulta = "insert into habitable_otrasHabitaciones values("+Integer.parseInt(Padron.getText())+",'"+habitaciones+"');";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
			conexion.close();
		} catch (Exception e) {
			
		}
    	
	}

	public static void eliminarInmueble(JTextField padron) {
		try {
	        String consulta = "DELETE FROM inmueble WHERE padron_inmueble = "+Integer.parseInt(padron.getText())+" AND padron_inmueble NOT IN (SELECT padron_Inmueble_Vender FROM contrato_compra WHERE padron_Inmueble_Vender = "+Integer.parseInt(padron.getText())+");";
			conexion =  DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
		int columnas = sentencia.executeUpdate(consulta);
	        conexion.close();	
	        if(columnas>0) {
	        	JOptionPane.showMessageDialog(null, "Se ha elimnado el inemuble");
	        }else {
	        	JOptionPane.showMessageDialog(null, "Aviso,El inmueble no se puede eliminar porque esta afiliado a un contrato o no existe","Aviso",JOptionPane.WARNING_MESSAGE);
	        }
		} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Error,El inmueble a eliminar no existe","Aviso",JOptionPane.WARNING_MESSAGE);		
		}
	}
   
	
	
    public static int buscarPrecioInmueble(JTextField padron) {
    	int valor=0;
    	try {
    		String consulta = "select * from inmueble where padron_inmueble ="+Integer.parseInt(padron.getText())+";";
    		conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
        	sentencia = conexion.createStatement();
        	resultado = sentencia.executeQuery(consulta);
        	//Recorremos la base en busca del resultado
        	while(resultado.next()) {
        		valor = resultado.getInt("valor_inmueble");
        		return valor;
        	}
        	conexion.close();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Aviso,A ocurrido algo con la base de datos","Aviso",JOptionPane.WARNING_MESSAGE);
		}
    	catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Aviso,A ocurrido algo inesperado","Aviso",JOptionPane.WARNING_MESSAGE);
		}
    	return valor;
    }

    public static void modificarPrecioInmueble(JTextField padron , JTextField valor) {
    	try {
    		
    		String consulta = "update inmueble set valor_inmueble="+Integer.parseInt(valor.getText())+" where padron_inmueble = "+Integer.parseInt(padron.getText())+";";
    		conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
        	sentencia = conexion.createStatement();
        int columnas =	sentencia.executeUpdate(consulta);
        	
        if(columnas>0) {
        	JOptionPane.showMessageDialog(null, "Se ha cambiado el precio del inmueble ");
        }else {
        	JOptionPane.showMessageDialog(null, "Aviso, el inmueble no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
    }	
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, "Aviso, El nuevo precio debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
    	}
    }
    
    public static void modificarDatosUsuarios (JTextField ci,JTextField nom,JTextField ape ,JTextField anio,JTextField mes , JTextField dia, JTextField email,JTextField tel ) {
    	try {
    		String consulta = "update clientes set nombre_cliente = '"+nom.getText()+"', apellido_cliente = '"+ape.getText()+"', fechaNacimiento_cliente = '"+Integer.parseInt(anio.getText())+"-"+Integer.parseInt(mes.getText())+"-"
    				+ ""+Integer.parseInt(dia.getText())+"', email_cliente = '"+email.getText()+"' , Telefono_cliente = '"+Integer.parseInt(tel.getText())+"' where ci_cliente = "+Integer.parseInt(ci.getText())+";";
    		conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
        	sentencia = conexion.createStatement();
        	int columnas = sentencia.executeUpdate(consulta);
        	conexion.close();
        	 if(columnas>0) {
              	JOptionPane.showMessageDialog(null, "Se han cambiado los datos del inmueble ");
              }else {
              	JOptionPane.showMessageDialog(null, "Aviso, el cliente no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
          }	
    	}catch(SQLException e) {
    		JOptionPane.showMessageDialog(null, "Aviso, El cliente no existe","Aviso",JOptionPane.WARNING_MESSAGE);
    		JOptionPane.showMessageDialog(null,e.getMessage());
    	}
    	catch (Exception e) {
    		JOptionPane.showMessageDialog(null,e.getMessage());
		}

    }
    
    public static void modificarDatosInmueble(JTextField depa,JTextField calle , JTextField puerta , JTextField padron) {
    	try {
			String consulta = "update inmueble set departamento_inmueble = '"+depa.getText()+"' , calle_inmueble = '"+calle.getText()+"' , "
					+ "numeroPuerta_inmueble = "+Integer.parseInt(puerta.getText())+" where padron_inmueble = "+Integer.parseInt(padron.getText())+";";
			conexion = DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
        	sentencia = conexion.createStatement();
        	int columnas =sentencia.executeUpdate(consulta);
        	conexion.close();
        	
        	 if(columnas>0) {
             	JOptionPane.showMessageDialog(null, "Se han cambiado los datos del inmueble ");
             }else {
             	JOptionPane.showMessageDialog(null, "Aviso, el inmueble no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
         }	
        	
    	} catch(SQLException e) {
    		JOptionPane.showMessageDialog(null, "Aviso, El cliente no existe","Aviso",JOptionPane.WARNING_MESSAGE);
    		JOptionPane.showMessageDialog(null,e.getMessage());
    	}
    	catch (Exception e) {
    		JOptionPane.showMessageDialog(null,e.getMessage());
		}
    }

public static JTable cargarJTableCounsultaCliente(JTable tabla, JTextField nombre) {
	
	// Declaro el modelo de la tabla
	DefaultTableModel modeloMiTabla;
	// Titulo columnas		
	String columnas[]= {"Cedula","Nombre","Apellido","Fecha de Nacimiento","Email","Telefono"};
	//Columnas
	Object filas[]= new Object[6];
	// para que no sea editable la JTable
	modeloMiTabla= new DefaultTableModel(null, columnas) {
		public boolean isCellEditable(int row, int column) {
			return false;}
	};
		
	String consulta="select ci_cliente,nombre_cliente,apellido_cliente,fechaNacimiento_cliente,email_cliente,Telefono_cliente from clientes where nombre_cliente like '"+nombre.getText()+"%';";
	try {
	
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		resultado = sentencia.executeQuery(consulta);
		while (resultado.next()) {
			for ( int i=0;i<filas.length;i++){
				filas[i] = resultado.getObject(i+1); 

			} 
			modeloMiTabla.addRow(filas);
 		}
		// Cierra la Base de Datos
		
		conexion.close();
		tabla.setModel(modeloMiTabla);
		modeloMiTabla.removeTableModelListener(tabla);
	} catch (SQLException e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null,e.getMessage());
	}
	return tabla;
}

public static JTable cargarJTableConsultaTerreno(JTable tabla, JTextField padron) {

	// Declaro el modelo de la tabla
	DefaultTableModel modeloMiTabla;
	// Titulo columnas		
	String columnas[]= {"Padron","Departamento","Calle","Numero de Puerta","Tamanio","Valor en DLRS","Servicos"};
	//Columnas
	Object filas[]= new Object[7];
	// para que no sea editable la JTable
	modeloMiTabla= new DefaultTableModel(null, columnas) {
		public boolean isCellEditable(int row, int column) {
			return false;}
	};
		
	String consulta="select i.padron_inmueble,i.departamento_inmueble,i.calle_inmueble,i.numeroPuerta_inmueble,t.tamanio_terreno,i.valor_inmueble,ts.servicios__terreno_servicios from inmueble as i inner join terreno as t \r\n"
			+ "on i.padron_inmueble = t.padron_terreno inner join terreno_servicios as ts on i.padron_inmueble=ts.padron_terreno_servicios where  i.padron_inmueble like '"+Integer.parseInt(padron.getText())+"%';";
	try {
	
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		resultado = sentencia.executeQuery(consulta);
		while (resultado.next()) {
			for ( int i=0;i<filas.length;i++){
				filas[i] = resultado.getObject(i+1); 

			} 
			modeloMiTabla.addRow(filas);
 		}
		// Cierra la Base de Datos
		
		conexion.close();
		tabla.setModel(modeloMiTabla);
		modeloMiTabla.removeTableModelListener(tabla);
	} catch (SQLException e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null,e.getMessage());
	}
	return tabla;
	
}


public static JTable cargarJTableConsultaHabitable(JTable tabla, JTextField padron) {

	// Declaro el modelo de la tabla
	DefaultTableModel modeloMiTabla;
	// Titulo columnas		
	String columnas[]= {"Padron","Tipo de Inmueble","Tamanio","Cuarto","Banios","Departamento","Calle","NPuerta","Precio DLRS","Otros Cuartos","Comodidades"};
	//Columnas
	Object filas[]= new Object[11];
	// para que no sea editable la JTable
	modeloMiTabla= new DefaultTableModel(null, columnas) {
		public boolean isCellEditable(int row, int column) {
			return false;}
	};
		
	String consulta="SELECT \r\n"
			+ "    i.padron_inmueble, \r\n"
			+ "    h.tipo_habitable, \r\n"
			+ "    h.tamanio_habitable, \r\n"
			+ "    h.cantHabitaciones_habitable, \r\n"
			+ "    h.cantBanios_habitable,\r\n"
			+ "    i.departamento_inmueble, \r\n"
			+ "    i.calle_inmueble, \r\n"
			+ "    i.numeroPuerta_inmueble, \r\n"
			+ "    i.valor_inmueble,\r\n"
			+ "    GROUP_CONCAT(DISTINCT ho.otrasHabitacioneshabitable_otrasHabitaciones) AS otrasHabitacioneshabitable_otrasHabitaciones,\r\n"
			+ "    GROUP_CONCAT(DISTINCT hc.comodidades_habitable) AS comodidades_habitable\r\n"
			+ "FROM inmueble AS i\r\n"
			+ "INNER JOIN habitable AS h ON i.padron_inmueble = h.padron_habitable\r\n"
			+ "LEFT JOIN habitable_otrasHabitaciones AS ho ON i.padron_inmueble = ho.padron_habitable_otrasHabitaciones\r\n"
			+ "LEFT JOIN habitable_Comodidades AS hc ON i.padron_inmueble = hc.padron_habitables\r\n"
			+ "WHERE i.padron_inmueble LIKE '"+Integer.parseInt(padron.getText())+"%'\r\n"
			+ "GROUP BY i.padron_inmueble, h.tipo_habitable, h.tamanio_habitable, h.cantHabitaciones_habitable, h.cantBanios_habitable,\r\n"
			+ "    i.departamento_inmueble, i.calle_inmueble, i.numeroPuerta_inmueble, i.valor_inmueble;\r\n"
			+ "";
			
	try {
	
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		resultado = sentencia.executeQuery(consulta);
		while (resultado.next()) {
			for ( int i=0;i<filas.length;i++){
				filas[i] = resultado.getObject(i+1); 

			} 
			modeloMiTabla.addRow(filas);
 		}
		// Cierra la Base de Datos
		
		conexion.close();
		tabla.setModel(modeloMiTabla);
		modeloMiTabla.removeTableModelListener(tabla);
	} catch (SQLException e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null,e.getMessage());
	}
	return tabla;
	
}

public static JTable cargarJTableContratoCompra(JTable tabla, JTextField codigo) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Codigo Contrato","Padron","Cedula Del Comprador","Fecha Del Contrato","Descripcion","Estado"};
		//Columnas
		Object filas[]= new Object[6];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta="select numero_contrato_compra,padron_Inmueble_Vender,ci_comprador,fecha_contrato_compra,descripcion_contrato_compra,estado_contrato_compra "
				+ "from contrato_compra where numero_contrato_compra like '"+Integer.parseInt(codigo.getText())+"%';";
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}

public static JTable cargarJTableContratoAlquiler(JTable tabla, JTextField codigo) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Codigo Contrato","Padron","Cedula del inquilino","Precio Menusal","estado","garantia","Fecha Inicio","Fecha Fin"};
		//Columnas
		Object filas[]= new Object[8];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta=" select * from contrato_alquiler where numero_contrato_alquiler like '"+Integer.parseInt(codigo.getText())+"%';";
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}
public static void ingresarContratoCompra(JTextField numContrato ,JTextField padron, JTextField ciComprador,JTextField anio,JTextField mes ,JTextField dia , JTextField descripcion ) {
	try {
		String consulta = "insert into contrato_compra values ("+Integer.parseInt(numContrato.getText())+","+Integer.parseInt(padron.getText())+","
				+ ""+Integer.parseInt(ciComprador.getText())+",'"+Integer.parseInt(anio.getText())+"-"+Integer.parseInt(mes.getText())+"-"+
				Integer.parseInt(dia.getText())+"','pendiente','"+descripcion.getText()+"');";
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		sentencia.executeUpdate(consulta);
		conexion.close();
		JOptionPane.showMessageDialog(null,"Contrato Creado con Exito");
	}catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Aviso, El inmueble o el usuario no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
	} 
	catch (Exception e) {
		JOptionPane.showMessageDialog(null,"Aviso, El inmueble o el usuario no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
	}
	
}

public static void ingresarContratoAlquiler(JTextField numContrato,JTextField padron,JTextField ciInquilino,JTextField precio,JTextField Garantia,
		JTextField anioInicio,JTextField mesInicio, JTextField diaInicio,JTextField anioFinal, JTextField mesFinal,JTextField diaFinal) {
	try {
		String consulta = " insert into  contrato_alquiler values ("+Integer.parseInt(numContrato.getText())+","+Integer.parseInt(padron.getText())+","+Integer.parseInt(ciInquilino.getText())+","
				+ ""+Integer.parseInt(precio.getText())+",'pendiente','"+Garantia.getText()+"','"+Integer.parseInt(anioInicio.getText())+"-"+Integer.parseInt(mesInicio.getText())+"-"+Integer.parseInt(diaInicio.getText())+"',"
						+ "'"+Integer.parseInt(anioFinal.getText())+"-"+Integer.parseInt(mesFinal.getText())+"-"+Integer.parseInt(diaFinal.getText())+"');";
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		sentencia.executeUpdate(consulta);
		conexion.close();
	}catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Aviso, El inmueble o el usuario no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(null,"Aviso, El inmueble o el usuario no esta registrado","Aviso",JOptionPane.WARNING_MESSAGE);
	}
}

public static void confirmarContrato(int tipo,JTextField codigo) {
	String consulta="";
	if(tipo==1) {
		consulta = "update contrato_alquiler set estado_contrato_alquiler='Confirmado' where numero_contrato_alquiler="+Integer.parseInt(codigo.getText())+";";
	}else {
		 consulta = "update contrato_compra set estado_contrato_compra='Confirmado' where numero_contrato_compra = "+Integer.parseInt(codigo.getText())+";";
	}
	try {
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		sentencia.executeUpdate(consulta);
		conexion.close();
		JOptionPane.showMessageDialog(null, "Se ha confirmado el contrato:"+codigo.getText());
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,e.getMessage());
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(null,e.getMessage());
	}
}
public static void rechazarContrato(int tipo,JTextField codigo) {
	String consulta=""; 
	if(tipo==1) {
		consulta = "delete from contrato_alquiler where numero_contrato_alquiler = "+Integer.parseInt(codigo.getText())+" and estado_contrato_alquiler = 'pendiente';";
	}else {
		 consulta = "delete from contrato_compra where numero_contrato_compra = "+Integer.parseInt(codigo.getText())+" and estado_contrato_compra = 'pendiente';";
	}
	try {
		conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
		sentencia = conexion.createStatement();
		sentencia.executeUpdate(consulta);
		conexion.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage()); 
	}
	catch (Exception e) {
		System.out.println(e.getMessage()); 
	}
}

public static JTable verTablaClientes(JTable tabla) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Cedula","Nombre","Apellido","Fecha de Nacimiento","Email","Telefono"};
		//Columnas
		Object filas[]= new Object[6];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta=" select ci_cliente,nombre_cliente,apellido_cliente,fechaNacimiento_cliente,email_cliente,Telefono_cliente from clientes;";
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}

public static JTable verTablahabitable(JTable tabla) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Padron","Tipo de Inmueble","Tamanio","Cuarto","Banios","Departamento","Calle","NPuerta","Precio DLRS","Otros Cuartos","Comodidades"};
		
		//Columnas
		Object filas[]= new Object[11];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta="SELECT \r\n"
				+ "    i.padron_inmueble, \r\n"
				+ "    h.tipo_habitable, \r\n"
				+ "    h.tamanio_habitable, \r\n"
				+ "    h.cantHabitaciones_habitable, \r\n"
				+ "    h.cantBanios_habitable,\r\n"
				+ "    i.departamento_inmueble, \r\n"
				+ "    i.calle_inmueble, \r\n"
				+ "    i.numeroPuerta_inmueble, \r\n"
				+ "    i.valor_inmueble,\r\n"
				+ "    GROUP_CONCAT(DISTINCT ho.otrasHabitacioneshabitable_otrasHabitaciones) AS otrasHabitacioneshabitable_otrasHabitaciones,\r\n"
				+ "    GROUP_CONCAT(DISTINCT hc.comodidades_habitable) AS comodidades_habitable\r\n"
				+ "FROM inmueble AS i\r\n"
				+ "INNER JOIN habitable AS h ON i.padron_inmueble = h.padron_habitable\r\n"
				+ "LEFT JOIN habitable_otrasHabitaciones AS ho ON i.padron_inmueble = ho.padron_habitable_otrasHabitaciones\r\n"
				+ "LEFT JOIN habitable_Comodidades AS hc ON i.padron_inmueble = hc.padron_habitables\r\n"
				+ "GROUP BY i.padron_inmueble, h.tipo_habitable, h.tamanio_habitable, h.cantHabitaciones_habitable, h.cantBanios_habitable,\r\n"
				+ "    i.departamento_inmueble, i.calle_inmueble, i.numeroPuerta_inmueble, i.valor_inmueble;";
				
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}
public static JTable verTablaTerreno(JTable tabla) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Padron","Departamento","Calle","Numero de puerta","Tamanio","Valor DLRS","Servicios"};
		//Columnas
		Object filas[]= new Object[7];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta="select i.padron_inmueble,i.departamento_inmueble,i.calle_inmueble,i.numeroPuerta_inmueble,t.tamanio_terreno,i.valor_inmueble,ts.servicios__terreno_servicios from inmueble as i inner join terreno as t on i.padron_inmueble = t.padron_terreno\r\n"
				+ "inner join terreno_servicios as ts on ts.padron_terreno_servicios = i.padron_inmueble;";
				
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}

public static JTable contratoCompra(JTable tabla) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Codigo Contrato","Padron","Cedula Del Comprador","Fecha Del Contrato","Descripcion","Estado"};
		//Columnas
		Object filas[]= new Object[6];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta="select numero_contrato_compra,padron_Inmueble_Vender,ci_comprador,fecha_contrato_compra,descripcion_contrato_compra,estado_contrato_compra from contrato_compra;";
				
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}
public static JTable contratoAlquiler(JTable tabla) {
	// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		// Titulo columnas		
		String columnas[]= {"Codigo Contrato","Padron","CI Inquilino","Precio Mensual","Garantia","Fecha inicio","fecha fin","Estado"};
		//Columnas
		Object filas[]= new Object[8];
		// para que no sea editable la JTable
		modeloMiTabla= new DefaultTableModel(null, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;}
		};
			
		String consulta="select numero_contrato_alquiler,padron_Inmueble_rentado,ci_inquilino,precioMensual_contrato_alquiler,garantia_inquilino,fechaInicio_contrato_alquiler,fechaFinal_contrato_alquiler,estado_contrato_alquiler from contrato_alquiler;";
				
				
		try {
		
			conexion= DriverManager.getConnection(RUTABASEDATOS,USUARIO,CLAVE);
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(consulta);
			while (resultado.next()) {
				for ( int i=0;i<filas.length;i++){
					filas[i] = resultado.getObject(i+1); 

				} 
				modeloMiTabla.addRow(filas);
	 		}
			// Cierra la Base de Datos
			
			conexion.close();
			tabla.setModel(modeloMiTabla);
			modeloMiTabla.removeTableModelListener(tabla);
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return tabla;
}

}