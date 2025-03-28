package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
//o tmb ec.edu.ups.poo.clases.*; importatodo
public class Principal {

    public static void main(String[] args){

        Persona personita = new Persona();
        personita.setCedula("0101");
        personita.setNombre("Juan");
        personita.setApellido("Perez");
        personita.setDireccion("Av de la dasdasd");
        Scanner sc = new Scanner(System.in);
//        System.out.println(persona1.toString());

        System.out.println("Ingrese la cantidad de personas que desea guardar: ");
        int cantidadPersonas = sc.nextInt();
        System.out.println("Ingrese la cantidad de familiares que desea guardar: ");
        int cantidadFamiliares = sc.nextInt();

        Familiar[] familiares = new Familiar[cantidadFamiliares];
        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i<cantidadPersonas; i++){
            
            Persona persona = new Persona();  // o tmb ec.edu.ups.poo.Persona
            System.out.println("///////////////////////");
            System.out.println("Ingrese los datos de la Persona nro " + (i+1) + " :");
            System.out.println("El número de cédula: ");
            String cedula = sc.next();
            sc.nextLine();
            System.out.println("El nombre: ");
            String nombre = sc.next();
            sc.nextLine();
            System.out.println("El apellido: ");
            String apellido = sc.next();
            sc.nextLine();
            System.out.println("La direccion: ");
            String direccion = sc.nextLine();

            persona.setCedula(cedula);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDireccion(direccion);

            personas[i] = persona;
        }

        //Familiares

        for (int i = 0; i<cantidadFamiliares; i++){

            Familiar familiar = new Familiar();
            System.out.println("///////////////////////");
            System.out.println("Ingrese los datos del familiar nro " + (i+1) + " :");
            System.out.println("El número de cédula: ");
            String cedula = sc.next();
            sc.nextLine();
            System.out.println("El nombre: ");
            String nombre = sc.next();
            sc.nextLine();
            System.out.println("El apellido: ");
            String apellido = sc.next();
            sc.nextLine();
            System.out.println("La direccion: ");
            String direccion = sc.nextLine();
            System.out.println("El parentesco: ");
            String parentesco = sc.next();
            sc.nextLine();
            System.out.println("El tipo de sangre: ");
            String tipoDeSangre = sc.next();
            sc.nextLine();
            System.out.println("Ingrese la fecha de nacimiento (primero el año, después el mes y por último el día): ");

            int año = 0;
            int mes = 0;
            int dia = 0;
            año = sc.nextInt();
            mes = sc.nextInt();
            dia = sc.nextInt();

            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(año, mes-1,dia);
            familiar.setFechaDeNacimiento(gregorianCalendar);


            familiar.setCedula(cedula);
            familiar.setNombre(nombre);
            familiar.setApellido(apellido);
            familiar.setDireccion(direccion);
            familiar.setParentestco(parentesco);
            familiar.setTipoDeSangre(tipoDeSangre);

            familiares[i] = familiar;
        }

        //Imprimir

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("///////////////////");
            System.out.println("Datos de la persona nro" + (i+1) + " :");
            System.out.println(personas[i].toString());
        }
        for (int i = 0; i < cantidadFamiliares; i++) {
            System.out.println("///////////////////");
            System.out.println("Datos del familiar nro" + (i+1) + " :");
            System.out.println(familiares[i].toString());
        }
    }
}
