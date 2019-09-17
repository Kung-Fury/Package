package ClasesCifoCom;

public class Program {
	public static void main(String args[]) {
		Empleados empleado;
		empleado = new Empleados("Alex","DNI12345 ", 3000);
		System.out.println("Empleado: " + empleado.getNombre());
		System.out.println("DNI: " + empleado.getDni());
		System.out.println("Sueldo: " + empleado.getSueldo());
	}
}	