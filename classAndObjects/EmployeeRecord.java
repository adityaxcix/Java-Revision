package oops.classAndObjects;

public class EmployeeRecord
{

       static  int empID = 1;
     static String empName = "Aditya";



    void print()
    {
        System.out.println(empID);
        System.out.println(empName);
    }

    public static void main(String[] args)
    {
        EmployeeRecord e1 = new EmployeeRecord();
        e1.print();
    }
}
