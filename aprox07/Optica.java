import java.util.ArrayList;
public class Optica{
    private final String nit;
    private String nomOp;
    private String direc;
    private ArrayList cliente;
    
    public Optica(String nit, String nomOp, String direc){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNomOp(nomOp);
        setDirec(direc);        
        cliente = cliente = new ArrayList();}
    
    public String getNit(){
        return nit;}
    
    public String getNomOp(){
        return nomOp;
    }
    public void setNomOp(String nomOp){
        if(nomOp != null){
            this.nomOp = nomOp;}
            else{
            this.nomOp = "";}        
    }
    
    public String getDirecc(){
        return direc;
    }
    public void setDirec(String direc){
        if(direc != null){
            this.direc = direc;}
        else{
            this.direc = "";}        
    }
        
    public double calcularPromGen(){
        double prom = 0;
        for(int i = 0; i < cliente.size(); i++){
            prom += ((Cliente)cliente.get(i)).calcularProm();}
        return prom / 3;
    }
    
    public void adicionarClienteGeneral(String id, String nom, double caluno, double caldos)throws Exception{
        cliente.add(new ClienteGeneral(id, nom, caluno, caldos));}
    
    public void adicionarClienteMayor(String id, String nom, double caluno, double caldos, double caltres)throws Exception{
        cliente.add(new ClienteMayor(id, nom, caluno, caldos, caltres));}
        
    public void adicionarClienteDiscap(String id, String nom, double caluno, double caldos, double caltres, double calcuatro)throws Exception{
        cliente.add(new ClienteDiscap(id, nom, caluno, caldos, caltres, calcuatro));}
}    
