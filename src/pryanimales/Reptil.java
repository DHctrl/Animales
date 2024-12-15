
package pryanimales;

public class Reptil extends Animales{
    public String escamas;

    public Reptil(String escamas, String nombre, int edad) {
        super(nombre, edad);
        this.escamas = escamas;
    }
    public void arrastrarse(){
        System.out.println(nombre + " SE ARRASTRA CON SUS ESCAMAS DE TIPO " + escamas);
    }
    
}
