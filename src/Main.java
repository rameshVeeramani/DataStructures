import java.util.*;

public class Main {

    public static void main(String[] args) {
        //o(1)
        //o(n)

        /*
         * Log is better
         * but the best is
         * quasileaner  >> reduces with more input.
         * */

        List<Integer> values = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            values.add(i);
            //  THIS IS NOT right because
            //  Integer = 16 bytes
            //  NODE = 12 + 4+ 4 + 4 = 24 BYTES .
            //  EVERY NODE IS 24 BYTE..
            //  THAT IS 400_024 BYTE FOR A 10K INTEGER
            //Array list are better than linkedlist ... that provides better memory
        }

        var l = List.of(1, 2, 3);
        System.out.println("list1 " + l);

        var ll  = new LinkedList<Integer>();
        System.out.println(ll instanceof RandomAccess);
    }
}
