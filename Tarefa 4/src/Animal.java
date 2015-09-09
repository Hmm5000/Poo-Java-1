
public class Animal {
	private String raca;
	private int idade;
	private double peso;
	
	public Animal(String x, int y, double z){
		raca = x;
		idade = y;
		peso = z;
		
	}
	
	public String fazerBarulho(){
		return "O barulho do animal é ";
	}

}
