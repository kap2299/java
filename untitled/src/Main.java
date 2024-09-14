public class Main
{
    public static void main(String[]args)
      {
       int n=11;

       for(int i=0; i<n; i++)
       {
           for(int j=0; j<n; j++)
           {
           //    if (i+j==(n-1) || i==j || i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2) for X series
           //    if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) // for K
               //  if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<(n-1)/2 || j==(n-1)/2&&i<(n-1)/2&&i>(n-1)/2&&i<(n-1)) for c
               if (i==0&& j<(n-1)/2 || j==0&& i<(n-1)/2 || i+j<=(n-1)/2 || i==0&& j>(n-1)/2 || j==(n-1)&& i<=(n-1)/2 || j-i>=(n-1)/2 ||
               j==0 || i==(n-1)&&j<=(n-1)/2 || i-j>=(n-1)/2 || j==(n-1) || i==(n-1) || j+i>=(n-1)+(n-1)/2 || j==(n-1)/2 || i==(n-1)/2)
               {
                   System.out.print(" * ");
               }
               else
               {
                   System.out.print("   ");
               }
           }
           System.out.println();
       }
      }
}