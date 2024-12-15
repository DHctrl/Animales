
package pryanimales;

public class Animales {
    public String nombre;
    public int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }
    public void comer(){
        System.out.println(nombre + " ESTA COMIENDO ");
    }
}
