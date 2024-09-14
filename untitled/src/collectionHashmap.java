import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class collectionHashmap {
    public static void main(String[] args) {
        HashMap hm1= new HashMap();

        hm1.put(11,"kareem"); //entry
        hm1.put(22, "khushi");
        hm1.put(23, "ashraf");

        System.out.println(hm1);

        //if we want to maintain the order of insertion

        LinkedHashMap lnkmp= new LinkedHashMap();
        lnkmp.put(33,"kohli"); //entry
        lnkmp.put(21,"rohit");
        lnkmp.put(25,"pandaya");
        lnkmp.put(45, "rohan");

        System.out.println(lnkmp);
    }
}
