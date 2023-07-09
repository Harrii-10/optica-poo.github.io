import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao {

    private static final String INSERT_QUERY = "INSERT INTO cliente (cedula, username, calificacion_servicio, calificacion_calidad, calificacion_recomendacion) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM cliente ORDER BY dni";
    private static final String UPDATE_QUERY = "UPDATE cliente SET cedula=?, username=?, calificacion_servicio=?, calificacion_calidad=?, calificacion_recomendacion=? WHERE dni=?";
    private static final String DELETE_QUERY = "DELETE FROM cliente WHERE dni=?";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM cliente WHERE dni = ?";

    @Override
    public boolean registrarCliente(Cliente cliente) throws DAOExceptionOp {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, cliente.getCedula());
            pstmt.setString(2, cliente.getUsername());
            pstmt.setDouble(3, cliente.getCalificacion_servicio());
            pstmt.setDouble(4, cliente.getCalificacion_calidad());
            pstmt.setDouble(5, cliente.getCalificacion_recomendacion());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOExceptionOp("Error al registrar el cliente", e);
        }
    }

    @Override
    public List<Cliente> obtenerClientes() throws DAOExceptionOp {
        List<Cliente> listaCliente = new ArrayList<>();

        try (Connection con = Conexion.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)) {
            while (rs.next()) {
                Cliente cliente = obtenerClienteDesdeResultSet(rs);
                listaCliente.add(cliente);
            }
        } catch (SQLException e) {
            throw new DAOExceptionOp("Error al obtener los clientes", e);
        }

        return listaCliente;
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) throws DAOExceptionOp {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY)) {
            pstmt.setString(1, cliente.getCedula());
            pstmt.setString(2, cliente.getUsername());
            pstmt.setDouble(3, cliente.getCalificacion_servicio());
            pstmt.setDouble(4, cliente.getCalificacion_calidad());
            pstmt.setDouble(5, cliente.getCalificacion_recomendacion());
            pstmt.setInt(6, cliente.getDni());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOExceptionOp("Error al actualizar el cliente", e);
        }
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) throws DAOExceptionOp {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY)) {
            pstmt.setInt(1, cliente.getDni());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOExceptionOp("Error al eliminar el cliente", e);
        }
    }

    @Override
    public Cliente obtenerClientePorDni(int dni) throws DAOExceptionOp {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(SELECT_BY_ID_QUERY)) {
            pstmt.setInt(1, dni);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerClienteDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new DAOExceptionOp("Error al obtener el cliente por DNI", e);
        }
        return null;
    }

    private Cliente obtenerClienteDesdeResultSet(ResultSet rs) throws SQLException {
        int dni = rs.getInt("dni");
        String cedula = rs.getString("cedula");
        String username = rs.getString("username");
        double calificacion_servicio = rs.getDouble("calificacion_servicio");
        double calificacion_calidad = rs.getDouble("calificacion_calidad");
        double calificacion_recomendacion = rs.getDouble("calificacion_recomendacion");
        return new Cliente(dni, cedula, username, calificacion_servicio, calificacion_calidad, calificacion_recomendacion);
    }
    
    
}