import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        System.out.println("**** aplicacion calculadora ****");
        Scanner consola = new Scanner(System.in);

        //Mostrar menu de calculadora y leer opcion
        while (true) {

            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                System.out.println("operacion a realizar");

                if (operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, consola);

                } else if (operacion >= 5) {
                    System.out.println("salir");
                    break;
                } else {
                    System.out.println("opcion no valida");
                }
            } catch (Exception e) {
                System.out.println("error " + e.getMessage());
            }
        }// end while
        System.out.println("termina programa");
    }// end main
    private static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
    }// end mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Proporciona valor operando uno");
        var operando1 = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona valor operando dos");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1:
                resultado = operando1 + operando2;
                System.out.println("resultado = " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("resultado = " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("resultado = " + resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                System.out.println("resultado = " + resultado);
                break;
            default:
                System.out.println("opcion no valida");
                break;

        }
    }

}// end class
