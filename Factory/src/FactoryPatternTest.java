
public class FactoryPatternTest {
	
	public static void main(String[] args){
		Animal animal = AnimalFactory.getAnimal("cachorro");
		animal.speak();
		
		animal = AnimalFactory.getAnimal("gato");
		animal.speak();
		
		animal = AnimalFactory.getAnimal("raposa");
		animal.speak();
	}

}
