class febbonaci {
    public static void main(String[] args) {
        int n1= 0 ;
        int n2= 1 ;
        int  i,n3;
        int n =10;
        System.out.print(n1);
        System.out.print(" " +n2);

        for ( i =0 ; i<= n-1 ; i++ )
        
        {
            n3 = n1+n2;
            System.out.print(  " " + n3);
            n1=n2;
            n2=n3;

        }
        
    }
}