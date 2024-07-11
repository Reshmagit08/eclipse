package oops;


class father{
public void  fathermethod()
{
	System.out.println("father");
	
	}

}

class son{
	public void  sonmethod()
	{
		System.out.println("son");	
	}
	
}

class grandfather{
	public void  grandfathermethod()
	{
		System.out.println("grandfather");	
	}
	
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grandson ob=new grandson();
		ob.parentmethod();
		ob.childmethod();
	}

}
