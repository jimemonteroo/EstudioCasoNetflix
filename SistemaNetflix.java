import java.util.*;

public class SistemaNetflix {

    private HashMap<String, Usuario> usuarios;
    private ArrayList<Contenido> catalogo;
    private Queue<Contenido> cola;

    public SistemaNetflix() {
        usuarios = new HashMap<>();
        catalogo = new ArrayList<>();
        cola = new LinkedList<>();
    }

    public void agregarUsuario(String id, Usuario u) {
        usuarios.put(id, u);
    }

    public void agregarContenido(Contenido c) {
        catalogo.add(c);
    }

    public void mostrarCatalogo() {
        System.out.println("\nCatálogo:");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(i + ". " + catalogo.get(i));
        }
    }

    public void reproducir(String idUsuario, int index) {
        Usuario u = usuarios.get(idUsuario);
        Contenido c = catalogo.get(index);

        u.verContenido(c);
        cola.add(c);

        System.out.println("Reproduciendo: " + c);
    }

    public void procesarCola() {
        System.out.println("\nProcesando cola:");
        while (!cola.isEmpty()) {
            System.out.println("Streaming: " + cola.poll());
        }
    }

    public Usuario getUsuario(String id) {
        return usuarios.get(id);
    }
}
