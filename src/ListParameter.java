import java.util.List;

public class ListParameter<T> extends Parameter {

	
	private List<T> values;
	
	public void setList(List<T> values){
		this.values=values;
	}
	
	public void appendValue(T value){
		this.values.add(value);
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(this.flag);
		builder.append(" ");
		for(T item  : values)
			builder.append(item);
		
		return builder.toString();
	}
}