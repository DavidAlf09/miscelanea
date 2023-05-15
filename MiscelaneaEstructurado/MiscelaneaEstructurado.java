
/**
 * Write a description of class MiscelaneaEstructurado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MiscelaneaEstructurado
{
    public static void main(String[] args) {
        System.out.println("Bienvenid@ a nuestra miscelanea");
        System.out.println("Estos son algunos de nuestros principales productos");
        String[] productosM = {"1. Cartulina", "2. Papel contact", "3. Lapiz", "4. Esfero", "5. Tajalapiz"};
        int[] preciosM = {500, 2500, 1200, 1800, 1000};
        int[] cantidad = new int[50];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < productosM.length; i++) {
            System.out.println(productosM[i] + " - $" + preciosM[i]);
        }

        System.out.println("Digite el numero del producto que desea llevar // Pulse 0 para cancelar compra ");
        int opcion = scanner.nextInt();

        while (opcion != 0) {
            if (opcion < 1 || opcion > 5) {
                System.out.println("Lo sentimos, no tenemos ese producto en el momento. ");
                System.out.println("Digite el numero del producto que desea llevar // Pulse 0 para cancelar la compra ");
                opcion = scanner.nextInt();
                continue;
                }

            System.out.println("Ingrese la cantidad que desea comprar: ");
            int cantidadT = scanner.nextInt();

            cantidad[opcion - 1] += cantidadT;

            System.out.println("Si desea llevar mas productos, digite el numero del producto que desea llevar // Pulse 0 para generar su factura:  ");
            opcion = scanner.nextInt();
        }

        int total = 0;

        for (int i = 0; i < productosM.length; i++) {
            if (cantidad[i] > 0) {
                System.out.println(productosM[i] + " x " + cantidad[i] + "  $" + (preciosM[i] * cantidad[i]));
                total += preciosM[i] * cantidad[i];
            }
        }

        System.out.println("El total de su compra es: $" + total);
        System.out.println("Gracias por su compra, vuelva pronto");
}
    
}
