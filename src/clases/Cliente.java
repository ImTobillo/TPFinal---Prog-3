package clases;

public class Cliente extends Usuario{

	private boolean Vip;

	public Cliente(String nombre, String apellido, int edad, String dni, String nombreDeUsuario, String contraseņa) {
		
		super(nombre, apellido, edad, dni, nombreDeUsuario, contraseņa);
		
		Vip = false;
	}

	public void AsignarVIP()
	{
		Vip = true;
	}
	
	@Override
	public String toString() {
		
		String esVIP = "no";
		
		if (Vip==true)
		{
			esVIP="si";
		}
		
		return super.toString() + " Vip=" + esVIP;
	}

	
	
}
