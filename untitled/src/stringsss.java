public class stringsss
{
    public static void main(String[] args) {
//        String brand= "pwskills";
//        System.out.println(brand);  //ex. of immutable string(non changeable)
//
//        StringBuilder brand1= new StringBuilder("pwskills");
//        System.out.println(brand1); //ex. pf mutable strings(changeable)
//        brand1.append("bengaluru"); // here string is changes from pwskill to bengaluru
//        System.out.println(brand1);

             //now ways to declare strings
//        String s1="pwskill";//without new kwyword
//        String s2="pwskill";
//
//        String s3= new String("pwskill");//with new keyword
//        String s4= new String("pwskill");
//        System.out.println(s1==s2);//it wil be true because this type of strings are
//                                  // store in one memory in string constant pool,
//                                  doesnt allow duplicacy
//        System.out.println(s3==s4);//it will be false because both are
//                                  // different values stored in directly in heap memory
//        String s1= "pwskills";
//        String s2= new String("pwskills");
//        System.out.println(s1==s2); //false because s1 is in scp and s2 is in heap area
//        System.out.println(s1.equals(s2)); //true because both have same cntent,
        // equals()=contents in obj


        //mutable strings(changeable)


//        StringBuffer sb=new StringBuffer("Virat");
//        System.out.println(sb);
//        sb.append(" kohli");              //using string buffer
//        System.out.println(sb);

        StringBuilder sb=new StringBuilder("Virat");
        System.out.println(sb);
        sb.append(" kohli");                //using string Builder
        System.out.println(sb);


    }
}
