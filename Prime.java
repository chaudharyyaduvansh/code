import java.util.Scanner;

class Prime{
    public static void main ( String args[])
    {
    Scanner sc = new Scanner(System.in);    

      System.out.println(" enter the number");
      int n = sc.nextInt();
     int  flag =0;
     if ( n==0|| n==1)
     {
        System.out.println(n + " number is prime ");
    
     }
     int i ;
     for (i=2 ; i>=n; i++)
     {
        if ( n%2 == 0)
        {
        System.out.println(n + " number is not prime ");
          flag =1 ;
          break;

        }
        if ( flag ==0)
        {
        System.out.println(n + " number is prime ");

        }
     }


    }
}