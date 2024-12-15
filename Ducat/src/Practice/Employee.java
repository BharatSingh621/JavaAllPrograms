package Practice;

import LearningJava.My_Math;

public class Employee 
{

	public void cal_Percetage() 
	{
		My_Math math1 = new My_Math();
		
		int percetage = math1.Average(34, 23, 23, 31);
		
		int percetage2 = math1.find_Average(45, 23, 11, 11);
		
		System.out.println("The percetage of Student is:" + percetage);
		
	}
}
