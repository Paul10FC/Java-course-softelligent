import java.util.ArrayList;
import java.util.List;

public class imparNumbers {
    public static void firstTenImparNumbersProgram(){
        int imparMultiplication = 1;
        List<Integer> integerList = List.of(11, 3, 5, 10, 13, 17, 20, 19, 13, 71, 13, 19, 20);

        int imparCount = 0;
        for (Integer actualNumber: integerList) {
            if ((actualNumber % 2) != 0){
                imparMultiplication = imparMultiplication * actualNumber;
                imparCount++;
                if (imparCount == 10) break;
            }
        }

        if (imparMultiplication == 1) {
            System.out.println("There is any impar number");
        } else {
            System.out.println("The first 10 numbers multiplication is: " + imparMultiplication);
        }
    }
}
