import java.util.List;

public interface ClienteDao {
    boolean registrarCliente(Cliente cliente) throws DAOExceptionOp;
    List<Cliente> obtenerClientes() throws DAOExceptionOp;
    boolean actualizarCliente(Cliente cliente) throws DAOExceptionOp;
    boolean eliminarCliente(Cliente cliente) throws DAOExceptionOp;
    Cliente obtenerClientePorDni(int dni) throws DAOExceptionOp;
}