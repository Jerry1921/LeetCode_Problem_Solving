import java.util.ArrayList;
import java.util.Scanner;

public class prob_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //int[] myArr = new int[];

        //int[] myArr = sc.nextInt();

        // Take a dynamic array
        ArrayList<Integer> myArr = new ArrayList<>();



        int input;

        while (true) {
            input = sc.nextInt();
            if (input == 0){
                break;
            }
            myArr.add(input);
        }
        System.out.println("You entered: " + myArr);

    }
}
