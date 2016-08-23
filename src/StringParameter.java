
public class StringParameter extends Parameter {

	
	private String value;
	
	public void setValue(String value){
		this.value=value;
	}
	
	@Override
	public String toString(){
		return this.flag + " " + value;
	}
	
}