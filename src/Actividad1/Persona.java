package Actividad1;
import java.util.Date;
import java.util.List;
public abstract class Persona {
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
    private LugarNacimiento lugarNacimiento;

    public Persona(String cedula, String nombre, Date fechaNacimiento, LugarNacimiento lugarNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }
}


