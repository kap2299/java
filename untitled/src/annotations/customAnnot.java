package annotations;
//to make custom annotations we create interface to make annot,fro ex--

import java.lang.annotation.ElementType;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE})//* for which field annot are being used
@Retention(RetentionPolicy.RUNTIME)//for how long annot will be runing
@interface cricketPlayer  //we are creating an annotation through an inerface by adding "@" in start
{

}
@cricketPlayer //now we van use annotation cricket player
class virat
{
    @cricketPlayer
    private int innings;
    private int runs;

    public void setInnings(int innings) { //setter for inning
        this.innings=innings;}
    public int getInnings() {            //getter for inning
        return innings;}
    public void setRuns(int runs) {      //setter for runs
        this.runs=runs;}
    public int getRuns() {                //getter for runs
        return runs;}
}

public class customAnnot {
    public static void main(String[] args) {

    }
}
