public class factorial {
    // static int recursion(int n)
    // {
    //   if(n==0 || n==1)
    //   {
    //     return 1;
    //   }
    //   else{
    //     return n * recursion(n-1);
    //   }
    // }

    static int recursion_iterative(int n)
    {
      if(n==0 || n==1)
      {
        return 1;
      }
      else{
        int product = 1;
        for(int i=1; i<=n; i++)
        {
            product *= i;
        }
        return product;
      }
    }
    public static void main(String args[])
    {
      int x =5;
      //System.out.println("The value of factorial x is :" + recursion(x));
      System.out.println("The value of factorial x is :" + recursion_iterative(x));
    }
}
