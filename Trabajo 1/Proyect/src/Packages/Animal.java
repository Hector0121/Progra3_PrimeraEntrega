package Packages;

public class Animal {

    //Atributos
    private String nomb_cuidador;
    private String nomb_animal;
    private String especie;
    private  float pesoKg;
    private float consumoKg;


    //Constructores
    public Animal (String nomb_cuidador,
                    String nomb_animal,
                    String especie,
                    float pesoKg,
                    float consumoKg){

    this.nomb_cuidador=nomb_cuidador;
    this.nomb_animal=nomb_animal;
    this.especie=especie;
    this.pesoKg=pesoKg;
    this.consumoKg=consumoKg;
    }

    //Metodos

    //Getter y Setters
    public String getNomb_cuidador() {
        return nomb_cuidador;
    }

    public void setNomb_cuidador(String nomb_cuidador) {
        this.nomb_cuidador = nomb_cuidador;
    }

    public String getNomb_animal() {
        return nomb_animal;
    }

    public void setNomb_animal(String nomb_animal) {
        this.nomb_animal = nomb_animal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public float getConsumoKg() {
        return consumoKg;
    }

    public void setConsumoKg(float consumoKg) {
        this.consumoKg = consumoKg;
    }

    //

}
