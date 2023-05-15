import java.util.Scanner;

public class TiendaDiscosPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDiscos;
        Disco[] discos;
        double total = 0;

        System.out.println("Digite el número de discos: ");
        numeroDiscos = sc.nextInt();

        discos = new Disco[numeroDiscos];

        for (int i = 0; i < numeroDiscos; i++) {
            System.out.println("Digite los datos del disco " + (i + 1) + ":");
            discos[i] = crearDiscoDesdeEntrada(sc);
            total += discos[i].getPrecio();
        }

        double iva = total * 0.19;
        double totalConIva = total + iva;

        System.out.println("----------Factura de compra----------");
        for (int i = 0; i < numeroDiscos; i++) {
            System.out.println("Título: " + discos[i].getTitulo());
            System.out.println("Cantidad: 1");
            System.out.println("Precio unitario: " + discos[i].getPrecio());
            System.out.println("-------------------------------------");
        }

        System.out.println("Total: " + total);
        System.out.println("IVA (19%): " + iva);
        System.out.println("Total con IVA: " + totalConIva);
    }

    private static Disco crearDiscoDesdeEntrada(Scanner sc) {
        String titulo, artista, genero;
        double precio;

        System.out.println("Título: ");
        titulo = sc.next();
        System.out.println("Artista: ");
        artista = sc.next();
        System.out.println("Género: ");
        genero = sc.next();
        System.out.println("Precio: ");
        precio = sc.nextDouble();

        return new Disco(titulo, artista, genero, precio);
    }
}
