
public class Parameter {

	
	protected String flag;
	
	public void setFlag(String flag) throws Exception{
		if(!flag.startsWith("-"))
			throw new Exception();
		this.flag = flag;
	}
	
	
}
