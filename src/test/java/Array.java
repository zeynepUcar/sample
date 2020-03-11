public class Array {
    public static void main(String[] args) {


        int[] i1 = new int[5];

        String[] s1 = new String[]{"new jersey", "new york", "atlanta", "new york"};

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("new york")) {
                s1[i] = "boston";
            }
        }
        for (String s : s1) {
            System.out.println(s);
        }
        System.out.println("--------------");


        //         Count Number Of Words In The String

        String s2 = "count the words in the string";

        String[] s3 = s2.split(" ");

        char[] c1 = s2.toCharArray();

        int a = c1.length - (s3.length);

        System.out.println(a);
        System.out.println("--------------");

        //      create one int array and store variables 2 , 4, 5 ,6
        //              sum all the numbers in the array

        int[] arr = {2, 4, 5, 6};

        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        System.out.println(sum);
        System.out.println("--------------");


        //      create one int array   2,6,8,7,5,2
//         if the number is odd sum it if the number is even minus it

        int[] int1 = new int[]{2, 6, 8, 7, 5, 2};

        int result = 0;

        for (int i = 0; i < int1.length; i++) {

            if (int1[i] % 2 == 1) {

                result += int1[i];

            } else {

                result -= int1[i];
            }

        }

        System.out.println("if odd sum if even minus result ==   " + result);

        System.out.println("--------------");

        //create a string and sum all the numbers

        String str = "44335566";
        char[] chr = str.toCharArray();

        int total = 0;

        for (int i = 0; i < chr.length; i++) {
            total += Integer.parseInt(String.valueOf(chr[i]));
        }
        System.out.println(total);

//         create int array  -      2,5,40 ,70 ,95, 98
//                   prints two numbers in that array whose sum equals to 100?
//                      If there are more than 1 pair , print all.

        int[] numbers1 = {2, 5, 40, 70, 95, 98};
        int sum4 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                sum4 =numbers1[i]+numbers1[j];
                if(sum4==100){
                    System.out.println(numbers1[i]+" " +numbers1[j]);

                }
    }}}}