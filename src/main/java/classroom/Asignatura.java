package classroom;

public class Asignatura {

    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", Tipo.FUNDAMENTACION);
    }

    public Asignatura(int codigoInterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, 0, tipo);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    public Asignatura(String nombre, int codigoExternoNuevo, Tipo tipoNuevo) {
        this.nombre = nombre;
        this.codigoInterno = 0;
        this.codigoExterno = codigoExternoNuevo;
        this.tipo = tipoNuevo;
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}




