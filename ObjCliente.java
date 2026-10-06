public class ObjCliente {

    private String IdCliente;
    private String Nombre;
    private String ClaseAtencion;
    private int NumeroCaja;
    private String Turno;

    
    public ObjCliente(String idCliente, String nombre, String claseAtencion, int numeroCaja, String turno) {
        IdCliente = idCliente;
        Nombre = nombre;
        ClaseAtencion = claseAtencion;
        NumeroCaja = numeroCaja;
        Turno = turno;
    }
    public ObjCliente() {
    }
    public String getIdCliente() {
        return IdCliente;
    }
    public void setIdCliente(String idCliente) {
        IdCliente = idCliente;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getClaseAtencion() {
        return ClaseAtencion;
    }
    public void setClaseAtencion(String claseAtencion) {
        ClaseAtencion = claseAtencion;
    }
    public int getNumeroCaja() {
        return NumeroCaja;
    }
    public void setNumeroCaja(int numeroCaja) {
        NumeroCaja = numeroCaja;
    }
    public String getTurno() {
        return Turno;
    }
    public void setTurno(String turno) {
        Turno = turno;
    }

    
}
