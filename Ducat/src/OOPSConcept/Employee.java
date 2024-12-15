package OOPSConcept;

public class Employee {
	
	public String E_name;
	public String E_id;
	public String E_address;
	public String aadhar_num;
	public String pan_num;
	
	public Employee(String employeeName, String Emplyee_id,String E_Address, String E_Aadhar, String Pan_number ) 
	{
		this.E_name=employeeName;
		this.E_id=Emplyee_id;
		this.E_address=E_Address;
		this.aadhar_num=E_Aadhar;
		this.pan_num=Pan_number;
		
	}
	
	public void DisplayDetails() 
	{
		System.out.println("The Name of employee is " + this.E_name);
		System.out.println("The id of employee is " + this.E_id);
		System.out.println("The Address of employee is " + this.E_address);
		System.out.println("Aadhar Number: " + this.aadhar_num);
		System.out.println("Pan Number: " + this.pan_num);		
	}	

}
