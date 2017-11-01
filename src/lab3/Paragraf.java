package lab3;

public class Paragraf implements Element {
	private String text();
	Paragraf(Strig text){
		this.text=text;
	}
	public void print() {
		System.out.println(text);
	}
	public void add (Element e) throws Exception {
		
	}

}
