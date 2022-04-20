public class Cargo extends SpaceShip{
    int capacidadMaxima;
    int carga;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int capacidadMaxima) {
        super(nombre, matriculaGalactica, aceleracion);
        this.capacidadMaxima = capacidadMaxima;
    }


}
