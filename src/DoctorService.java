import java.util.Scanner;

public class DoctorService {
    public static void crearDoctor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el nombre del medico");
        String nombre = sc.nextLine();
        System.out.println("escribe el codigo del medico");
        int codigo = sc.nextInt();
        System.out.println("escribe el numero de identidad del medico");
        String identidad = sc.nextLine();
        Doctor2 doctor2 = new Doctor2(nombre,codigo,identidad);
        DoctorDAO.crearDoctor(doctor2);
    }
    public static void leerDoctor(){
        DoctorDAO.leerDocotor();
    }
    public static void eliminarDoctor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el id del doctor");
        int id = sc.nextInt();
        DoctorDAO.borrarDoctor(id);
    }
}
