public class Cliente {
    private int dni;
    private String cedula;
    private String username;
    private double calificacion_servicio;
    private double calificacion_calidad;
    private double calificacion_recomendacion;

    public Cliente(int dni, String cedula, String username, double calificacion_servicio, double calificacion_calidad, double calificacion_recomendacion) {
        this.dni = dni;
        this.cedula = cedula;
        this.username = username;
        this.calificacion_servicio = calificacion_servicio;
        this.calificacion_calidad = calificacion_calidad;
        this.calificacion_recomendacion = calificacion_recomendacion;
    }
    
    public Cliente(String cedula, String username, double calificacion_servicio, double calificacion_calidad, double calificacion_recomendacion) {
        this.cedula = cedula;
        this.username = username;
        this.calificacion_servicio = calificacion_servicio;
        this.calificacion_calidad = calificacion_calidad;
        this.calificacion_recomendacion = calificacion_recomendacion;
    }

    public int getDni() {
        return dni;
    }

    public String getCedula() {
        return cedula;
    }

    public String getUsername() {
        return username;
    }

    public double getCalificacion_servicio() {
        return calificacion_servicio;
    }

    public double getCalificacion_calidad() {
        return calificacion_calidad;
    }

    public double getCalificacion_recomendacion() {
        return calificacion_recomendacion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCalificacion_servicio(double calificacion_servicio) {
        this.calificacion_servicio = calificacion_servicio;
    }

    public void setCalificacion_calidad(double calificacion_calidad) {
        this.calificacion_calidad = calificacion_calidad;
    }

    public void setCalificacion_recomendacion(double calificacion_recomendacion) {
        this.calificacion_recomendacion = calificacion_recomendacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DNI: ").append(dni)
          .append("\nCédula: ").append(cedula)
          .append("\nUsername: ").append(username)
          .append("\nCalificacion del servicio: ").append(calificacion_servicio)
          .append("\nCalificación de la calidad: ").append(calificacion_calidad)
          .append("\nCalificación de recomendación: ").append(calificacion_recomendacion);
        return sb.toString();
    }
}

