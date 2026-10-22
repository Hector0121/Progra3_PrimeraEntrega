import java.util.*;
import Packages.*;


public class Menu {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       //Clases
       Refugio refugio = new Refugio();
       Cuidador cuidador1 = new Cuidador("Juan","Sanchez Perez",true);
       Cuidador cuidador2 = new Cuidador("Maria","Gutierrez Gomez",false);


       int opcion;
       //Control de entrada de datos
       boolean flag = false;
       int rep=0;

        do{
        System.out.println("\n|=============================================|");
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
                        sc.nextLine(); //para el buffer
                        rep++;
                    }while(refugio.getNum_animals() > refugio.TAM || refugio.getNum_animals() <= 0);

                    refugio.crearRegistro(refugio.getNum_animals());
                    System.out.printf("Refugio correctamente creado, tamaño del refugio : (%d)\n",refugio.getNum_animals());

                break;
            case 2:
                    flag=false;
                    rep=0;

                    do{
                        if(rep !=0){
                            flag=true;
                        }
                        if(flag==true){
                            System.out.println("Error: Has introducido un precio no valido (mayor que 0)");
                            flag = false;
                        }
                        System.out.print("\nIntroduce el precio del alimento:");
                        refugio.setPrice_alimentoKg(sc.nextFloat());
                        sc.nextLine();
                        rep++;
                    }while (refugio.getPrice_alimentoKg() <=0);
                        
                    System.out.println("Precio almacenado correctamente");

                break;
            case 3:
                    //limpiamos el buffer 
                    sc.nextLine();
                    System.out.printf("\nEl número de animales a introducir en el refugio son %d", refugio.getNum_animals());

                    for(int i = 0; i < refugio.getNum_animals(); i++){
                        flag = false;
                        rep = 0;
                        
                        System.out.println("\n|===========================|");
                        System.out.println("|   RELLENA EL FORMULARIO   |");
                        System.out.println("|===========================|\n");
                        
                        String nombre_cuidador;
                        String nombre_animal;
                        String especie;
                        float peso_Anml;
                        float consumo_Anml;

                        do{
                            if(rep != 0){
                                flag = true;
                            }
                            if(flag == true){
                                System.out.print("\nError: El cuidador no existe");
                                flag = false;
                            }
                            System.out.print("\nNombre del cuidador: ");
                            nombre_cuidador = sc.nextLine();
                            rep++;
                        } while(!nombre_cuidador.equalsIgnoreCase(cuidador1.getCuidador()) && !nombre_cuidador.equalsIgnoreCase(cuidador2.getCuidador()));
                        
                        // No voy a aplicar robusted aqui pq el nombre del animal puede ser incluso un numero
                        System.out.print("\nNombre del animal: ");
                        nombre_animal = sc.nextLine();
                        // No voy a aplicar robusted aqui pq tedria q comparar el nombre 
                        // con  una lista muy grade de especies de animales
                        System.out.print("\nNombre de la especie: ");
                        especie = sc.nextLine();

                        //Aplicamos robusted al codigo en la lectura de peso y consumo
                        flag =false;
                        rep=0;
                        do{
                            if(rep !=0){
                                flag=true;
                            }
                            if(flag ==true){
                                System.out.println("Error: No puede introducir pesos negativos o ceros");
                                flag=false;
                            }
                            System.out.print("\nPeso del animal (Kg): ");
                            peso_Anml = sc.nextFloat();
                        }while(peso_Anml <= 0);
                        flag =false;
                        rep=0;
                        do{
                            if(rep !=0){
                                flag=true;
                            }
                            if(flag ==true){
                                System.out.println("Error: No puede introducir consumos negativos o ceros");
                                flag=false;
                            }
                            System.out.print("\nConsumo diario del animal (Kg): ");
                            consumo_Anml = sc.nextFloat();
                        }while(peso_Anml <= 0);
                            
                        
                        //Limpiamos el buffer
                        sc.nextLine(); 

                        Animal nuevoAnimal = new Animal(nombre_cuidador, nombre_animal, especie, peso_Anml, consumo_Anml);
                        
                        // Almacenar en la posición correspondiente
                        refugio.getAnimales()[i] = nuevoAnimal;
                    }

                    System.out.println("\nRefugio lleno");
                    
                break;
            case 4:
                    //resultado de las funciones
                    System.out.println("|---------------------------------------------------------------------------------------------------------|");
                    System.out.println("| ANIMALES DEL REFUGIO                                                                                    |");
                    System.out.println("|---------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Nombre     | Especie   | Cuidador                 | Formación | Peso (kg)  | Consumo kg | Coste EUR     |");
                    System.out.println("|---------------------------------------------------------------------------------------------------------|");

                    for(int i=0; i<refugio.getNum_animals(); i++){
                        Animal animalActual = refugio.getAnimales()[i];
                        String apellidos;
                        String formacion;
                        float coste_diario_anml;
                        coste_diario_anml = refugio.coste_diario_x_animal(i);
                        
                        if(animalActual.getNomb_cuidador().equals(cuidador1.getCuidador())){
                            apellidos = cuidador1.getApellidos();
                            if(cuidador1.isFormacion() == true){
                                formacion = "Sí";
                            } else {
                                formacion = "No";
                            }
                        } else {
                            apellidos = cuidador2.getApellidos();
                            if(cuidador2.isFormacion() == true){
                                formacion = "Sí";
                            } else {
                                formacion = "No";
                            }
                        }
                        
                        System.out.printf("| %-10s | %-9s | %-24s | %-11s | %-10.2f | %-10.2f | %-10.2f  |\n",
                            animalActual.getNomb_animal(),
                            animalActual.getEspecie(),
                            animalActual.getNomb_cuidador() + " " + apellidos,
                            formacion,
                            animalActual.getPesoKg(),
                            animalActual.getConsumoKg(),
                            coste_diario_anml);
                    }

                    float cost_total = refugio.coste_diario_total();
                    float pes_med = refugio.pesoMedio();

                    System.out.println("|---------------------------------------------------------------------------------------------------------|");
                    System.out.printf("| Coste diario total de alimentación: %.2f EUR                                                            |\n", cost_total);
                    System.out.printf("| Peso medio de los animales:  %.2f kg                                                                   |\n", pes_med);
                    System.out.println("|---------------------------------------------------------------------------------------------------------|");
                break;
            case 5:

                return ;
        }

        }while(opcion !=5);
        System.out.println("Programa finalizado");
        sc.close();
    }
    

}
