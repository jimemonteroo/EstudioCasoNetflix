import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaNetflix sistema = new SistemaNetflix();

        // Datos iniciales
        sistema.agregarContenido(new Contenido("Stranger Things", "Sci-Fi"));
        sistema.agregarContenido(new Contenido("Breaking Bad", "Drama"));
        sistema.agregarContenido(new Contenido("Narcos", "Acción"));

        sistema.agregarUsuario("user1", new Usuario("Juan"));

        int opcion;

        do {
            System.out.println("\n--- NETFLIX ---");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Ver contenido");
            System.out.println("3. Ver historial");
            System.out.println("4. Último visto");
            System.out.println("5. Procesar cola");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sistema.mostrarCatalogo();
                    break;

                case 2:
                    sistema.mostrarCatalogo();
                    System.out.print("Seleccione: ");
                    int i = sc.nextInt();
                    sistema.reproducir("user1", i);
                    break;

                case 3:
                    sistema.getUsuario("user1").mostrarHistorial();
                    break;

                case 4:
                    sistema.getUsuario("user1").ultimoVisto();
                    break;

                case 5:
                    sistema.procesarCola();
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
