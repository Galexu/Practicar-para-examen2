import java.util.Scanner;

public class ForAnidado {
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
                    num = dameNumero();
                    System.out.println("Numnero dado: " + num);
                    break;
                case 2:
                    System.out.println("Opcion tabla multiplicar elegida.");
                    tablaMultiplicar(dameNumero());
                    break;
                case 3:
                    System.out.println("Opcion dame texto elegida.");
                    texto = dameTexto();
                    System.out.println("Texto elegido: " + texto);
                    break;
                case 4:
                    System.out.println("Opcion saluda elegida.");
                    saluda(dameTexto(), dameNumero());
                    break;
                case 5:
                    System.out.println("Opcion es primo elegida.");
                    primo = esPrimo(dameNumero());
                    System.out.println(primo);
                    break;
                case 6:
                    System.out.println("Has salido.");
                    break;
            }
        } while (opcion != 6);

//        System.out.println("Di la altura");
//        int altura = sc.nextInt();
//        System.out.println("Di la anchura");
//        int anchura = sc.nextInt();
//        for (int i = 1; i <= altura; i++) {
//            for (int j = 1; j <= anchura; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//        System.out.println("Di un numero");
//        int numero = sc.nextInt();
//        for (int i = 1; i <= numero; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= numero; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= numero; i++) {
//            for (int j = i; j > 0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= numero; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j % 2 == 0) {
//                    System.out.print("+");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//        int numMultiplicar = 1;
//        while (numMultiplicar != 0) {
//            System.out.println("Di un numero para mostrar su tabla de multiplicar, intruduce 0 para terminar");
//            numMultiplicar = sc.nextInt();
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(numMultiplicar + " x " + i + " = " + (numMultiplicar * i));
//            }
//        }

//        System.out.println("introduce numero");
//        int num = sc.nextInt();
//        boolean primo = true;
//        for (int i = 2; i <= num -1; i++) {
//            if (num % i == 0) {
//                primo = false;
//                break;
//            }
//        }
//        if (primo) {
//            System.out.println("Es primo");
//        } else {
//            System.out.println("No es primo");
//        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una opcion del menu");
            System.out.println("1. Dame numero.");
            System.out.println("2. Tabla multiplicar.");
            System.out.println("3. Dame texto.");
            System.out.println("4. Saluda.");
            System.out.println("5. Es primo");
            System.out.println("6. Salir.");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 5);
        return opcion;
    }

    public static int dameNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        return sc.nextInt();
    }

    public static void tablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static String dameTexto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame texto");
        return sc.nextLine();
    }

    public static void saluda(String texto, int num) {
        for (int i = 1; i <= num; i++){
            System.out.println(texto);
        }
    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i <= num - 1;i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}

