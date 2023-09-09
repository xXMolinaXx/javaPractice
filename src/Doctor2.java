public class Doctor2 {
    private int id;
    private String nombre;
    private int codigo;
    private String identidad;

    public Doctor2() {
    }

    public Doctor2(String nombre, int codigo, String identidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.identidad = identidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }
}
