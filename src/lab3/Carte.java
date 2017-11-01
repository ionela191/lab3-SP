package lab3;

import java.util.ArrayList;

public class Carte 
{
	ArrayList<Element> elemente = new ArrayList<Element>();

	
	public Carte() 
	{
		
	}
	
	public void addElement(Element elem)
	{
		elemente.add(elem);
	}
	
	public void print()
	{
		for(int i=0;i<elemente.size();i++)
		{
			System.out.println(elemente.get(i));
		}
		
	}
	
}
