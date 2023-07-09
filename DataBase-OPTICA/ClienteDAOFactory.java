public class ClienteDAOFactory {
    public static ClienteDao creaClienteDAO() throws DAOExceptionOp {
        return new ClienteDaoImpl();
    }
}