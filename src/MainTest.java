import Information.Destination12;
import Model.Hamburg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrik on 10-04-2016.
 */
public class MainTest
{
    public static void main(String[] args)
    {
        Hamburg hamburgMaschen =  new Hamburg();
        hamburgMaschen.addWagonsToTracks();

        hamburgMaschen.trackDetails();

        /*
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "D");
        for(String str: list) {
            System.out.println(str);
        }
        */
    }
}