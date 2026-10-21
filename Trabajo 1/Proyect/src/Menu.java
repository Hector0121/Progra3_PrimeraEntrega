import java.util.*;
import Packages.*;


public class Menu {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);

       int opcion;

        do{
        System.out.println("|=============================================|");
        System.out.println("| GESTION DEL REFUGIO                         |");
        System.out.println("|=============================================|");
        System.out.println("| 1)Crea un nuevo registro de animales        |");
        System.out.println("| 2)Configurar el precio del alimento por Kg  |");
        System.out.println("| 3)Añadir un nuevo animal al refugio         |");
        System.out.println("| 4)Mostrar informacion de los animales       |");
        System.out.println("| 5)Salir (Se borrara toda la informacion)    |");
        System.out.println("|=============================================|");
        System.out.print("Seleciona una opcion: ");
        opcion=sc.nextInt();

        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                return ;
        }

        }while(opcion !=5);
    }

    public void ImprimirTabla(){
        System.out.printf("|-----------------------------|");
        System.out.printf("| ANIMALES DEL REFUGIO|");
        System.out.printf("|-----------------------------|");
        System.out.printf("| Nombre | Especie | Cuidador | Formacion | Peso(Kg) | Consumo Kg | Coste EUR | ");
        for(int i=0;i<numAnimls;i++){
            System.out.printf("|\n %s \t %s\t %s\t %b\t %.2f\t %.2f\\t %.2f\t\n|");
        }
        System.out.printf("|-----------------------------|");
        System.out.printf("|Coste diario total de alimentacion: %.2f |");
        System.out.printf("|Peso medio de los animales:  %.2f |");
        System.out.printf("|-----------------------------|");

    }
}
