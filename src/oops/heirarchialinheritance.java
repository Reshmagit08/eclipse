package oops;


class Animal
{
	public void Animalmethod()
	{
		System.out.println("Animalmethod");
		
	}
class lion extends Animal
{
public void lionmethod()
	{
		System.out.println("LION");
		
	}
}

class Tiger extends Animal
{
	public void Tigermethod()

{
	System.out.println("Tiger");
	
}
}


public class heirarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tiger t= new Tiger();
		t.tigermethod();
		t.animalmethod();

	}

}}
