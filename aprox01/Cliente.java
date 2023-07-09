public class Cliente
{
    String id;
    String nom;
    double caluno;
    double caldos;
    double caltres;
    
    Cliente(String id, String nom, double caluno, double caldos, double caltres){
        this.id = id;
        this.nom = nom;
        this.caluno = caluno;
        this.caldos = caldos;
        this.caltres = caltres;
    }
    
    double calcularProm(){
        return (caluno + caldos + caltres) / 3;
    }
}
