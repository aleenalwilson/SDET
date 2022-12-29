package Day3;

public class Employee {

    String lastName;
    String firstName;
    int yearsWithCompany;

    Employee(String firstName, String lastName,int yearsWithCompany)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.yearsWithCompany=yearsWithCompany;
    }

    int getYearsWithCompany()
    {
        return yearsWithCompany;
    }

    String getLastName()
    {
        return lastName;
    }

    String getFirstName()
    {
        return firstName;
    }

}
