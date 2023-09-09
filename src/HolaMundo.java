public class HolaMundo {
    //final hacce que el valor no sea reasignable
    static  final String VALOR_STRING = "kenny";
    static String nameClass = "HolaMUndo";
    public String nombre;
    public String apellido;
    HolaMundo(){
        System.out.println("construyendo objeto");
    }
    public String getNombre() {
        return nombre;
    }
    public String showName() {
        return this.nombre + " " +this.apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*
    sout shortcut print output
    main genera el metodo de abajo
    * */
    /*public static void main(String[] args) {
        System.out.println("hola kenny");
    }*/

}
