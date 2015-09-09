
public class Gato extends Animal{
	public Gato(String x, int y, double z){
		super(x,y,z);
	}
	
	@Override
	public String fazerBarulho(){
		return "miau";
	}

}
