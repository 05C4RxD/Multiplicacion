import java.util.Scanner;
class Multiplicacion {
    int a, b;

    Multiplicacion() {
        System.out.println("SE ESTA CONSTRUYENDO LA MULTIPLICACIÓN");
    }

    public void multA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        a = scanner.nextInt();
    }

    public void multB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el segundo numero: ");
        b = scanner.nextInt();
    }

    public void mostrarResultado() {
        System.out.println("El resultado es: " + (a * b));
    }
}