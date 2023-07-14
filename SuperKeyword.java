package BasicPrograms;

class Employee
{
    int Empid = 1;

    void display()
    {
        System.out.println("This is display() method which belongs to Employee class");
    }

    void show()
    {
        System.out.println("This is a shiw() method which belongs to the Employee class");
    }


}

class CEO extends Employee
{
    int Empid = 443;

    void disp()
    {
        System.out.println(Empid);
        System.out.println(super.Empid);
    }

    int add(int a, int b)
    {
        return Empid + super.Empid;
    }

    void invoke()
    {
        super.display();
        super.show();
    }


    void display()
    {
        System.out.println("This is display() method which belongs to CEO class");
    }

    void show()
    {
        System.out.println("This is a shiw() method which belongs to the CEO class");
    }
}

class Animal
{
    Animal()
    {
        System.out.println("animal is created");
    }
}

class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.println("dog is created");
    }
}

class TestSuper3
{
    public static void main(String args[])
    {
        Dog d = new Dog();
    }
}


public class SuperKeyword
{
    public static void main(String[] args)
    {
        CEO demoCEO = new CEO();
        demoCEO.disp();
        System.out.println(demoCEO.add(demoCEO.Empid, demoCEO.Empid));
        demoCEO.display();
        demoCEO.invoke();

    }
}
