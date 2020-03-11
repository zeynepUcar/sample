import java.util.HashSet;

public class SetRecap {

    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();

        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(4);

        for (Integer integer : h1) {
            System.out.println(integer);
        }

        //LinkedHashSet : if you care insertion order, use it
    }
}
