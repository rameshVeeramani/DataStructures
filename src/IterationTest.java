import javax.swing.border.EmptyBorder;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IterationTest {

    /*
    THE OUTPUT
BEFORE [one, r2, r3, r4, 5]
AFTER [one, r3, 5]

IT DIDNT REMOVE R3 BECAUSE ----- R3 TOOK THE POSITION OF R2 WHEN R2 GOT REMOVED AND NEVER GOT PROCESSED.
SO ENUMERATION VECTOR .. NEVER GETS CONSIDERD SO TO FIX IT ..


    * */
    public static void main (String ... args ){

        Vector<String> items = new Vector<>();
        Collections.addAll(items,"one","r2","r3","r4" ,"5");

        System.out.println("BEFORE " +items);
        //Enumeration<String> enumeration = items.elements();
        Enumeration<String> enumeration = items.elements();
        Vector<String> toRemove = new Vector<>();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            if (element.startsWith("r"))
            {
                // items.remove(element);
                toRemove.add(element);
            }

        }
        items.removeAll(toRemove);
        System.out.println("AFTER " +items);

/*
        Vector<String> iitems = new Vector<>();
        Collections.addAll(iitems,"one","r2","r3","r4" ,"5");
        Iterator<String> III = iitems.iterator();

        while (III.hasNext()) {
            String EE = III.next();
            if (EE.startsWith("r"))
            {
                iitems.remove(EE);
            }
        }
        System.out.println("IITEMS "+iitems);*/



//CopyonWriteArray  >> is a quadaratic performance --- it woulc be slow wwhen it grows big

        var iitems = new CopyOnWriteArrayList<String>();
        Collections.addAll(iitems,"one","r2","r3","r4" ,"5");
        Iterator<String> III = iitems.iterator();
        while (III.hasNext()) {
            String EE = III.next();
            if (EE.startsWith("r"))
            {
                iitems.remove(EE);
            }
        }
        System.out.println("IITEMS CopyOnWriteArrayList "+iitems);


    }
}
