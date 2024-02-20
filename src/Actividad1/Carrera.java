package Actividad1;
import java.util.Date;
import java.util.List;
    public class Carrera {
        private String nombre;
        private int creditosTotales;
        private int numSemestres;
        private NivelCarrera nivel;
        private Facultad facultad;
        private List<Estudiante> estudiantes;
        private List<Curso> cursos;

        public Carrera(String nombre, int creditosTotales, int numSemestres, NivelCarrera nivel) {
            this.nombre = nombre;
            this.creditosTotales = creditosTotales;
            this.numSemestres = numSemestres;
            this.nivel = nivel;
        }

    }


