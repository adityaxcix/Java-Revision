package oops.Inheritance;
class Developer
{
    int BasicSal;
    int tax;

     int printSalary(int Basicsal, int tax )
    {
        return Basicsal+tax;
    }

}

class Tester extends Developer
{

}

class DbAdmin extends Tester
{

}

public class Company
{
    public static void main(String[] args)
    {

        // Create an object of Developer class
        Developer developer = new Developer();
        developer.BasicSal = 5000;
        developer.tax = 1000;
        int developerSalary = developer.printSalary(developer.BasicSal, developer.tax);
        System.out.println("Developer Salary: " + developerSalary);

        // Create an object of Tester class
        Tester tester = new Tester();
        tester.BasicSal = 4000;
        tester.tax = 800;
        int testerSalary = tester.printSalary(tester.BasicSal, tester.tax);
        System.out.println("Tester Salary: " + testerSalary);

        // Create an object of DbAdmin class
        DbAdmin dbAdmin = new DbAdmin();
        dbAdmin.BasicSal = 6000;
        dbAdmin.tax = 1200;
        int dbAdminSalary = dbAdmin.printSalary(dbAdmin.BasicSal, dbAdmin.tax);
        System.out.println("DB Admin Salary: " + dbAdminSalary);
    }

    }

