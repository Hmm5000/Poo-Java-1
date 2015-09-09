
public class ManadaVirgula extends Manada {
	String barulho = "";
	@Override
	public String estorar(){
		for(Animal n: animais){
			barulho = barulho + n.fazerBarulho() + ",";
		}
		return barulho;
	}

}
