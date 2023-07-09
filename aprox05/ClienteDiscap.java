public class ClienteDiscap
{
    private final String id;
    private String nom;
    private double caluno;
    private double caldos;
    private double caltres;
    private double calcuatro;
    
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
    
    public double getCaltres(){
        return caltres;
    }
    public void setCaltres(double caltres){
        if(caltres >= 0) this.caltres = caltres;
        else this.caltres = 0;
    }
    
    public double getCalcuatro(){
        return calcuatro;
    }
    public void setCalcuatro(double calcuatro){
        if(calcuatro >= 0) this.calcuatro = calcuatro;
        else this.calcuatro = 0;
    }
    
    ClienteDiscap(String id, String nom, double caluno, double caldos, double caltres, double calcuatro){
        if(id != null)this.id = id;
        else this.id = "";
        setNom(nom);
        setCaluno(caluno);
        setCaldos(caldos);
        setCaltres(caltres);
        setCalcuatro(calcuatro);
    }
    
    double calcularProm(){
        return (caluno + caldos + caltres + calcuatro) / 4;
    }
}
