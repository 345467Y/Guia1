package Actividad1;
import java.util.Date;
import java.util.List;
    public class Profesor extends Persona {
        private String profesion;
        private String nacionalidad;
        private double sueldo;
        private Facultad facultad;

        public Profesor(String cedula, String nombre, Date fechaNacimiento, LugarNacimiento lugarNacimiento,
                        String profesion, String nacionalidad, double sueldo) {
            super(cedula, nombre, fechaNacimiento, lugarNacimiento);
            this.profesion = profesion;
            this.nacionalidad = nacionalidad;
            this.sueldo = sueldo;
        }

    }

