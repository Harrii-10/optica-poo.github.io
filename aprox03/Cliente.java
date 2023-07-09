public class Cliente{
    private String id;
    private String nom;
    private double caluno;
    private double caldos;
    private double caltres;
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        if(id != null)this.id = id;
        else this.id = "";
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        if(nom != null)this.nom = nom;
        else this.nom = "";
    }
    public double getCaluno(){
        return caluno;
    }
    public void setCaluno(double caluno){
        if(caluno >= 0)this.caluno = caluno;
        else this.caluno = 0;
    }
    public double getCaldos(){
        return caldos;
    }
    public void setCaldos(double caldos){
        if(caldos >= 0)this.caldos = caldos;
        else this.caldos = 0;
    }
    public double getCaltres(){
        return caltres;
    }
    public void setCaltres(double caltres){
        if(caltres >= 0)this.caltres = caltres;
        else this.caltres = 0;
    }
    
    Cliente(String id, String nom, double caluno, double caldos, double caltres){
        setId(id);
        setNom(nom);
        setCaluno(caluno);
        setCaldos(caldos);
        setCaltres(caltres);
    }
    
    double calcularProm(){
        return (caluno +caldos +caltres) / 3;
    }
}
