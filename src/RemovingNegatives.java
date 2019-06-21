import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.*;

public class RemovingNegatives {

    public static void main(String ... args){
        test(new LinkedList<>());
        test(new ArrayList<>());

    }

    private static void test(List<Integer> list){

        System.out.println(list.getClass().getSimpleName());
        Random rand = new Random(0);
        for(int i=0;i< 1000;i++){
            list.add(i);
        }
        long time =System.nanoTime();
        try {
            for(Iterator<Integer>it= list.iterator();it.hasNext();){
                list.removeIf(v-> v < 0);
            }
        }
        finally {
            time = System.nanoTime()-time;
            System.out.println(time/1000000);
        }

    }
}
