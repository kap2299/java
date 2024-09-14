import javax.xml.transform.Source;

public class arrayPrac {
    public static void main(String[] args) {
//        int a[]={9,8,7,6};
//        for (int i=0; i<=3; i++)
//        {
//            System.out.println(a[i]); for 1D array
//        }


//           int nums[][]= new int[3][2];    for 2d array
//           nums[0][0]=5;
//           nums[0][1]=6;
//           nums[1][0]=9;
//           nums[1][1]=8;
//           nums[2][0]=2;
//           nums[2][1]=1;
//
//
//           for(int i=0;i<=2; i++)
//           {
//               for(int j=0; j<=1; j++)
//               {
//                   System.out.print(nums[i][j]);
//               }
//               System.out.println();
//           }
//       int nums[]={5,4,7,8};                 //for enhanced loop || 1-D array
//       for(int a: nums)
//       {
//           System.out.println(a);
//       }
        int nums[][]= { {5,2,3,6},
                        {8,3,6,4},
                        {9,4,8,1}
                      };
             for(int a[]: nums)
             {
                 for(int b: a)
                 {
                     System.out.print(b + " ");
                 }
                 System.out.println();
             }

        }
}
