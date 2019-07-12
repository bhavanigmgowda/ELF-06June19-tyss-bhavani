package com.tyss.assignment.javafour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * WAP to read the data of emp from csv file and write the data into object and store the object into array
 */
public class Pro6 {
private static final String COMMA_DELIMITER = ",";
    
    public static void main(String args[])
    {
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader("Employee.csv"));
            
            //Create List for holding Employee objects
            List<Employee> empList = new ArrayList<Employee>();
            
            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) 
            {
                String[] employeeDetails = line.split(COMMA_DELIMITER);
                
                if(employeeDetails.length > 0 )
                {
                    //Save the employee details in Employee object
                    Employee emp = new Employee(Integer.parseInt(employeeDetails[0]),
                            employeeDetails[1],employeeDetails[2],
                            Integer.parseInt(employeeDetails[3]));
                    empList.add(emp);
                }
            }
            
            //Lets print the Employee List
            for(Employee e : empList)
            {
                System.out.println(e.getEmpId()+"   "+e.getFirstName()+"   "
                		+e.getLastName()+"   "+e.getSalary());
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
           }
}
/*	public static void main(String[] args) {
		ObjectInputStream obj1=null;
		FileInputStream fin=null;
	try {
		
		fin=new FileInputStream("person1.csv");
		obj1= new ObjectInputStream(fin);
		Person p=(Person)obj1.readObject();
		System.out.println("name:"+p.name);
		System.out.println("ID:"+p.age);
		System.out.println("ID:"+p.designation);
		System.out.println("ID:"+p.salary);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	finally
	{
			try {
				if(obj1!=null)
				obj1.close();
				if(fin!=null)
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
}


*/
