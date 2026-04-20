import java.util.LinkedList;
import java.util.Stack;

    public class Usuario {
        private String nombre;
        private LinkedList<Contenido> historial;
        private Stack<Contenido> pila;

        public Usuario(String nombre) {
            this.nombre = nombre;
            this.historial = new LinkedList<>();
            this.pila = new Stack<>();
        }

        public void verContenido(Contenido c) {
            historial.add(c);
            pila.push(c);
        }

        public void mostrarHistorial() {
            System.out.println("Historial:");
            for (Contenido c : historial) {
                System.out.println("- " + c);
            }
        }

        public void ultimoVisto() {
            if (!pila.isEmpty()) {
                System.out.println("Último visto: " + pila.peek());
            }
        }
    }

