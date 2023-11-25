package InmueblesITSDatos;

import java.awt.BorderLayout;
import java.net.Authenticator.RequestorType;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Datos {
	
	public static void cambiarJPanel (JPanel panel1, JPanel panel2) {
		panel1.removeAll();
		panel1.add(panel2);
		panel1.repaint();
		panel1.revalidate();
	}

	//Inicio de metodos para el login
	public static boolean validarTextFieldVacio(JTextField texto ) {	
		if(texto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ingrese su nombre de Usuario","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}else {
			return true;
		}
		
	}
	
	public static boolean validarPasswordField(JPasswordField Contraseña) {
		
		if(String.valueOf(Contraseña .getPassword()).isEmpty() ) {
			JOptionPane.showMessageDialog(null, "Ingrese su Contraseña","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}	
	else {
		return true;
	}
	}
	//Final de metodos para el login
	
	//Inicio de metodos para Modificar precio
	public static boolean validarModificacionPrecio(JTextField txt1) {
		
		if (!txt1.getText().isEmpty()) {
			if (txt1.getText().matches("[0-9]*")) {
               return true;
			} else {
				txt1.requestFocus();
				JOptionPane.showMessageDialog(null, "Error,El padron solo puede ser numerico ", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
		} else {
			txt1.requestFocus();
			JOptionPane.showMessageDialog(null, "Error, No ha ingresado el padron del Inmueble", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
	}
	//Finla de metodo para Modificar precio
	
	//Inicio de metodos Dar de baja Cliente
    public static boolean validaraDarBajaCliente(JTextField texto) {

	if (!texto.getText().isEmpty()) {
		if (texto.getText().matches("[0-9]*")) {
			return true;
		} else {
			texto.requestFocus();
			JOptionPane.showMessageDialog(null, "Error, la cedula debe ser numerica", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	} else {
		texto.requestFocus();
		JOptionPane.showMessageDialog(null, "Error, Ingrese la cedula del cliente", "Aviso",
				JOptionPane.WARNING_MESSAGE);
	}
	return false;
}
	//Finalizacion de metodo dar de baja Cliente
	
	//Inicio de metodos para Registrar Usuario
    public static  boolean ValidarRegistroUsuario (JTextField nom,JPasswordField Contraseña1,JPasswordField Contraseña2,JRadioButton btn1,JRadioButton btn2,JRadioButton btn3) {
    	
    	if (!nom.getText().isEmpty()) {
			if (!nom.getText().matches("[0-9]*")) {

				if (!String.valueOf(Contraseña1.getPassword()).isEmpty()
						&& !String.valueOf(Contraseña2.getPassword()).isEmpty()) {

					
					if(String.valueOf(Contraseña1.getPassword()).equals(String.valueOf(Contraseña2.getPassword()))) {
						
						if (btn1.isSelected() || btn2.isSelected() || btn3.isSelected()) {
	                         return true;
						} else {
							JOptionPane.showMessageDialog(null,
									"Error, Debe seleccionar el rango del usaurio a crear", "AVISO",
									JOptionPane.WARNING_MESSAGE);
						}
						
					}else {
						Contraseña2.requestFocus();
						JOptionPane.showMessageDialog(null, "Error, Las contrasenias no coinsiden","AVISO",
								JOptionPane.WARNING_MESSAGE);
					}

				} else {
					Contraseña1.requestFocus();
					JOptionPane.showMessageDialog(null,
							"Error, La contrasenia del usaurio no puede estar vacia", "AVISO",
							JOptionPane.WARNING_MESSAGE);
				}

			} else {
				nom.requestFocus();
				JOptionPane.showMessageDialog(null, "Error, el nombre del usaurio debe ser letras", "AVISO",
						JOptionPane.WARNING_MESSAGE);
			}
		} else {
			nom.requestFocus();
			JOptionPane.showMessageDialog(null, "Error, Porfavor ingrese el nombre del Usuario", "AVISO",
					JOptionPane.WARNING_MESSAGE);
		}
    	return false;
    }
	//Final de metodos para Registrar Usuario
    
    //Inicio metodos dar baja cliente
    public static boolean validarDarBajaInmueble(JTextField txt) {
    	if (!txt.getText().isEmpty()) {
			if (txt.getText().matches("[0-9]*")) {
               return true;
			} else {
				txt.requestFocus();
				JOptionPane.showMessageDialog(null, "Error, El padron debe ser numerico", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
		} else {
			txt.requestFocus();
			JOptionPane.showMessageDialog(null, "Error, No ha ingresado el padron del Inmueble", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
    	return false;
    }
    //Final metodo dar baja cliente
	
	//Inicio de metodos para Creacion de Cliente/Inmueble
    public static boolean ValidarCreacionUsuario1(JTextField CI,JTextField nom,JTextField ape,JTextField anio,JTextField mes,JTextField dia) {
		
		if(!CI.getText().isEmpty()) {
      	  if(CI.getText().matches("[0-9]*")) {
      		  if(!nom.getText().isEmpty()) {
      			  if(!nom.getText().matches("[0-9]*")) {
      				  if(!ape.getText().isEmpty()) {
      					  if(!ape.getText().matches("[0-9]*")) {
      						  if(!anio.getText().isEmpty()) {
      							  if(anio.getText().matches("[0-9]*")) {
      								  if(Integer.parseInt(anio.getText())>=1900 && Integer.parseInt(anio.getText())<= 2024) {
      									  if(!mes.getText().isEmpty()) {
      										  if(mes.getText().matches("[0-9]*")) {
      											  if(Integer.parseInt(mes.getText()) >=1 && Integer.parseInt(mes.getText()) <=12) {
      												  if(!dia.getText().isEmpty()) {
      													  if(dia.getText().matches("[0-9]*")) {
      														  if(Integer.parseInt(dia.getText()) > 0 && Integer.parseInt(dia.getText()) <=32) {
                                                                   return true;
      														  }else {
      															dia.requestFocus();
      															  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
      															  
      														  }
      													  }else {
      														dia.requestFocus();
      														  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
      													  }
      												  }else {
      													dia.requestFocus();
      													  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);  
      												  }
      											  }else {
      												mes.requestFocus();
      												  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
      											  }
      										  }else {
      											mes.requestFocus();
      											  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
      										  }
      									  }else {
      										mes.requestFocus();
      										  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE); 
      									  }
      								  }else {
      									anio.requestFocus();
      									  JOptionPane.showMessageDialog(null, "Error, el anio de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
      								  }
      							  }else {
      								anio.requestFocus();
      								  JOptionPane.showMessageDialog(null, "Error, el anio de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
      							  }
      						  }else {
      							anio.requestFocus();
      							  JOptionPane.showMessageDialog(null, "Error, El anio de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
      						  }
      					  }else {
      						ape.requestFocus();
      						  JOptionPane.showMessageDialog(null, "Error, El apellido del cliente no puede ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
          				  }
      				  }else {
      					ape.requestFocus();
      					  JOptionPane.showMessageDialog(null, "Error, El apellido del cliente no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
      				  }
      			  }else {
      				nom.requestFocus();
      				  JOptionPane.showMessageDialog(null, "Error, El nombre del cliente no puede ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
      			  }
      		  }else {
      			nom.requestFocus();
      			  JOptionPane.showMessageDialog(null, "Error, El nombre del cliente no puede esatr vacio","Aviso",JOptionPane.WARNING_MESSAGE);
      		  }
      	  }else {
      		  JOptionPane.showMessageDialog(null, "Error, La cedula del usaurio no puede ser letras","Aviso",JOptionPane.WARNING_MESSAGE);
      		CI.requestFocus();
      	  }
        }else {
      	  JOptionPane.showMessageDialog(null, "Error, La cedula del usuario no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
      	CI.requestFocus();
        }
		
		return false;
	}

	public static boolean ValidarCreacionUsuario2(JTextField email,JTextField telefono) {
		
		 if(!email.getText().isEmpty()) {
			 if(email.getText().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$")) {
			    if(!telefono.getText().isEmpty()) {
				   if(telefono.getText().matches("[0-9]*")) {
					   return true;
				      }else {
					JOptionPane.showMessageDialog(null, "Error, El telefono debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);	
				}   
                     }else {
	                    JOptionPane.showMessageDialog(null, "Error, El telefono no puede esatr vacio","Aviso",JOptionPane.WARNING_MESSAGE);	
			}
					}else {
						JOptionPane.showMessageDialog(null, "Error, Email Invalido","Aviso",JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Error, Debe ingresar el email","Aviso",JOptionPane.WARNING_MESSAGE);
				}
		return false;
	}
    
	 public static boolean ValidarModificacionUsuarios(JTextField CI,JTextField nom,JTextField ape,JTextField anio,JTextField mes,JTextField dia) {
			
			if(!CI.getText().isEmpty()) {
	      	  if(CI.getText().matches("[0-9]*")) {
	      		  if(!nom.getText().isEmpty()) {
	      			  if(!nom.getText().matches("[0-9]*")) {
	      				  if(!ape.getText().isEmpty()) {
	      					  if(!ape.getText().matches("[0-9]*")) {
	      						  if(!anio.getText().isEmpty()) {
	      							  if(anio.getText().matches("[0-9]*")) {
	      								  if(Integer.parseInt(anio.getText())>=1900 && Integer.parseInt(anio.getText())<= 2024) {
	      									  if(!mes.getText().isEmpty()) {
	      										  if(mes.getText().matches("[0-9]*")) {
	      											  if(Integer.parseInt(mes.getText()) >=1 && Integer.parseInt(mes.getText()) <=12) {
	      												  if(!dia.getText().isEmpty()) {
	      													  if(dia.getText().matches("[0-9]*")) {
	      														  if(Integer.parseInt(dia.getText()) > 0 && Integer.parseInt(dia.getText()) <=32) {
	                                                                   return true;
	      														  }else {
	      															dia.requestFocus();
	      															  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
	      															  
	      														  }
	      													  }else {
	      														dia.requestFocus();
	      														  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
	      													  }
	      												  }else {
	      													dia.requestFocus();
	      													  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);  
	      												  }
	      											  }else {
	      												mes.requestFocus();
	      												  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
	      											  }
	      										  }else {
	      											mes.requestFocus();
	      											  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
	      										  }
	      									  }else {
	      										mes.requestFocus();
	      										  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE); 
	      									  }
	      								  }else {
	      									anio.requestFocus();
	      									  JOptionPane.showMessageDialog(null, "Error, el anio de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
	      								  }
	      							  }else {
	      								anio.requestFocus();
	      								  JOptionPane.showMessageDialog(null, "Error, el anio de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
	      							  }
	      						  }else {
	      							anio.requestFocus();
	      							  JOptionPane.showMessageDialog(null, "Error, El anio de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
	      						  }
	      					  }else {
	      						ape.requestFocus();
	      						  JOptionPane.showMessageDialog(null, "Error, El apellido del cliente no puede ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
	          				  }
	      				  }else {
	      					ape.requestFocus();
	      					  JOptionPane.showMessageDialog(null, "Error, El apellido del cliente no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
	      				  }
	      			  }else {
	      				nom.requestFocus();
	      				  JOptionPane.showMessageDialog(null, "Error, El nombre del cliente no puede ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
	      			  }
	      		  }else {
	      			nom.requestFocus();
	      			  JOptionPane.showMessageDialog(null, "Error, El nombre del cliente no puede esatr vacio","Aviso",JOptionPane.WARNING_MESSAGE);
	      		  }
	      	  }else {
	      		  JOptionPane.showMessageDialog(null, "Error, La cedula del usaurio no puede ser letras","Aviso",JOptionPane.WARNING_MESSAGE);
	      		CI.requestFocus();
	      	  }
	        }else {
	      	  JOptionPane.showMessageDialog(null, "Error, La cedula del usuario no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
	      	CI.requestFocus();
	        }
			
			return false;
		}
	
	public static void LimpiarTextos(JTextField CI,JTextField nom,JTextField ape,JTextField anio,JTextField mes,JTextField dia,JTextField email,JTextField telefono) {
		CI.setText("");
		nom.setText("");
		ape.setText("");
		anio.setText("");
		mes.setText("");
		dia.setText("");
		email.setText("");
		telefono.setText("");
	}
	
	public static boolean ValidarCreacionInmueble1(JTextField ci,JTextField padron,JTextField depa,JTextField calle,JTextField puerta) {
		if(!ci.getText().isEmpty()) {
			if(ci.getText().matches("[0-9]*")) {
        if(!padron.getText().isEmpty()) {           	  
      	  if(padron.getText().matches("[0-9]*")) {
      		  if(!depa.getText().isEmpty()) {
      			  if(!depa.getText().matches("[0-9]*")) {
      				  if(!calle.getText().isEmpty()) {
      					  if(!puerta.getText().isEmpty()) {
      						  if(puerta.getText().matches("[0-9]*")) {
      							 return true;
      						  }else {
      							puerta.requestFocus();
      							  JOptionPane.showMessageDialog(null, "Error, El numero de puerta debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
      						  }
      					  }else {
      						puerta.requestFocus();
      						  JOptionPane.showMessageDialog(null, "Error, No ha ingresado el numero de puerta","Aviso",JOptionPane.WARNING_MESSAGE);  
      					  }
      					 
      				  }else {
      					calle.requestFocus();
      					  JOptionPane.showMessageDialog(null, "Error, No ha ingresado la calle del Inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
      				  }
      			  }else {
      				depa.requestFocus();
      				  JOptionPane.showMessageDialog(null, "Error, El Departamento debe ser letras","Aviso",JOptionPane.WARNING_MESSAGE);
      			  }
      		  }else {
      			depa.requestFocus();
      			  JOptionPane.showMessageDialog(null, "Error, Ingrese el departamento del Inmuebl","Aviso",JOptionPane.WARNING_MESSAGE);
      		  }
      	  }else {
      		padron.requestFocus();
      		  JOptionPane.showMessageDialog(null, "Error, El padron debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
      	  }
        }else {
        	padron.requestFocus();
      	  JOptionPane.showMessageDialog(null, "Error, Debe ingresar el padron del Inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
        }
		}else {
			JOptionPane.showMessageDialog(null, "Error, La cedula debe ser numerica","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		}else {
			JOptionPane.showMessageDialog(null, "Error, Debe ingresar la cedula del duenio","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		return false;
	}

	public static boolean ValidarCreacionInmueble2(JTextField valor,JTextField tamanio) {
		if(!valor.getText().isEmpty()) {
			if(valor.getText().matches("[0-9]*")) {
					if(!tamanio.getText().isEmpty()) {
						if(tamanio.getText().matches("[0-9]*")) {
							return true;
						}else {
							JOptionPane.showMessageDialog(null, "Error,El tamanio del terreno debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Error,Debe ingresar el tamanio del terreno","Aviso",JOptionPane.WARNING_MESSAGE);
					}				
			}else {
				JOptionPane.showMessageDialog(null, "Error,El valor del inmueble debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error,Debe ingresar el valor del Inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
		}		
		return false;
	}
	//Final de metodos para Creacion de Cliente/Inmueble
	
	//Inicio de metos para Modificar Cliente/Usuario
	public static boolean validarCedulaDeModificar(JTextField txt) {
		if(!txt.getText().isEmpty()){
			if(txt.getText().matches("[0-9]*")) {
				return true;
			}else {
				txt.requestFocus();
				JOptionPane.showMessageDialog(null, "Error,La cedula debe ser numerica","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}else {
			txt.requestFocus();
			JOptionPane.showMessageDialog(null, "Error,Ingrese la cedula a buscar","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		return false;
	}
	
	public static boolean validarPadronDeModificar(JTextField txt) {
		if(txt.getText().isEmpty()) {
			if(txt.getText().matches("[0-9]*")) {
				return true;
			}else {
				txt.requestFocus();
				JOptionPane.showMessageDialog(null, "Error, El padron debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}else {
			txt.requestFocus();
			JOptionPane.showMessageDialog(null, "Error, Debe ingresar el padron del Inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		return false;
	}
	//Final de metodos para Modificar Cliente/Usuario
	
	public static boolean validarModificacionInmueble(JTextField pad,JTextField depa , JTextField calle ,JTextField puerta) {
		
		if(!pad.getText().isEmpty()) {
			if(pad.getText().matches("[0-9]*")) {
				if(!depa.getText().isEmpty()) {
	      			  if(!depa.getText().matches("[0-9]*")) {
	      				  if(!calle.getText().isEmpty()) {
	      					  if(!puerta.getText().isEmpty()) {
	      						  if(puerta.getText().matches("[0-9]*")) {
	      							 return true;
	      						  }else {
	      							puerta.requestFocus();
	      							  JOptionPane.showMessageDialog(null, "Error, El numero de puerta debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
	      						  }
	      					  }else {
	      						puerta.requestFocus();
	      						  JOptionPane.showMessageDialog(null, "Error, No ha ingresado el numero de puerta","Aviso",JOptionPane.WARNING_MESSAGE);  
	      					  }
	      					 
	      				  }else {
	      					calle.requestFocus();
	      					  JOptionPane.showMessageDialog(null, "Error, No ha ingresado la calle del Inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
	      				  }
	      			  }else {
	      				depa.requestFocus();
	      				  JOptionPane.showMessageDialog(null, "Error, El Departamento debe ser letras","Aviso",JOptionPane.WARNING_MESSAGE);
	      			  }
	      		  }else {
	      			depa.requestFocus();
	      			  JOptionPane.showMessageDialog(null, "Error, Ingrese el departamento del Inmuebl","Aviso",JOptionPane.WARNING_MESSAGE);
	      		  }
				
			}else {
				JOptionPane.showMessageDialog(null, "Aviso,El padron debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aviso,Ingrese el padron del inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
		
	}
	
	public static boolean validarContrato(JTextField padron, JTextField ci) {
	
		if(!padron.getText().isEmpty()) {
			
			if(padron.getText().matches("[0-9]*")) {
				
				if(!ci.getText().isEmpty()) {
					if(ci.getText().matches("[0-9]*")) {
						
						return true;
						
					}else {
						JOptionPane.showMessageDialog(null, "Aviso,La cedula debe ser numerica ","Aviso",JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Aviso, La cedula no puede estar vacia","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Aviso, El padron debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aviso, Debe ingresar el padron del inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
		
	}
	
	public static boolean validarContratoRenta(JTextField anio,JTextField mes,JTextField dia) {
		
		if(!anio.getText().isEmpty()) {
			  if(anio.getText().matches("[0-9]*")) {
				  if(Integer.parseInt(anio.getText())>=1900 && Integer.parseInt(anio.getText())<= 2024) {
					  if(!mes.getText().isEmpty()) {
						  if(mes.getText().matches("[0-9]*")) {
							  if(Integer.parseInt(mes.getText()) >=1 && Integer.parseInt(mes.getText()) <=12) {
								  if(!dia.getText().isEmpty()) {
									  if(dia.getText().matches("[0-9]*")) {
										  if(Integer.parseInt(dia.getText()) > 0 && Integer.parseInt(dia.getText()) <=32) {
                                             return true;
										  }else {
											dia.requestFocus();
											  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
											  
										  }
									  }else {
										dia.requestFocus();
										  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
									  }
								  }else {
									dia.requestFocus();
									  JOptionPane.showMessageDialog(null, "Error, El dia de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);  
								  }
							  }else {
								mes.requestFocus();
								  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
							  }
						  }else {
							mes.requestFocus();
							  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
						  }
					  }else {
						mes.requestFocus();
						  JOptionPane.showMessageDialog(null, "Error, El mes de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE); 
					  }
				  }else {
					anio.requestFocus();
					  JOptionPane.showMessageDialog(null, "Error, el anio de nacimiento no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
				  }
			  }else {
				anio.requestFocus();
				  JOptionPane.showMessageDialog(null, "Error, el anio de nacimiento debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
			  }
		  }else {
			anio.requestFocus();
			  JOptionPane.showMessageDialog(null, "Error, El anio de nacimiento no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
		  }
		
		return false;
	}
	
	public static boolean validarContratoCompra2 (JTextField codigo,JTextField anio,JTextField mes,JTextField dia) {

		if(!codigo.getText().isEmpty()) {
			
			if(codigo.getText().matches("[0-9]*")) {
				
				if(!anio.getText().isEmpty()) {
					  if(anio.getText().matches("[0-9]*")) {
						  if(Integer.parseInt(anio.getText())>=1900 && Integer.parseInt(anio.getText())<= 2024) {
							  if(!mes.getText().isEmpty()) {
								  if(mes.getText().matches("[0-9]*")) {
									  if(Integer.parseInt(mes.getText()) >=1 && Integer.parseInt(mes.getText()) <=12) {
										  if(!dia.getText().isEmpty()) {
											  if(dia.getText().matches("[0-9]*")) {
												  if(Integer.parseInt(dia.getText()) > 0 && Integer.parseInt(dia.getText()) <=32) {
		                                             return true;
												  }else {
													dia.requestFocus();
													  JOptionPane.showMessageDialog(null, "Error, El dia del contrato no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
												  }
											  }else {
												dia.requestFocus();
												  JOptionPane.showMessageDialog(null, "Error, El dia debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
											  }
										  }else {
											dia.requestFocus();
											  JOptionPane.showMessageDialog(null, "Error, El dia no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);  
										  }
									  }else {
										mes.requestFocus();
										  JOptionPane.showMessageDialog(null, "Error, El mes no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
									  }
								  }else {
									mes.requestFocus();
									  JOptionPane.showMessageDialog(null, "Error, El mes debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
								  }
							  }else {
								mes.requestFocus();
								  JOptionPane.showMessageDialog(null, "Error, El mes no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE); 
							  }
						  }else {
							anio.requestFocus();
							  JOptionPane.showMessageDialog(null, "Error, el anio no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
						  }
					  }else {
						anio.requestFocus();
						  JOptionPane.showMessageDialog(null, "Error, el anio  debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
					  }
				  }else {
					anio.requestFocus();
					  JOptionPane.showMessageDialog(null, "Error, El anio no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
				  }
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Error,El codigo debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
				 
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Error, El codigo de contrato no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
		  }
		return false;
		}
		
	public static boolean validarFecha(JTextField anio,JTextField mes, JTextField dia) {
		
		if(!anio.getText().isEmpty()) {
			  if(anio.getText().matches("[0-9]*")) {
				  if(Integer.parseInt(anio.getText())>=1900 && Integer.parseInt(anio.getText())<= 2024) {
					  if(!mes.getText().isEmpty()) {
						  if(mes.getText().matches("[0-9]*")) {
							  if(Integer.parseInt(mes.getText()) >=1 && Integer.parseInt(mes.getText()) <=12) {
								  if(!dia.getText().isEmpty()) {
									  if(dia.getText().matches("[0-9]*")) {
										  if(Integer.parseInt(dia.getText()) > 0 && Integer.parseInt(dia.getText()) <=32) {
                                           return true;
										  }else {
											dia.requestFocus();
											  JOptionPane.showMessageDialog(null, "Error, El dia del contrato no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
										  }
									  }else {
										dia.requestFocus();
										  JOptionPane.showMessageDialog(null, "Error, El dia debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
									  }
								  }else {
									dia.requestFocus();
									  JOptionPane.showMessageDialog(null, "Error, El dia no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);  
								  }
							  }else {
								mes.requestFocus();
								  JOptionPane.showMessageDialog(null, "Error, El mes no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
							  }
						  }else {
							mes.requestFocus();
							  JOptionPane.showMessageDialog(null, "Error, El mes debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
						  }
					  }else {
						mes.requestFocus();
						  JOptionPane.showMessageDialog(null, "Error, El mes no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE); 
					  }
				  }else {
					anio.requestFocus();
					  JOptionPane.showMessageDialog(null, "Error, el anio no es valido","Aviso",JOptionPane.WARNING_MESSAGE);
				  }
			  }else {
				anio.requestFocus();
				  JOptionPane.showMessageDialog(null, "Error, el anio  debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
			  }
		  }else {
			anio.requestFocus();
			  JOptionPane.showMessageDialog(null, "Error, El anio no puede estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
		  }
		return false;
		
	  }		
	
	public static boolean validarEnteroCedula(JTextField txt) {
		
		if(txt.getText().length()<=10) {
			return true;
		}else {
			JOptionPane.showMessageDialog(null,"Aviso,La cedula no puede superar el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
	}
	
public static boolean validarEnteroPadron(JTextField txt) {
		
		if(txt.getText().length()<=10) {
			return true;
		}else {
			JOptionPane.showMessageDialog(null,"Aviso,El padron no puede superar el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
		}
		
		return false;
	}
	
	}


