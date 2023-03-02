import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Hello world!");
        HolaMundo newHolaMundo = new HolaMundo();
        newHolaMundo.nombre = "kenny";
        newHolaMundo.apellido = "molina";
        int value = 12;
        System.out.println(value);
        System.out.println(newHolaMundo);
        System.out.println(Math.sqrt(4));
    }
}