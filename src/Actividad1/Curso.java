package Actividad1;
import java.util.Date;
import java.util.List;
    public class Curso {
        private int codigo;
        private String nombre;
        private int creditos;
        private int numSalon;
        private String nombreEdificio;
        private Carrera carrera;
        private List<Profesor> profesores;
        private List<Estudiante> estudiantesInscritos;

        public Curso(int codigo, String nombre, int creditos, int numSalon, String nombreEdificio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.creditos = creditos;
            this.numSalon = numSalon;
            this.nombreEdificio = nombreEdificio;
        }
    }

