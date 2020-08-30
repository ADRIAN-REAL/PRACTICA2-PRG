import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        //Controles
        Controles excelente = new Controles(1,"tocox");

        //Certificado
       Certificado certificado = new Certificado(1,"Tocox","Excelente",Calendar.getInstance().getTime(),20);


        System.out.println("Controles");
        System.out.println("--------");
        System.out.println("Id: "+ certificado.getIdCertificado());
        System.out.println("Nombre: "+ certificado.getNombre());
        System.out.println("Calidad: "+ certificado.getCalidad());
        System.out.println("Fecha: "+ certificado.getFechaEmision());
        System.out.println("Precio Total: "+ certificado.getPrecioTotal());
        System.out.println("Producto: "+ certificado.getIdCertificado());


    }
}
