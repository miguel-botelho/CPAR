/**
 * Created by danie on 17/02/2017.
 */
public class Timer {

    long startTime;
    long endTime;

    public Timer() {
    }

    public void Start(){
        startTime = System.nanoTime();
    }

    public void End(){
        endTime = System.nanoTime();
    }

    public double getExecutionTime(){
        long duration = ((endTime - startTime)/1000000);  //divide by 1000000 to get milliseconds.
        return (int)(duration/1000)+(duration%1000)*0.001;
    }
}
