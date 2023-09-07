import java.util.Scanner;

public class Main {
    /**
     *Descripcion: funcion ejemplo java doc
     *
     * @param a numero entero
     * @return no regresa nada
     * */
    public static  void funcsi (int a){
        System.out.println(a + 1);
        return;
    }
    public static void main(String[] args) {
        // declarando variables
        int speed = 0;
        System.out.println(speed);
        int salary = 1000;
        String nombre = "kenny";
        System.out.println(nombre);
        int  n= 1234567890;// solo puede usar 10 digitos
        // int  n= 12345678901; da error porque tiene 11 digitos
        // tipo de datos numericos,
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        // numeros con decimal
        float f = 1.1F;
        double d =1.1;
        // texto
        // para char es comilla simple y string comilla doble
        char c = 'a';
        boolean yes = true;
        boolean no = false;
        // nuevas vaiables de java

        var kenny = "kenny";
        double sqrv = Math.sqrt(2);
        System.out.println(sqrv);

        // casteo
        double monthlyDOgs = 30.0/12.0;
        int monthlyINt = (int) monthlyDOgs;
        System.out.println(monthlyINt);

        System.out.println("escribe en el teclado");
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
        funcsi(5);
    }
}