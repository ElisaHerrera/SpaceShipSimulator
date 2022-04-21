import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salida=1;
        int opcion=0;
        salida=sc.nextInt();
        sc.nextLine();
        if (opcion==1){
            SpaceShip nave=new SpaceShip("gato","23234234D",2);
            while(salida!=0){
                switch (salida){
                    case 0:
                        System.out.println("saliendo");
                        break;
                    case 1:
                        nave.speedUp();
                        break;
                    case 2:
                        nave.brake();
                        break;
                    case 3:
                        nave.emergencyStop();
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
                }
            }
        }

    }



}
