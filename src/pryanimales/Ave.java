package pryanimales;
        
public class Ave extends Animales{
    public double envergadura;

    public Ave(double envergadura, String nombre, int edad) {
        super(nombre, edad);
        this.envergadura = envergadura;
    }
    public void volar(){
        System.out.println(nombre + " ESTA VOLANDO CON UNA ENVERGADURA DE " + envergadura + " METROS ");
    }
    
}
