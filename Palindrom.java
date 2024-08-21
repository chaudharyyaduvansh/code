public class Palindrom 
{
    public static void main(String[] args) 
    {
        String s1 = " Tanishk";
        // convert string into lower case;
         s1 = s1.toLowerCase();
         boolean flag = true;
        // System.out.println(s1);
         for (int i = 0 ; i< s1.length()/2; i++)
         {
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1))
          {
            flag = false ;
            break;
          }
            
         }
        
         if (flag )
         System.out.println( s1 + " is not palindrom");
         else 
         
         System.out.println( s1 + " is palindrom");
    
             }  
                
    }
            
