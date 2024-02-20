package Actividad1;
import java.util.Date;
import java.util.List;
    public class Estudiante extends Persona {
        private String colegioBachillerato;
        private Date fechaIngreso;
        private List<Carrera> carreras;
        private List<Curso> cursosInscritos;

        public Estudiante(String cedula, String nombre, Date fechaNacimiento, LugarNacimiento lugarNacimiento,
                          String colegioBachillerato, Date fechaIngreso) {
            super(cedula, nombre, fechaNacimiento, lugarNacimiento);
            this.colegioBachillerato = colegioBachillerato;
            this.fechaIngreso = fechaIngreso;
        }
    }

