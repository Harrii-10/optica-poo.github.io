import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Optica miOptica = new Optica("123","Kodak Lens","Fontibón");
        String id, nom;
        double cal1, cal2, cal3, cal4;
        double prom = 0;
        int menu = 0;
        
        do{
            System.out.println("\nMenú de Opciones");
            System.out.println("[1]- Adicionar Cliente General: ");
            System.out.println("[2]- Adicopnar Cliente mayor de 60 años: ");
            System.out.println("[3]- Adicionar Cliente con alguna discapacidad: ");
            System.out.println("[4]- Calcular Promedio Diario ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opción: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                        sc.nextLine();
                        System.out.println("Escriba el número de identificación del cliente");
                        id = sc.next();
                        System.out.println("Escriba el nombre del cliente");
                        nom = sc.next();
                        System.out.println("Todas las preguntas se responden de la misma forma. En una escala del 1 al 5");
                        System.out.println("1. ¿Cómo calificarías la amabilidad y cortesía de nuestro personal?");
                        cal1 = sc.nextInt();
                        System.out.println("2. ¿Cómo calificarías nuestros productos y servicio basado/a en la calidad/precio?");
                        cal2 = sc.nextInt();
                        try{
                            miOptica.adicionarClienteGeneral(id, nom, cal1, cal2);}
                            catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
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
                        try{                        
                        miOptica.adicionarClienteMayor(id, nom, cal1, cal2, cal3);}
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
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
                        try{                         
                        miOptica.adicionarClienteDiscap(id, nom, cal1, cal2, cal3, cal4);}
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        prom = miOptica.calcularPromGen();
                        System.out.println("\nLa calificacion diaria promedio de la óptica es: " + prom); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(menu != 5);
    }
}

