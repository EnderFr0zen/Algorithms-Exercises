import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCreater {
    public ArrayList<Integer> createArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int number;
        do {
            System.out.print("Enter the Number, Enter -1 to Stop Adding into ArrayList: ");
            number = scanner.nextInt();
            if (number != -1) {
                numberList.add(number);
            }
        } while (number != -1);
        System.out.println(numberList);
        return numberList;
    }
}