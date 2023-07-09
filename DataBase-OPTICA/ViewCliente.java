import java.util.List;

public class ViewCliente {

    public void verCliente(Cliente cliente) {
        System.out.println("Datos del Cliente:");
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Cédula: " + cliente.getCedula());
        System.out.println("Username: " + cliente.getUsername());
        System.out.println("Calificacion del servicio: " + cliente.getCalificacion_servicio());
        System.out.println("Calificación de la calidad: " + cliente.getCalificacion_calidad());
        System.out.println("Calificación de recomendación: " + cliente.getCalificacion_recomendacion());
    }

    public void verClientes(List<Cliente> clientes) {
        System.out.println("Datos de los Clientes:");
        for (Cliente cliente : clientes) {
            verCliente(cliente);
            System.out.println();
        }
    }
}