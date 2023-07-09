import java.util.Scanner;
public class Calificaciones{
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);
        Optica miOptica = new Optica ("123","Kodak Lens","Fontibón");
        String id, nom;
        double prom = 0;
     
        System.out.println("Digite el número de clientes Generales encuestados");
        int encuestados1 = sc.nextInt();
        for(int i=0; i < encuestados1; i++){
            double cal1,cal2;
            System.out.println("Escriba el número de identificación del cliente");
            id = sc.next();
            System.out.println("Escriba el nombre del cliente");
            nom = sc.next();
            System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 1 al 5");
            System.out.println("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
            cal1 = sc.nextInt();
            System.out.println("nota 2");
            cal2 = sc.nextInt();
            miOptica.adicionarClienteGeneral(id, nom, cal1, cal2);}
            
        System.out.println("Digite el número de clientes mayores de 60 años encuestados");
        int encuestados2 = sc.nextInt();
        for(int i=0; i < encuestados2; i++){
            double cal1,cal2, cal3;
            System.out.println("Escriba el número de identificación del cliente");
            id = sc.next();
            System.out.println("Escriba el nombre del cliente");
            nom = sc.next();
            System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 1 al 5");
            System.out.println("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
            cal1 = sc.nextInt();
            System.out.println("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?");
            cal2 = sc.nextInt();
            System.out.println("3. ¿Qué tan dispuesto/a estarías a recomendar nuestra óptica a un amigo o familiar?");
            cal3 = sc.nextDouble();
            miOptica.adicionarClienteMayor(id, nom, cal1, cal2, cal3);}

        System.out.println("Digite el número de clientes con alguna discapacidad encuestados: ");
        int encuestados3 = sc.nextInt();
        for(int i = 0; i < encuestados3; i++){
            double cal1, cal2, cal3, cal4;
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
            System.out.println("4. ¿Cómo calificarías nuestra atención hacia los clientes con algún tipo de discapacidad?");
            cal4 = sc.nextDouble();
            miOptica.adicionarClienteDiscap(id, nom, cal1, cal2, cal3, cal4);}
        
        prom = miOptica.calcularPromGen();
        System.out.println("\nLa calificacion diaria promedio de la óptica es: " + prom);
     }
}
