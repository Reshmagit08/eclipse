package pkg;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("-----relational operator-----");
int v1=20,v2=10;
System.out.println(v1==v2);//true
System.out.println(v1>v2);


System.out.println("-----logical operator-----");
//      A        B         A&B         A|B        !A         !B
//      T        T          T           T          F          F

//      T        F          F          T          F           T
//      F        T          F           F         T            F
//      F        F          F           F         T            T

String username="abc";
String pswrd   ="Abc123";
System.out.println(username=="abc"&& pswrd=="Abc123");
System.out.println(username=="abc"|| pswrd=="Abc123");
System.out.println(!(username=="abc"));

System.out.println("------uranary operator-----");
//++increment by 1
//--decrement by 1

int v3=5;
System.out.println(v3++);//5
System.out.println(v3);//6
System.out.println(++v3);//7


System.out.println("------teranary operator-----");
//variable=condition?exp1:exp2;
String ans=v1>v2? "v1 is greater":"v2 is greater";
System.out.println(ans);









	}

}
