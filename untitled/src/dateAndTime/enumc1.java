package dateAndTime;


enum result
{
    PASS, FAIL, NORESULT;

    int marks;

    result()
    {
        System.out.println("in constructor");
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}
public class enumc1 {
    public static void main(String[] args) {

//        result ps=result.PASS;
//        System.out.println(ps);

        result.PASS.setMarks(40);
        int n1=result.PASS.getMarks();
        System.out.println(n1);

        int m2=result.FAIL.getMarks();
        System.out.println(m2);// it will give 0 because the inital value of enu variable is 0(because set method is not called)

        result.NORESULT.setMarks(22);
        int m3=result.NORESULT.getMarks();
        System.out.println(m3);

    }
}
