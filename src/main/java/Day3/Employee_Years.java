/*
"Suppose that a class, Employee, is defined as follows:
  class Employee {
  String lastName;
         String firstName;
  int yearsWithCompany;
              }
Suppose that data about 30 employees is already stored in an array:
Employee[] employeeData = new Employee[100];
Write a program that will output the first name, last name of each employee who has been with the company for 20 years or more."
 */
package Day3;

public class Employee_Years {

    public static void main(String[] args)
    {

        Employee[] employeeData = new Employee[100];
        employeeData[0]=new Employee("Tony","Stark",10);
        employeeData[1]=new Employee("Aleena","Wilson",5);
        employeeData[2]=new Employee("JP","Kumar",20);

        try
        {

            for(int i=0;i< employeeData.length-1;i++)
            {
                if(employeeData[i].getYearsWithCompany()>=20)
                {
                    System.out.println(employeeData[i].getFirstName());
                    System.out.println(employeeData[i].getLastName());
                }
            }
        }
        catch(Exception e)
        {

        }
    }
}
