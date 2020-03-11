import java.util.ArrayList;
import java.util.List;

public class ArraylistRecap {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(  );

        list1.add( 1 );
        list1.add( 2 );
        list1.add( 3 );
        list1.add( 4 );

        List<Integer> list2 = new ArrayList<Integer>(  );

        list2.add( 1 );
        list2.add( 5 );
        list2.add( 3 );
        list2.add( 7 );

        for (int i = 0; i < list1.size(); i++) {
            for (int i1 = 0; i1 < list2.size(); i1++) {
                if (list1.get(i) == (list2.get(i1))){
                    System.out.println(list1.get(i));
                }
            }
        }
        //create one String arraylist apple, orange banana and orange, change the orange to pineapple

        List<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange");

        //fruit.set(1,"pineapple");  //1. way to change specifik index

        //2.way to change all oranges to pineapple

        for (int i = 0; i < fruit.size(); i++) {
            if (fruit.get(i).equals("orange")){
                fruit.set(i, "pineapple");
            }
        }
        System.out.println(fruit);

        //create integer array 1,4,7,6, print second max in the arraylist

        int max = Integer.MIN_VALUE;
        int  max2 = 0;

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max){
                max2 = max;
                max = numbers.get(i);
            }else if (numbers.get(i) > max2){
                max2 = numbers.get(i);
            }
        }
        System.out.println(max2);







    }
}
