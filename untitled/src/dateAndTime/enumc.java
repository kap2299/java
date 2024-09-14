package dateAndTime;
enum week
{
    MON, TUE,WED,THU,FRI,SAT,SUN;
}
public class enumc {
    public static void main(String[] args) {
        week m=week.MON;
        System.out.println(m);

        int index= m.MON.ordinal();
        System.out.println(index);

        week wa[]= week.values();
        for (week w1: wa)
        {
            System.out.println(w1+ "   :   "+ w1.ordinal());
        }
    }
}
