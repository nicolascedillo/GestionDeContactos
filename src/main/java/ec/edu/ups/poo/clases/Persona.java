package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    //Construcciones
    //Con una entrada
    public Persona(String cedula) {
        this.cedula = cedula;
    }

    //Sin entradas
    public Persona() {
    }

    //Con 2 entradas
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Con entrada de todos los datos
    public Persona(String nombre, String cedula, String apellido, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    //Setter and getter
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString(){
        return "\tCedula: " + cedula +
                ",\n\tNombre: " + nombre +
                ",\n\tApellido: " + apellido +
                ",\n\tDireccion: " + direccion;
    }
    //hacer con arreglo de personas y uno de familiar super.toString() Simpledateform,
    // en clase familiar un metodo para calcular edad de la fecha actual en base a la fecha de nacimiento
}
