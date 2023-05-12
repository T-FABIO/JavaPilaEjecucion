package javapilaejecucion;

public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin main");
    }

    private static void metodo1() {
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fin metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio metodo2");
        for (int i = 1; i <= 5; i++) {

            try {
                if (i == 3) {
                    System.out.println(i);
                    int num = 0;
                    int resultado = i / num;
                    System.out.println(resultado);
                }

            } catch (ArithmeticException exeption) {
                System.out.println(exeption.getMessage());
                exeption.printStackTrace();
            }

        }
        System.out.println("Fin metodo2");
    }

}
