package Packages;

public class Refugio {
    //Atributos
    private String[] nomb_animal= new String [500];
    private float price_alimentoKg;
    private int num_animals;
    
    //Contructor
    public Refugio (String[] nomb_animal,    
                    float price_alimentoKg,
                    int num_animals){
        
        this.nomb_animal=nomb_animal;
        this.price_alimentoKg=price_alimentoKg;
        this.num_animals=num_animals;
    }
    public Refugio(){

    }
    //Metodos

    //Getter y Setters
    public String[] getNomb_animal() {
        return nomb_animal;
    }
    public void setNomb_animal(String[] nomb_animal) {
        this.nomb_animal = nomb_animal;
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
