package oops.Polymorphism;
class Land extends Vehicle
{
    static void display()
    {
        System.out.println("Moves in land");
    }

    int a;
    int b;
  public int sum(int a, int b)
  {
      return a+b;
  }


  public float sum(float a, float b)
  {
      return a+b;
  }

}
class Water extends Land
{
    static void display()
    {
        System.out.println("Swims in water");
    }
}
class Air extends Land
{
  static  void display()
    {
        System.out.println("Fly's in Air");
    }
}
public class Vehicle
{
    public static void main(String[] args)
    {
    Land.display();
    Air.display();
    Water.display();

    Land l1 = new Land();
        System.out.println(l1.sum(12,32));
        System.out.println(l1.sum(13,43));


    }
}
