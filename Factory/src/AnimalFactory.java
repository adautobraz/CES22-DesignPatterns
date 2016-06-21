
public class AnimalFactory {
	
	public static Animal getAnimal(String criteria)
	{
		if ( criteria.equals("gato"))
			return new Cat();
		else if (criteria.equals("cachorro"))
			return new Dog();
		else if (criteria.equals("raposa"))
			return new Fox();
		
		return null;
	}

}
