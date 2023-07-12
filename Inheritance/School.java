package oops.Inheritance;
class Teacher
{
    int basicSalary;
    int tax;


    public int countSalary(int basicSalary, int tax)
    {
        return basicSalary+tax;
    }


}

class Workers extends Teacher
{

}

class Principal extends Teacher
{

}

public class School
{
    public static void main(String[] args)
    {

        Teacher t1 = new Teacher();
        int teacherSalary = t1.countSalary(7000,211);
        System.out.println("Teacher Salary : " + teacherSalary);

        Workers w1 = new Workers();
        int workerSalary = w1.countSalary(4354,54);
        System.out.println("Worker Salary : "+workerSalary);

        Principal p1 = new Principal();
        int principalSalary = p1.countSalary(45666,3322);
        System.out.println("Principal : "+principalSalary);




    }
}
