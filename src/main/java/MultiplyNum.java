import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyNum {

    public static List<Integer> inputTreeNumbers(){
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Write your " + (i + 1) + " number");
            Scanner sc = new Scanner(System.in);
            Integer numberSelected = sc.nextInt();
            numberList.add(numberSelected);
        }
        return numberList;
    }

    public static void calculator(){
        List<Integer> numbers = inputTreeNumbers();

        for (Integer actualNum : numbers) {
            if (actualNum % 3 == 0 ){
                System.out.println(actualNum + " is a 3 multiply");
            } else {
                System.out.println(actualNum + " isn't a 3 multiply");
            }
        }
    }
}
