package Actividad1;
import java.util.Date;
import java.util.List;
    public class Universidad {
        private String nombre;
        private String nombreRector;
        private String ciudad;
        private List<Facultad> facultades;

        public Universidad(String nombre, String nombreRector, String ciudad) {
            this.nombre = nombre;
            this.nombreRector = nombreRector;
            this.ciudad = ciudad;
        }

    }

