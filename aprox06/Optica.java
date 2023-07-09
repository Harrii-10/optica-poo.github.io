public class Optica{
    private final String nit;
    private String nomOp;
    private String direc;
    private Cliente[] cliente;
    private int encuestados;
 
    public Optica(String nit, String nomOp, String direc){
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNomOp(nomOp);
        setDirec(direc);
        cliente = new Cliente [50];
        encuestados = 0;}
    
    public String getNit(){
        return nit;}
     
    public String getNomOp(){
        return nomOp;}
    public void setNomOp(String nomOp){
        if (nomOp != null){
            this.nomOp = nomOp;}
        else{
        this.nomOp = "";}
    }
     
    public String getDirec(){
        return direc;}
    public void setDirec(String direc){
        if (direc != null){
            this.direc = direc;}
        else{
        this.direc = "";}
    }
    
    public double calcularPromGen(){
        double prom = 0;    
        for(int i = 0; i < encuestados; i++){
            prom = prom + cliente[i].calcularProm();}
        return prom / 3;
    }
    
    public void adicionarClienteGeneral(String id, String nom, double caluno, double caldos){
        cliente[encuestados] = new ClienteGeneral(id, nom, caluno, caldos);
        encuestados++;
    }
    public void adicionarClienteMayor(String id, String nom, double caluno, double caldos, double caltres){
        cliente[encuestados] = new ClienteMayor(id, nom, caluno, caldos, caltres);
        encuestados++;
    }
    public void adicionarClienteDiscap(String id, String nom, double caluno, double caldos, double caltres, double calcuatro){
        cliente[encuestados] = new ClienteDiscap(id, nom, caluno, caldos, caltres, calcuatro);
        encuestados++;
    }
}
