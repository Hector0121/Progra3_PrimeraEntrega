package Packages;


public class Refugio {
    //Atributos
    public  final int TAM =500;
    private Animal[] animales = new Animal[TAM];
    private float price_alimentoKg;
    private int num_animals;
    
    //Contructor
    public Refugio (Animal[] animales,    
                    float price_alimentoKg,
                    int num_animals){
        
        this.animales=animales;
        this.price_alimentoKg=price_alimentoKg;
        this.num_animals=num_animals;
    }
    public Refugio(){

    }
    //Metodos
    

    

    public float coste_diario_x_animal(int pos){
        Animal animalActual =this.animales[pos];
        float coste = animalActual.getConsumoKg() * this.price_alimentoKg;
        return coste;
    }

    public float coste_diario_total(){
        float coste =0;
        for(int i=0;i<this.num_animals;i++){
            Animal animalActual = this.animales[i];
            coste += animalActual.getConsumoKg() * this.price_alimentoKg;
        }
        return coste;
    }
    public float pesoMedio(){
        float peso_total =0;
        for(int i =0 ;i<this.num_animals;i++){
            Animal animalActual = this.animales[i];
            peso_total +=animalActual.getPesoKg();
        }


        return (peso_total/this.num_animals);
    }

    public void crearRegistro( int capacidad) {
        this.animales = new Animal[capacidad];
    }

    //Getter y Setters
    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
    public float getPrice_alimentoKg() {
        return price_alimentoKg;
    }
    public void setPrice_alimentoKg(float price_alimentoKg) {
        this.price_alimentoKg = price_alimentoKg;
    }
    public int getNum_animals() {
        return num_animals;
    }
    public void setNum_animals(int num_animals) {
        this.num_animals = num_animals;
    }
    

    
   

}
