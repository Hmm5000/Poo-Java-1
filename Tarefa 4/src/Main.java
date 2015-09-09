
public class Main {
	public static void main(String[] args){
		Cachorro C = new Cachorro("Husky Siberiano", 1, 12);
		Gato G = new Gato("Persa", 1, 7);
		
		ManadaVirgula manaVirgula = new ManadaVirgula();
		ManadaSustenido manaSustenido = new ManadaSustenido();
		
		manaVirgula.adicionarAnimal(C);
		manaSustenido.adicionarAnimal(C);
		
		manaVirgula.adicionarAnimal(G);
		manaSustenido.adicionarAnimal(G);
		
		System.out.println(manaVirgula.estorar());
		System.out.println(manaSustenido.estorar());
		
	}
	

}
