package Model;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Hamburg
{
    Queue<Wagon> trackArrival= new LinkedList<>();
    int counter = 0;

    // Creates all of our tracks
    public Hamburg(){
        for (int i = 0; i < 100; i++){
            trackArrival.offer(new Wagon());
        }
    }

    public void showDetails() {
       for (Wagon wagon: trackArrival) {
                System.out.print(wagon + ", ");
                counter++;
                if(counter == 10)
                {
                    System.out.print("\n");
                    counter = 0;
                }

       }
    }
}
