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
       this.cordenadaX=this.velocidadX+this.cordenadaX;

    }
    public void brake(){
        this.velocidadX=this.aceleracion-this.velocidadX;
        this.cordenadaX=this.velocidadX+this.cordenadaX;
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


    @Override
    public String toString() {
        return "\n" +
                "\n" +
                "\n" +
                "                    oooooOOOOOOOOOOOOOOOOooooo\n" +
                "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "                 IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII\n" +
                "                HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\n" +
                "               zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\n" +
                "    .<><><><><><><><><><><><><><><><><><><><><><><><><><><><>.\n" +
                "  /XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\\\n" +
                "/XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\\\n" +
                "\\XXX[  ]XXX[  ]XXXX[  ]XXXX[  ]XXXX[  ]XXXX[  ]XXXX[  ]XXX[  ]XXX/\n" +
                "  \\XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/\n" +
                "      ~~~~\\XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/~~~~\n" +
                "               /   ~~~<><><><><><><><><><>~~~   \\\n" +
                "              /      /       |   |          \\      \\\n" +
                "             /     /               |          \\     \\\n" +
                "            /    /           |                  \\    \\\n" +
                "           /   /               |   |              \\   \\\n" +
                "          /  /               |                      \\  \\\n" +
                "        _/_/                     | |                  \\_\\_\n" +
                "       <___>                 |    |                   <___>\n" +
                "                                    |";

    }
}
