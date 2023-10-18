import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int x = pedirEnteroConExcepciones();
        System.out.println("x = " + x);
    }
    public static int pedirEnteroSinExcepciones(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
         lector.close();
        return lector.nextInt();
       
    }
    
    public static int pedirEnteroConValidaciones(){
        Scanner lector = new Scanner(System.in);
        boolean esValido = true;
        System.out.print("Ingrese un valor entero: ");
        String entrada = lector.next();
        for (int i = 0; i < entrada.length(); i++) {
            if (!Character.isDigit(entrada.charAt(i))) {
                esValido = false;
                break;
            }
        }
        if (esValido) {
             lector.close();
            return Integer.parseInt(entrada);
        }
        lector.close();
        return 0;
    }
    public static int pedirEnteroConExcepciones(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        try {
             lector.close();
            return lector.nextInt();

        } catch (InputMismatchException e) {
             lector.close();
            return 0;
        }
    }
}