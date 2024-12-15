package pryanimales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pryanimales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione la clase de especie que desee saber: ");
        String especie = scanner.nextLine();
        System.out.println("");
        switch(especie){
            case "Mamifero" -> {
                List<Mamifero> mamiferos = new ArrayList<>();
                mamiferos.add(new Mamifero("pelo fino", "Tigre", 3));
                mamiferos.add(new Mamifero("lana gruesa", "Oveja", 2));
                mamiferos.add(new Mamifero("pelo duro", "Leon", 4));
                System.out.println("Ingrese el nombre del animal que desee buscar: ");
                String nombrebuscado = scanner.nextLine().trim();
                boolean encontrado = false;
                for(Mamifero mami : mamiferos){
                    if(mami.getNombre().equalsIgnoreCase(nombrebuscado)){
                        encontrado = true;
                        mami.comer();
                        mami.amamantar();
                    }
                }
                if (!encontrado){
                    System.out.println("el nombre del animal no esta en esta lista, vuelva a intentar ");
                }
            }
            case "Ave" -> {
                List<Ave> aves = new ArrayList<>();
                aves.add(new Ave(3.45,"Aguila",0));
                aves.add(new Ave(2.85,"Alcon",0));
                aves.add(new Ave(2.95,"Murcielago",0));
                System.out.println("ingrese el nombre del Ave para buscar: ");
                String nombresbuscado = scanner.nextLine().trim();
                boolean encontrados = false;
                for(Ave ave : aves){
                    if(ave.getNombre().equalsIgnoreCase(nombresbuscado)){
                        encontrados = true;
                        ave.comer();
                        ave.volar();
                    }
                }
                if(!encontrados){
                    System.out.println("este nombre no se encuentra ");
                }
            }
            case"Reptil" -> {
                List<Reptil> reptiles = new ArrayList<>();
                reptiles.add(new Reptil("supralabiales", "Anaconda", 0));
                reptiles.add(new Reptil("sublabiales","Piton",0));
                reptiles.add(new Reptil("sublabiales","Cocodrilo",0));
                System.out.println("ingrese el nombre del Reptil para buscar: ");
                String nombresbuscados = scanner.nextLine().trim();
                boolean encontradose = false;
                for(Reptil reptil : reptiles){
                    if(reptil.getNombre().equalsIgnoreCase(nombresbuscados)){
                        encontradose = true;
                        reptil.comer();
                        reptil.arrastrarse();
                    }
                }
                if(!encontradose){
                    System.out.println("este nombre no se encuentra ");
                }
            }
            default -> System.out.println("La especie no se encuentra en esta lista, Selecciona una vez mas ");
                
        }
    }
    
    
}
