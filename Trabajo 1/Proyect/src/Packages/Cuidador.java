package Packages;

public class Cuidador {
    //Atributos
   private String Cuidador;
   private String Apellidos;
   private boolean Formacion;

   //Constructores
   public Cuidador (String Cuidador,String Apellidos,boolean formacion){
    this.Cuidador=Cuidador;
    this.Apellidos=Apellidos;
    this.Formacion=formacion;
   }
   public Cuidador (){
    
   }

   public String getCuidador() {
    return Cuidador;
   }

    //Getter y Stters
   public void setCuidador(String cuidador) {
    Cuidador = cuidador;
   }

   public String getApellidos() {
    return Apellidos;
   }

   public void setApellidos(String apellidos) {
    Apellidos = apellidos;
   }

   public boolean isFormacion() {
    return Formacion;
   }

   public void setFormacion(boolean formacion) {
    Formacion = formacion;
   }

   //

}
