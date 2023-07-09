public class Cliente{
    protected final String id;
    private String nom;
 
    public Cliente (String id, String nom){
        if (id != null) this.id = id;
        else this.id = "";
        setNom(nom);}
    
    double calcularProm(){
    return 0;}
     
    public String getId(){
        return id;}
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        if (nom != null) this.nom = nom;
        else this.nom = "";}
}