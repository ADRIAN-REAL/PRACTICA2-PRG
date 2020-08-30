import java.util.Date;

public class Certificado {

     int idCertificado;
     String nombre;
     String calidad;
     Date fechaEmision;
     double precioTotal;

    public Certificado(int idCertificado, String nombre, String calidad, Date fechaEmision, double precioTotal) {
        this.idCertificado = idCertificado;
        this.nombre = nombre;
        this.calidad = calidad;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
