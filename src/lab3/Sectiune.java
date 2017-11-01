package lab3;

import java.util.ArrayList;

public class Sectiune implements Element {
	private String titlu;
	private ArrayList<Element>continutSectiune=new ArrayList<Element>();
	public add(Element e)throws Exception{
		continutSectiune.add(e);
	}
	public Element getElement(int index) {
		return continutSectiune.get(index);
	}
	public void print () {
		System.out.println(titlu);
		for(Element e:continutSectiune)
			e.print();
	}
	
	

}
