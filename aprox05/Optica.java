public class Optica
{
    private final String nit;
    private String nomOp;
    private String direc;
    private ClienteGeneral[] cliente1;
    private ClienteMayor[] cliente2;
    private ClienteDiscap[] cliente3;
    private int encuestados1;
    private int encuestados2;
    private int encuestados3;
    
    public Optica(String nit, String nomOp, String direc){
        if(nit != null)this.nit = nit;
        else this.nit = "";
        setNomOp(nomOp);
        setDirec(direc);
        cliente1 = new ClienteGeneral[50];
        cliente2 = new ClienteMayor[50];
        cliente3 = new ClienteDiscap[50];
        encuestados1 = 0;
        encuestados2 = 0;
        encuestados3 = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNomOp(){
        return nomOp;
    }
    public void setNomOp(String nomOp){
        if(nomOp != null)this.nomOp = nomOp;
        else this.nomOp = "";
    }
    
    public String getDirec(){
        return direc;
    }
    public void setDirec(String direc){
        if(direc != null)this.direc = direc;
        else this.direc = "";
    }
    
    public int encuestados1(){
        return encuestados1;
    }
    
    public int encuestados2(){
        return encuestados2;
    }
    
    public int encuestados3(){
        return encuestados3;
    }
    
    public double calcularPromGen(){
        double prom = 0;
        for(int i = 0; i < encuestados1; i++){
            prom = prom + cliente1[i].calcularProm() / encuestados1;
        }
        for(int i = 0; i < encuestados2; i++){
            prom = prom + cliente2[i].calcularProm() / encuestados2;
        }
        for(int i = 0; i < encuestados3; i++){
            prom = prom + cliente3[i].calcularProm() / encuestados3;
        }
        return prom / 3;
    }
    
    public void adicionarClienteGeneral(String id, String nom, double caluno, double caldos){
        cliente1[encuestados1] = new ClienteGeneral(id, nom, caluno, caldos);
        encuestados1++;
    }
    
    public void adicionarClienteMayor(String id, String nom, double caluno, double caldos, double caltres){
        cliente2[encuestados2] = new ClienteMayor(id, nom, caluno, caldos, caltres);
        encuestados2++;
    }
    
    public void adicionarClienteDiscap(String id, String nom, double caluno, double caldos, double caltres, double calcuatro){
        cliente3[encuestados3] = new ClienteDiscap(id, nom, caluno, caldos, caltres, calcuatro);
        encuestados3++;
    }
}
