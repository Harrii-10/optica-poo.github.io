import java.util.List;

public class ControllerCliente {
    private final ViewCliente vista;
    private final ClienteDao dao;

    public ControllerCliente() throws DAOExceptionOp {
        this.vista = new ViewCliente();
        this.dao = ClienteDAOFactory.creaClienteDAO();
    }

    public void registrar(Cliente cliente) {
        try {
            dao.registrarCliente(cliente);
        } catch (DAOExceptionOp e) {
            mostrarError("Error al registrar el cliente", e);
        }
    }

    public void actualizar(Cliente cliente) {
        try {
            dao.actualizarCliente(cliente);
        } catch (DAOExceptionOp e) {
            mostrarError("Error al actualizar el cliente", e);
        }
    }

    public void eliminar(Cliente cliente) {
        try {
            dao.eliminarCliente(cliente);
        } catch (DAOExceptionOp e) {
            mostrarError("Error al eliminar el cliente", e);
        }
    }
    
    public void verClientes() {
        try {
            List<Cliente> clientes = dao.obtenerClientes();
            vista.verClientes(clientes);
        } catch (DAOExceptionOp e) {
            mostrarError("Error al obtener los clientes", e);
        }
    }

    public Cliente obtenerClientePorDni(int dni) {
        try {
            return dao.obtenerClientePorDni(dni);
        } catch (DAOExceptionOp e) {
            mostrarError("Error al obtener el cliente por DNI", e);
            return null;
        }
    }

    private void mostrarError(String mensaje, Exception e) {
        System.out.println(mensaje);
        e.printStackTrace();
    }
}