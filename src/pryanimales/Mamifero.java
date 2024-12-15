package pryanimales;

public class Mamifero extends Animales{
    public String pelaje;

    public Mamifero(String pelaje, String nombre, int edad) {
        super(nombre, edad);
        this.pelaje = pelaje;
    }
    public void amamantar(){
        System.out.println(nombre + " ESTA AMAMANTANDO A SUS CRIAS DE " + edad + " MESES RECIEN NACIDOS ");
        
    }
    
}
