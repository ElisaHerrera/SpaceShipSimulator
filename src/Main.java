import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salida=1;
        int opcion=0;
        System.out.println("elige un tipo de nave a crear");
        System.out.println("    1-para crear una nave");
        System.out.println("    2-para crear una cargo");
        opcion=sc.nextInt();
        sc.nextLine();

        if (opcion==1){
            SpaceShip nave=new SpaceShip("gato","23234234D",2);
            while(salida!=0){
                System.out.println("que quieres hacer con la nave");
                System.out.println("    0 salir de la nave");
                System.out.println("    1 acelerar");
                System.out.println("    2 frenar");
                System.out.println("    3 parada de emergencia");
                System.out.println("    4 mostrar nave");

                salida=sc.nextInt();
                sc.nextLine();
                switch (salida){
                    case 0:
                        System.out.println("saliendo");
                        break;
                    case 1:
                        nave.speedUp();
                        break;
                    case 2:
                        System.out.println("e");
                        nave.brake();
                        break;
                    case 3:
                        System.out.println("h");
                        nave.emergencyStop();
                        break;
                    case 4:
                        System.out.println(nave);
                    break;
                }
            }
        }
        if(opcion==2){
             Cargo carguera=new Cargo("gato","23234234D",2,5);
            while (salida!=0){
                switch (salida){
                    case 0:
                        System.out.println("saliendo");
                    break;
                    case 1:
                        carguera.speedUp();
                    break;
                    case 2:
                        carguera.speedUp();
                    break;
                    case 3:
                        carguera.emergencyStop();
                    break;
                    case 4:
                        carguera.load();
                    break;
                    case 5:
                        carguera.unload();
                    break;
                    case 6:
                        System.out.println(carguera);
                        break;
                }
            }
        }

    }



}
