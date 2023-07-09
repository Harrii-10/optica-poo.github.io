import java.util.InputMismatchException;
import java.util.Scanner;

public class ClienteCRUD {
    private static final ControllerCliente controller;
    private static final Scanner scanner = new Scanner(System.in);

    static {
        try {
            controller = new ControllerCliente();
        } catch (DAOExceptionOp e) {
            System.out.println("Error al inicializar el controlador");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String action;
        while (true) {
            System.out.println("****************ÓPTICA******************");
            System.out.println("[1]Listar | [2]Consultar por DNI | [3]Registrar | [4]Actualizar | [5]Eliminar | [6]Salir: ");
            action = scanner.next().toUpperCase();
            try {
                switch (action) {
                    case "1":
                        listarClientes();
                        break;
                    case "2":
                        consultarClientePorDNI();
                        break;
                    case "3":
                        registrarCliente();
                        break;
                    case "4":
                        actualizarCliente();
                        break;
                    case "5":
                        eliminarCliente();
                        break;
                    case "6":
                        return;
                    default:
                        System.out.println("Acción inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void registrarCliente() {
        Cliente cliente = guardarCliente();
        controller.registrar(cliente);
        System.out.println("Cliente Ingresado Correctamente");
        System.out.println("Registro exitoso: " + cliente.getDni());
    }

    private static void actualizarCliente() {
        int dni = leerDni();
        Cliente cliente = controller.obtenerClientePorDni(dni);
        if (cliente != null) {
            System.out.println("------------Datos originales------------");
            System.out.println(cliente);
            System.out.println("Ingrese los nuevos datos");

            String cedula = leerString("Ingrese el número de identificación del cliente: ");
            String username = leerString("Ingrese el nombre del cliente encuestado: ");
            System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 10 al 50");
            double calificacion_servicio = leerCalificacion("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
            double calificacion_calidad = leerCalificacion("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?: ");
            double calificacion_recomendacion = leerCalificacion("3. ¿Qué tan dispuesto/a estarías a recomendar nuestra óptica a un amigo o familiar?");

            cliente = new Cliente(dni, cedula, username, calificacion_servicio, calificacion_calidad, calificacion_recomendacion);
            controller.actualizar(cliente);
            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void eliminarCliente() {
        int dni = leerDni();
        Cliente cliente = controller.obtenerClientePorDni(dni);
        if (cliente != null) {
            controller.eliminar(cliente);
            System.out.println("Cliente eliminado: " + cliente.getDni());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void listarClientes() {
        controller.verClientes();
    }

    private static void consultarClientePorDNI() {
        int dni = leerDni();
        Cliente cliente = controller.obtenerClientePorDni(dni);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println(cliente);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static Cliente guardarCliente() {
        String cedula = leerString("Ingrese el número de identificación del cliente: ");
        String username = leerString("Ingrese el nombre del cliente encuestado: ");
        System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 10 al 50");
        double calificacion_servicio = leerCalificacion("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
        double calificacion_calidad = leerCalificacion("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?");
        double calificacion_recomendacion = leerCalificacion("3. ¿Qué tan dispuesto/a estarías a recomendar nuestra óptica a un amigo o familiar?");

        return new Cliente(cedula, username, calificacion_servicio, calificacion_calidad, calificacion_recomendacion);
    }

    private static int leerDni() {
        int dni;
        while (true) {
            try {
                System.out.println("Ingrese un valor entero para el DNI del cliente: ");
                dni = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return dni;
    }

    private static double leerCalificacion(String message) {
        double cali;
        while (true) {
            try {
                System.out.println(message);
                cali = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return cali;
    }

    private static String leerString(String message) {
        String s;
        while (true) {
            System.out.println(message);
            s = scanner.next().trim();
            if (s.length() <= 2) {
                System.out.println("La longitud de la cadena debe ser >= 2");
            } else {
                break;
            }
        }
        return s;
    }
}