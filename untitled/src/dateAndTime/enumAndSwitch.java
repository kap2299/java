package dateAndTime;

enum result1
{
    PASS, FAIL, NR;

}

public class enumAndSwitch {
    public static void main(String[] args) {

        result1 res= result1.FAIL;

        switch (res)
        {
            case PASS: System.out.println("passed");
            break;
            case FAIL: System.out.println("failed");
            break;
            case NR: System.out.println("no result");
            break;
        }

    }
}
