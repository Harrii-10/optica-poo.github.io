import java.util.Scanner;
public class Calificaciones
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int encuestados = 0, menu = 0;
        Cliente[] losClientes = new Cliente[50];
        String id, nom;
        double caluno, caldos, caltres;
        double prom = 0;
        while(menu != 3){
            System.out.println("\nMenú de Opciones: ");
            System.out.println("1. Adicionar un cliente: ");
            System.out.println("2. Calcular promedio: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opción...");
            menu = sc.nextInt();
            if(menu==1){
                System.out.println("Escriba el número de identificación del cliente");
                id = sc.next();
                System.out.println("Escriba el nombre del cliente");
                nom = sc.next();
                System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 1 al 5");
                System.out.println("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
                caluno = sc.nextDouble();
                System.out.println("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?");
                caldos = sc.nextDouble();
                System.out.println("3. ¿Qué tan dispuesto/a estarías a recomendar nuestra óptica a un amigo o familiar?");
                caltres = sc.nextDouble();
                Cliente unCliente = new Cliente(id, nom, caluno, caldos, caltres);
                losClientes[encuestados] = unCliente;
                encuestados++;
            }
            else if(menu==2){
                for(int i = 0; i< encuestados; i++){
                    prom = prom + losClientes[i].calcularProm() / encuestados;
                }
                System.out.println("\n La calificación diaria promedio de la óptica es : " + prom);
            }
        }
    }
}
