package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona{
    //en la herencia se hereda atributos y métodos
    //clase object es la clase padre más grande de java

    private String parentestco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar(){}

    public Familiar(String nombre, String cedula, String apellido, String direccion, String parentestco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(nombre, cedula, apellido, direccion); //super es igual a this. pero sirve para acceder a la clase padre
        this.parentestco = parentestco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentestco() {
        return parentestco;
    }

    public void setParentestco(String parentestco) {
        this.parentestco = parentestco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double calcularEdad(){

        double edad = 0;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Calendar hoy = Calendar.getInstance();
        Calendar fechaNacimiento = getFechaDeNacimiento();
        edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        /*es todo mayusculas porque las convenciones dicen que las constantes deben ir con MAYUCULAS*/
        return edad;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n\t Parentesco: " + parentestco +
                "\n\t Tipo de sange: " + tipoDeSangre +
                "\n\t Edad: " + calcularEdad();
    }

}
