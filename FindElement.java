import java.util.Scanner;

public class FindElement 
{
     public static void main(String[] args) 
     {
        Scanner sc= new Scanner( System.in);

        int a [] = new int [5];
        int element;
        System.out.println(" enter" + a.length + " element in array ");
        for ( int i =0 ; i< a.length ; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println(" enter find element");
        element = sc.nextInt();
        for ( int i =0 ; i< a.length ; i++)
        {
            if ( a[i] == element)
            {
            System.out.println(" element on " + i  + " position");
            break;
            }
            else 
            System.out.println(" element is not found ");
    
           
         }

    



        
     }    
}
