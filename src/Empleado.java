public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private String fechaIngreso;

    public Empleado() {
    }

    public Empleado(String nombre, String puesto, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
    public void trabajar(){
        System.out.println(nombre+ "esta trabajando como: "+puesto);
    }
    public void recibir salario(){
        System.out.println(nombre+ "ha recibido un salario de $ "+salario);
    }

}
