public class ClienteGeneral
{
   private final String id;
    private String nom;
    private double caluno;
    private double caldos;
    
    public String getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        if(nom !=null)this.nom = nom;
        else this.nom = "";
    }
    
    public double getCaluno(){
        return caluno;
    }
    public void setCaluno(double caluno){
        if(caluno >= 0) this.caluno = caluno;
        else this.caluno = 0;
    }
    
    public double getCaldos(){
        return caldos;
    }
    public void setCaldos(double caldos){
        if(caldos >= 0) this.caldos = caldos;
        else this.caldos = 0;
    }
    
    ClienteGeneral(String id, String nom, double caluno, double caldos){
        if(id != null)this.id = id;
        else this.id = "";
        setNom(nom);
        setCaluno(caluno);
        setCaldos(caldos);
    }
    
    double calcularProm(){
        return (caluno + caldos) /2;
    }
}
