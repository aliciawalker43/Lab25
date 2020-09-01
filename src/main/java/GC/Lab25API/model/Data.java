package GC.Lab25API.model;

import java.util.Arrays;
import java.util.List;

public class Data {

	private List<String> text;
	
	

	public Data() {
		super();
	}



	public List<String> getText() {
		return text;
	}



	public void setText(List<String> text) {
		this.text = text;
	}



	@Override
	public String toString() {
		return "Data [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	public Data(List<String> text) {
		super();
		this.text = text;
	}


	
	

	
	
	
	
}
