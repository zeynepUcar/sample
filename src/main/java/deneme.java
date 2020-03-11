import java.util.ArrayList;

public class deneme {



    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "BMW";
        car1.count++;
        System.out.println( car1.name + " : " + car1.count);

        Car car2 = new Car();
        car2.name = "BMW";
        car2.count++;
        System.out.println( car2.name + " : " + car2.count);

        Car car3 = new Car();
        car3.name = "BMW";
        //car3.count++;
        System.out.println( car3.name + " : " + car3.count);

    }



}
class Car{
    public static String name;
    public static int count = 0;
}
