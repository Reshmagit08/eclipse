public void setEmpname(String empname) {
	this.empname=empname;
}
public int getEmpid() {
	return empid;
	
}

public void setEmpname(int empid) {
	this.empid=empid;

}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employeee ob= new Employeee();
		ob. setEmpid(101);
		ob.setempname("arun")
		System.out.println(ob.getempid());
		System.out.println(ob.getname());
		
	}

}
