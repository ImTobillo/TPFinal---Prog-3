package usuarios;

import java.io.Serializable;

public class Cliente extends Usuario{

	public Cliente(String nombre, String apellido, int edad, String dni, String nombreDeUsuario, String contraseņa) {
		super(nombre, apellido, edad, dni, nombreDeUsuario, contraseņa);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
