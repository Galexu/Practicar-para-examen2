import java.util.Scanner;

public class aaaaaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int num;
        String texto;
        boolean primo;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion dame numero elegida.");
                    break;
                case 2:
                    System.out.println("Opcion tabla multiplicar elegida.");
                    break;
                case 3:
                    System.out.println("Opcion dame texto elegida.");
                    break;
                case 4:
                    System.out.println("Opcion saluda elegida.");
                    break;
                case 5:
                    System.out.println("Opcion es primo elegida.");
                    break;
                case 6:
                    System.out.println("Opcion n enteros elegida");
                    break;
                case 7:
                    System.out.println("Opcion suma enteros elegida");
                    break;
                case 8:
                    System.out.println("Opcion multiplicacion enteros elegida");
                    break;
                case 9:
                    System.out.println("Opcion potencia elegida");
                    break;
                case 10:
                    System.out.println("Opcion piramide elegida");
                    break;
                case 11:
                    System.out.println("Has salido.");
                    break;
            }
        } while (opcion != 11);
    }

    public static int dameNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int menu() {
        int opcion;
        do {
            System.out.println("Elige una opcion del menu");
            System.out.println("1. Dame numero.");
            System.out.println("2. Tabla multiplicar.");
            System.out.println("3. Dame texto.");
            System.out.println("4. Saluda.");
            System.out.println("5. Es primo");
            System.out.println("6. N enteros Primo");
            System.out.println("7. Suma enteros");
            System.out.println("8. Multiplicacion enteros");
            System.out.println("9. Potencia");
            System.out.println("10. Piramide");
            System.out.println("11. Salir.");
            opcion = dameNum();
        } while (opcion < 1 || opcion > 11);
        return opcion;
    }
}
