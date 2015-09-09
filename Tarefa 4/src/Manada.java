import java.util.List;
import java.util.LinkedList;

public abstract class Manada {
	List<Animal> animais = new LinkedList<Animal>();
	public abstract String estorar();
	
	public void adicionarAnimal(Animal ani){
		animais.add(ani);
	}

}
