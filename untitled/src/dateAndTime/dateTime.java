package dateAndTime;

public class dateTime {
    public static void main(String[] args) {

        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long tmInMs= dt.getTime();
        java.sql.Date dt1= new java.sql.Date(tmInMs); //sql date has to have parameteres
        System.out.println(dt1);
    }
}
