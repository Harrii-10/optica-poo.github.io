import java.util.Scanner;
public class Calificaciones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int encuestados;
        Cliente[] losClientes = new Cliente[50];
        String id, nom;
        double cal1, cal2, cal3;
        double prom = 0;
        System.out.println("Digite la cantidad de clientes encuestados: ");
        encuestados = sc.nextInt();
        
        for(int i = 0 ; i < encuestados; i++){
            System.out.println("Escriba el número de identificación del cliente");
            id = sc.next();
            System.out.println("Escriba el nombre del cliente");
            nom = sc.next();
            System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 1 al 5");
            System.out.println("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
            cal1 = sc.nextDouble();
            System.out.println("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?");
            cal2 = sc.nextDouble();
            System.out.println("3. ¿Qué tan dispuesto/a estarías a recomendar nuestra óptica a un amigo o familiar?");
            cal3 = sc.nextDouble();
            Cliente unCliente = new Cliente();
            unCliente.id = id;
            unCliente.nom = nom;
            unCliente.caluno = cal1;
            unCliente.caldos = cal2;
            unCliente.caltres = cal3;
            losClientes[i] = unCliente;
        }
        for(int i = 0; i < encuestados; i++){
            double sum = (losClientes[i].caluno +losClientes[i].caldos + losClientes[i].caltres) / 3;
            prom = prom + sum / encuestados;
        }
        System.out.println("La calificacion diaria promedio de la óptica es: " + prom);
    }
}