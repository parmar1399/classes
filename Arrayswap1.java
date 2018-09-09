import java.lang.*;
import java.util.*;
class Arrayswap
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner(System.in);
    System.out.println("enter the size");
    int b,i,j,temp=0;
    b=ss.nextInt();
    int b[] =new int [b];
    for(i=0;i<b;i++)
    {
   b[i]=ss.nextInt();
    }
    for(i=0;i<b;i++)
    {
      System.out.println(b[i]);
    }
    for(i=0;i<=1;i++)
    {
      int q=0;
      q=b[i];
      b[i]=b[i+1];
      b[i+1]=q;
    }
    for(i=b-3;i<b-1;i++)
    {
      int q=0;
      q=b[i];
      b[i]=b[i+1];
      b[i+1]=q;
    }
    for(i=0;i<b;i++)
    {
      System.out.println(b[i]);
    }
  }
}