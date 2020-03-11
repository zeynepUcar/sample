import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.ArrayList;
import java.util.HashMap;

public class MapRecap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "apple");
        map1.put(2, "orange");
        map1.put(3, "apple");
        map1.put(4, "apple");

        for (Integer num : map1.keySet()) {
            System.out.println(num);
        }


//        HomeWork 1:   find a unique element in the arraylist  Apple Orange Apple Apple
//        result should be Orange
        ArrayList<String> s1 = new ArrayList<String>(  );

        s1.add( "Apple" );
        s1.add( "Orange" );
        s1.add( "Apple" );
        s1.add( "Banana" );
        s1.add( "Banana" );

        String result12 = null;

        outerloop:
        for(int i=0; i<s1.size() ; i++ ){

            for(int j = 0; j<s1.size() ; j++){

                String i1 = s1.get( i );
                String j1 = s1.get( j );

                int size = s1.size()-1;

                System.out.println(i1 + " "+ j + " " + result12 + " --" + j1 );

                if(i == size && !i1.isEmpty()){
                    result12 =s1.get( i );
                    break;
                }else if( i==j ){
                    continue;
                }else if(i1.equals( j1 )){
                    continue outerloop;
                }else if(!i1.equals( j1) && j ==size){
                    result12 = s1.get( i );
                    break outerloop;
                }

            }

        }

        System.out.println("result == "+result12);

//        HomeWork 2:  Most frequent characters
//        String a = "aasssdddd";
//        answer should be d
//        and count = 4

        String ab = "aasssdddd";
        char[] ar=ab.toCharArray();
        int countA=0;
        int countS=0;
        int countD=0;


        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]=='a'){
                countA++;
            }else if(ar[i]=='s'){
                countS++;
            }else if(ar[i]=='d'){
                countD++;
            }
        }
        if(countA>countD && countA>countS){
            System.out.println("a = "+countA);
        }else if(countD>countA && countD>countS){
            System.out.println("d = "+countD);
        }else if (countS>countD && countS>countA){
            System.out.println("s = "+countS);
        }





    }
}
