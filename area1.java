class rectangle

{
    
     double length , breadth;
  
     rectangle(double a ,double b)
 
    {
  
              this.length = a;
  
              this.breadth = b;

     }
 
    double calculate_area()

    {

         return (length*breadth);

    }

}

public class calculatearea

{

    public static void main(String args[])

    {
 
       rectangle rec = new rectangle(11,16);
      System.out.println("Area : " + rec.calculate_area());

 
    }
}