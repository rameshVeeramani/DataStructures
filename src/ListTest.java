import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


/*
This shows that Linkedlist are quadartic . compared to that of Linkedlist

* */
public class ListTest {

    public static  void main(String... args){
        test(new LinkedList<>());
        test(new ArrayList<>());
    }

    private static void test(List<Integer> list){

        int SIZE =  10000;
        System.out.println(list.getClass().getSimpleName());
        for(int i =0; i< SIZE;i++){
            list.add(i);
        }
        Random rand = ThreadLocalRandom.current();
        long time = System.nanoTime();
        try {
            for (int i =0; i < SIZE;i++){
                //list.set(10000/2,list.get(0));
                //list.add(list.remove(SIZE/2));
                /* here the Linked list does much better than the arraylist.. so the more the further away
                from the beginning you go the array list is better .. but for the beginning. the linked list is good

                 */
                list.add(list.remove(0));
                list.add(list.remove(rand.nextInt(SIZE)));
            }
        }finally {
            time = System.nanoTime()-time;
            System.out.printf("time = %dms%n",(time/1000000));
        }

    }
}
