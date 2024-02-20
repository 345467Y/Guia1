package Actividad1;
import java.util.Date;
import java.util.List;
    public class Facultad {
        private String nombre;
        private int codigo;
        private List<Profesor> profesores;
        private List<Carrera> carreras;

        public Facultad(String nombre, int codigo) {
            this.nombre = nombre;
            this.codigo = codigo;
        }
    }

