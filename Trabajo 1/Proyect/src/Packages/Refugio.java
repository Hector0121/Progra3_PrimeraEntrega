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
