
/**
 * Write a description of class Optica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Optica
{
    public static void main(String[] args){
        Scanner obsc = new Scanner(System.in);
        int encuestados;
        String[] ids = new String[50];
        String[] noms = new String[50];
        double[] caliuno = new double[50];
        double[] calidos = new double[50];
        double[] calitres = new double[50];
        String id, nom;
        double cali1, cali2, cali3;
        double promedio = 0;
        
        System.out.println("Digite el número de clientes encuestados: ");
        encuestados = obsc.nextInt();
        
        for(int i = 0; i < encuestados; i++){
            System.out.println("Escriba el número de identificación del cliente");
            id = obsc.next();
            System.out.println("Escriba el nombre del cliente");
            nom = obsc.next();
            System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 1 al 5");
            System.out.println("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
            cali1 = obsc.nextDouble();
            System.out.println("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?");
            cali2 = obsc.nextDouble();
            System.out.println("3. ¿Qué tan dispuesto/a estarías a recomendar nuestra óptica a un amigo o familiar?");
            cali3 = obsc.nextDouble();
            
            ids[i] = id;
            noms[i] = nom;
            caliuno[i] = cali1;
            calidos[i] = cali2;
            calitres[i] = cali3;
        }
        for(int i = 0; i < encuestados; i++){
               promedio = promedio + ((caliuno[i] + calidos[i] + calitres[i]) / 3) / encuestados;
            }
            System.out.println("La calificación de la óptica diaria es: " + promedio);   
    }
}
