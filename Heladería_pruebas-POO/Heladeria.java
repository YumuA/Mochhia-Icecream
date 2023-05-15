
/**
 * Write a description of class Heladeria here.
 * El siguiente codigo funciona como una beta para la aplicación de pedidos en una heladería.
 * Permite al usuario autenticarse, seleccionar y comprar helados, y muestra el detalle de la compra.
 * Aplica un descuento si se compran más de 4 helados.
 * 
 * @author Kevin Santiago Rojas Rosas 
 * @version 1.0
 */
import java.util.Scanner;

public class Heladeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vale vale = new Vale(0, 0, 0.0, 0.0);
        String usr, contra;
        String usrcorrecto = "admin";
        String contracorrecta = "1234";
        double preciohelado = 1500;
        double descuento = 0.1;
        int opc, cantidad;
        double total;

        System.out.println("----Bienvenidos a Mochhia----");
        System.out.println("-----------------------------");

        boolean autenticado = false;

        while (!autenticado) {
            System.out.println("Digite su nombre de usuario: ");
            usr = sc.next();
            System.out.println("Digite su contraseña: ");
            contra = sc.next();

            if (usr.equals(usrcorrecto) && contra.equals(contracorrecta)) {
                autenticado = true;
            } else {
                System.out.println("Usuario y/o contraseña incorrectas");
            }
        }

        System.out.println("\nMenú de helados");
        System.out.println("-----------------");
        System.out.println("1. Helado de fresa");
        System.out.println("2. Helado de chocolate");
        System.out.println("3. Helado de nutella");
        System.out.println("-------------------");
        System.out.println("Selecciona tu helado a pedir");
        opc = sc.nextInt();
        System.out.println("Ingresa la cantidad a comprar");
        cantidad = sc.nextInt();
        total = preciohelado * cantidad;

        System.out.println("-----------------------------------");
        System.out.println("---Gracias por comprar en Mochaa---");
        System.out.println("Helado seleccionado: " + opc);
        System.out.println("Cantidad de helados: " + cantidad);
        System.out.println("Precio unitario: " + preciohelado);

        if (cantidad > 4) {
            total -= total * descuento;
            System.out.println("Descuento por compra mayor igual a 4: " + descuento * 100 + "%");
        } else {
            System.out.println("No aplica descuento");
        }

        System.out.println("Total a pagar: " + total);

        vale.heladoSeleccionado = opc;
        vale.cantidad = cantidad;
        vale.precioUnitario = preciohelado;
        vale.total = total;
    }
}
