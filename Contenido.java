public class Contenido {
        private String titulo;
        private String genero;

        public Contenido(String titulo, String genero) {
            this.titulo = titulo;
            this.genero = genero;
        }

        public String getTitulo() {
            return titulo;
        }

        public String toString() {
            return titulo + " (" + genero + ")";
        }
    }

