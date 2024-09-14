import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readerFile {
    public static void main(String[] args) throws IOException
    {

        File dir= new File("kareem");
        File file= new File(dir,"kap2.txt");

        FileReader fr= new FileReader(file);
        int i=fr.read();

        while (i!=-1)
        {
            System.out.println(i+ "--------->");
            System.out.println((char)i);
            i= fr.read();
        }
    }
}
