public class SpaceShip {
    String nombre;
    String matriculaGalactica;
    int aceleracion;
    int velocidadX;
    int cordenadaX;
    int direccionX;

    public SpaceShip(String nombre, String matriculaGalactica, int aceleracion) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
        this.velocidadX = 0;
        this.cordenadaX= 4;
        this.direccionX= 1;
    }

    public void speedUp(){
       this.velocidadX=this.aceleracion+this.velocidadX;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public void setMatriculaGalactica(String matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }
}
