

package pkg1.abstraccion;

public class AnimalCarnivoro extends Animal {
@Override // esto significa que se sobre escribe el metodo abstracto. 
public void alimentarse(){
    System.out.println("El animal carnivoro se alimenta de carne");
}
}
