import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        byte tabla, val1 = 1, val2 = 1;

        System.out.println("Hasta que tabla desea multiplicar?");
        tabla = scan.nextByte();
        while (tabla <= 0) {
            System.out.println("NO PUEDE SER MENOR O IGUAL CERO.");
            System.out.println("Vuelva a ingresar el numero: ");
            tabla = scan.nextByte();
        }
       
        while (val1 <= tabla) {
            System.out.println("::::::::::::::::");
            System.out.println("Tabla del "+ val1);
            System.out.println("::::::::::::::::");

            while (val2 <= 10) {
                System.out.println(val1 + " x " + val2 + " = " + val1*val2);
                val2++;
            }

            val1++;
            val2 = 1;

        }
        scan.close();
    }
}
