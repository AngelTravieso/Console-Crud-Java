package domain;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private String profesion;
    private static int contadorEmpleados;
    private int idEmpleado;
    
    private Empleado() {
        ++Empleado.contadorEmpleados;
    }

    public Empleado(String nombre, String apellido, int edad, String profesion) {
        this.idEmpleado = Empleado.contadorEmpleados;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
    }
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

}
