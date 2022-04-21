public class Cargo extends SpaceShip{
    int capacidadMaxima;
    int carga;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int capacidadMaxima) {
        super(nombre, matriculaGalactica, aceleracion);
        this.capacidadMaxima = capacidadMaxima;
        this.carga=0;
    }
    public void load() {
        if (this.carga > this.capacidadMaxima) {
            System.out.println("esta lleno");
        } else {
            this.carga = this.carga + 1;
        }
    }
    public void unload(){

        if(this.capacidadMaxima<=0){
            System.out.println("esta vacio");
        }else{
            this.carga=this.carga-1;
        }

    }


}
