import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//files and directories 1
public class ioSecond {
    public static void main(String[] args) throws IOException
    {
//        File file1= new File("kap.txt");//it will check of the file nam in the pkg and start reffering to it
//        System.out.println(file1.exists()); //it will give false because theres no file named kap.txt
//
//        file1.createNewFile(); //it will create a new file
//        System.out.println(file1.exists());

        File dir1= new File("kareem");
        dir1.mkdir();
        File file2= new File(dir1,"kap2.txt");
        file2.createNewFile();

        FileWriter fw= new FileWriter(file2,true);//by 'true' no change will be there in existing data while adding new data
        fw.write("kareem");
        fw.write("\n");
        fw.write(40);
        fw.write("\n");
        fw.write(79);
        fw.write("\n");
        char c[]={'j','a','v','a'};
        fw.write(c);
        System.out.println("the contents are being written in kap2");

        fw.close();


    }
}
