public class ClienteGeneral extends Cliente{
    private double caluno;
    private double caldos;
    
    ClienteGeneral(String id, String nom, double caluno, double caldos) throws Exception {
        super(id, nom);
        setCaluno(caluno);
        setCaldos(caldos);
    }
        
    public double calcularProm(){
        return (caluno + caldos) / 2;}
        
    public double getCaluno(){
        return caluno;
    }
    public void setCaluno(double caluno){
        if(caluno >= 0) this.caluno = caluno;
        else this.caluno = 0;}
    
    public double getcaldos(){
        return caldos;
    }
    public void setCaldos(double caldos){
        if(caldos >= 0) this.caldos = caldos;
        else this.caldos = 0;}
}
