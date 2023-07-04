public abstract class Cliente{
    protected final String id;
    private String nom;
    
    public Cliente(String id, String nom)throws Exception{
        if(id.trim().equals(""))
            throw new Exception("Valor inválido en la identificación");
        
        if(id.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificación no puede tener carácteres");
        
        this.id = id;
        setNom(nom);}
    
    public abstract double calcularProm();
    
    public String getId(){
        return id;}
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        if(nom != null) this.nom = nom;
        else this.nom = "";}
}
