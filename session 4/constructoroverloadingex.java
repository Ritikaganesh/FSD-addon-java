package session3;

public class constructoroverloadingex {
		private String empname;
		private int empid;
		private String location;

	public constructoroverloadingex(String empname, int empid, String location){
	this.empname = empname;
	this.empid = empid;
	this.location = location;
}
	public constructoroverloadingex(String empname,String location) {
		this(empname,0,location);
	}
	public constructoroverloadingex(String empname,int empid) {
		this(empname,empid,null);
	}
public void displayInfo() {
System.out.println("empname: "+this.empname);
System.out.println("empid: "+this.empid);
System.out.println("emp location: "+this.location);
}	
	 public static void main(String[] args) {
		 constructoroverloadingex cox = new constructoroverloadingex("Ritika",232220,"cbe");
		 constructoroverloadingex cox1 = new constructoroverloadingex("sandy","cbe");
		 constructoroverloadingex cox2 = new constructoroverloadingex("anu",12345);
			cox.displayInfo();
			cox1.displayInfo();
			cox2.displayInfo();
	}

}
