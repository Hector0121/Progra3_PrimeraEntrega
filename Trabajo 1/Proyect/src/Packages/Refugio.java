package Packages;
import Packages.Animal;
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

    public float coste_diario_x_animal(float consumoKg){
        return (this.price_alimentoKg * consumoKg);
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
