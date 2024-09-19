public class Peido {
    private double numPedido;
    private String fecha;
    private String estado;
    private String cliente;

    public Peido() {
    }

    public Peido(double numPedido, String fecha, String estado, String cliente) {
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
    }

    public double getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(double numPedido) {
        this.numPedido = numPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Peido{" +
                "numPedido=" + numPedido +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                ", cliente='" + cliente + '\'' +
                '}';
    }
    public void realizarPedido(){
        if(estado.equals("Pendiente")){
            estado="En proceso";
            System.out.println("Pedido"+numPedido+ "esta siendo procesado");
        }else{
            System.out.println("El pedido"+numPedido+"ya esta en proceso o ha sido entregado");
        }
    }
    public void cancelarPedido(){
        if(estado.equals("En proceso")){
            estado="Entregado";
            System.out.println("Pedido"+numPedido+ "ha sido entregado");
        }else{
            System.out.println("El pedido"+numPedido+"aun no esta listo");
        }
    }
}
