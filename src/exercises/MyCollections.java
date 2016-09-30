package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by jpmc on 9/30/2016.
 */
public class MyCollections {

    public static void myIfExercise(){
        // if
        int x = 5;
        if (x >= 5){
            System.out.println("It is greater than or equal to 5.");
        }else{
            System.out.println("It is less than 5.");
        }
    }

    public static void myWhileExercise1(){
        //while loop
        int n = 1;
        while(n <= 6){
            System.out.print("["+n+"]");
            n++;
        }
    }

    public static void myWhileExercise2(){
        //while loop
        int y =1;
        int sum = 0;
        while(y <= 6){
            sum += y;
            y++;
        }
        System.out.println("\nSUM is:"+sum);
    }

    public static void myDoWhile1(){
        //do while loop
        int z = 1;
        do{
            System.out.print("["+z+"]");
            z++;
        }while(z<=6);

        System.out.println();
    }

    public static void myForLoop1(){
        //for loop
        for (int c = 1; c <= 6; c++){
            System.out.print("["+c+"]");
        }
    }

    public static void myForLoop2(){
        //for loop with sum
        int sum2 = 0;
        for (int y2 = 1; y2 <= 6; y2++){
            sum2 += y2;
        }
        System.out.println("\nSUM is:"+sum2);
    }

    public static void myArrayExercise(){

        // Arrays
//        String [] myInstructors = {"Neil","Bert","Amille"};
//        for (int start = 0; start <= myInstructors.length; start++){
//            System.out.println("My instructor:"+myInstructors[start]);
//        }

        String [] myInstructors = {"Neil","Bert","Amille"};
        for (int start = 0; start < myInstructors.length; start++){
            if (myInstructors[start].equalsIgnoreCase("bert")) {
                myInstructors[start] = "Amante";
                System.out.println(myInstructors[start]);
            }else{
                System.out.println(myInstructors[start]);
            }
        }
    }

    public static void myListExercise(){
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Neil");
        myFriends.add("Bert");
        myFriends.add("Jerimiah");
        for (int i = 0; i < myFriends.size(); i++) {
            System.out.println("Friend: " + myFriends.get(i));
        }
    }

    public static void myGirlFriends(){
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Kendall");
        myGirlFriends.add("Liza");
        myGirlFriends.add("Selena");
        myGirlFriends.add("Alodia");
        myGirlFriends.add("Janela");
        for (int i = 0; i < myGirlFriends.size(); i++) {
            System.out.println("My GF: " + myGirlFriends.get(i));
        }
    }


    public static int randomIt(int number){
        Random r = new Random();
        return r.nextInt(number);
    }

    public static String generateFriendName(){

        List<String> myFriends = new ArrayList<String>();;
        myFriends.add("Juan");
        myFriends.add("Mario");
        myFriends.add("Pedro");
        myFriends.add("Takyo");
        myFriends.add("Tasyo");
        return myFriends.get(randomIt(myFriends.size()));
    }

    public static String generateGirlFriendName(){
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Alodia");
        myGirlFriends.add("Janela");
        myGirlFriends.add("Kendall");
        myGirlFriends.add("Liza");
        myGirlFriends.add("Selena");
        return myGirlFriends.get(randomIt(myGirlFriends.size()));
    }

    public static void generateRelationship(){
        List<String> relationship = new ArrayList<String>();
        relationship.add(" is in relationship with ");
        relationship.add(" hates ");
        relationship.add(" is in love with ");
        relationship.add("admired");
        relationship.add(" got friendzone with ");
        System.out.println(generateFriendName()+relationship.get(randomIt(relationship.size()))+generateGirlFriendName());
    }

 /*   public static void shuffleFriendName(){

        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Mario");
        myFriends.add("Tasyo");
        myFriends.add("Pedro");
        myFriends.add("Juan");
        myFriends.add("Takyo");
        Collections.shuffle(myFriends);
        System.out.println(myFriends);
    }*/

}
