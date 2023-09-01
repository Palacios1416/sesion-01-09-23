import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        byte val1, val2 = 1;
        System.out.println("Que tabla desea multiplicar?");
        val1 = scan.nextByte();
        while (val1 <= 0) {
            System.out.println("NO PUEDE SER MENOR O IGUAL CERO.");
            System.out.println("Vuelva a ingresar la tabla que desea multiplicar: ");
            val1 = scan.nextByte();
        }


        System.out.println("Tabla del "+val1);
        while (val2 <= 10) {
            System.out.println(val1 + " x " + val2 + " = " + val1*val2);
            val2++;

        }
        
       
       
    }
}
