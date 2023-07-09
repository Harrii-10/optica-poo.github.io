public class ClienteDiscap extends Cliente{
    private double caluno;
    private double caldos;
    private double caltres;
    private double calcuatro;
    ClienteDiscap(String id, String nom, double caluno, double caldos, double caltres, double calcuatro) throws Exception {
        super(id, nom);
        setCaluno(caluno);
        setCaldos(caldos);
        setCaltres(caltres);
        setCalcuatro(calcuatro);}
    
    public double calcularProm(){
        return(caluno + caldos + caltres + calcuatro) / 4;}
    
    public double getCaluno(){
        return caluno;}
    public void setCaluno(double caluno){
        if(caluno >= 0) this.caluno = caluno;
        else this.caluno = 0;}
    
    public double getcaldos(){
        return caldos;}
    public void setCaldos(double caldos){
        if(caldos >= 0) this.caldos = caldos;
        else this.caldos = 0;}
        
    public double getcaltres(){
        return caltres;}
    public void setCaltres(double caltres){
        if(caltres >= 0) this.caltres = caltres;
        else this.caltres = 0;}
    
    public double getcalcuatro(){
        return calcuatro;}
    public void setCalcuatro(double calcuatro){
        if(calcuatro >= 0) this.calcuatro = calcuatro;
        else this.calcuatro = 0;}
}
