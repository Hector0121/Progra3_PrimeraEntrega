import java.util.*;
import Packages.*;


public class Menu {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       //Clases
       Refugio refugio = new Refugio();
       Cuidador cuidador = new Cuidador();
       Animal animal = new Animal();


       int opcion;
       //Control de entrada de datos

       boolean flag = false;
       int rep=0;

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
                    flag=false;
                    rep=0;
                    do{
                        if(rep !=0){
                            flag =true;
                        }
                        if(flag == true ){
                            System.out.println("Error has introducido un numero erroneo al tamaño del refugio (500)");
                            flag =false;
                        }
                        System.out.print("\nIntroduce el número de animales ha añadir: ");
                        refugio.setNum_animals(sc.nextInt());
                        
                        rep++;
                    }while(refugio.getNum_animals() > refugio.TAM || refugio.getNum_animals() <= 0);

                    refugio.crearRegistro(refugio.getNum_animals());
                    System.out.printf("Refugio correctamente creado, tamaño del refugio : (%d)",refugio.getNum_animals());

                break;
            case 2:
                    flag=false;
                    rep=0;

                    do{
                        if(rep !=0){
                            flag=true;
                        }
                        if(!flag){
                            System.out.println("Error: Has introducido un precio no valido (mayor que 0)");
                            flag = false;
                        }
                        System.out.print("\nIntroduce el precio del alimento:");
                        refugio.setPrice_alimentoKg(sc.nextFloat());
                        rep++;
                    }while (refugio.getPrice_alimentoKg() <=0);
                        
                    System.out.println("Precio almacenado correctamente");

                break;
            case 3:
                    System.out.printf("\nEl número de animales ha introducir en el refugio son %d", refugio.getNum_animals());

                    if(refugio.getNum_animals() <refugio.getAnimales().length){
                        
                        System.out.println("|===========================|");
                        System.out.println("|   RELLENA EL FORMULARIO   |");
                        System.out.println("|===========================|");
                        System.out.print("\nNombre del cuidador: ");
                        String nombre_cuidador = sc.nextLine();
                        System.out.print("\nNombre del animal: ");
                        String nombre_animal = sc.nextLine();
                        System.out.print("\nNombre de la especie: ");
                        String especie = sc.nextLine();
                        System.out.print("\nPeso del animal(Kg):");
                        Float peso_Anml = sc.nextFloat();
                        System.out.print("\nConsumo diario del animal(Kg):");
                        Float consumo_Anml = sc.nextFloat();
                        Animal nuevoAnimal = new Animal(nombre_cuidador,nombre_animal,especie,peso_Anml,consumo_Anml);
                        
                        //Vamos ha almacenar toda la informacion obtenida en el ArrayList
                        int pos =refugio.getNum_animals();
                        refugio.getAnimales()[pos]=nuevoAnimal;
                    }
                    else{
                        System.out.println("Refugio lleno");
                    }
                break;
            case 4:
                    ImprimirTabla();
                break;
            case 5:

                return ;
        }

        }while(opcion !=5);
    }

    public  static void ImprimirTabla(){
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


    public static float coste_diario_x_animal(){

        

    }

   

    public float coste_diario_total(float consumo){

        float total=0;

        for(int i=0;i<this.num_animals;i++){

                total += this.price_alimentoKg *consumo;

        }

        return total;

    }



    /* 

    public float precio_medio(){

        float total_pesos=0;

        

        for(int i=0;i<this.num_animals;i++){



        }

        return  (total_pesos/this.num_animals);

    }

    */

}
