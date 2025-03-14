import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayListCreater arrayCreation = new ArrayListCreater();
        numberList = arrayCreation.createArray();
        System.out.print("Enter search key: ");
        int searchKey = scanner.nextInt();
        int result = SequentialSearch(numberList, searchKey);
        System.out.println("Found at index " + result);
    }

    private static int SequentialSearch(ArrayList<Integer> numberList, Integer searchKey) {
        int i = 0;
        while (i < numberList.size()) {
            if (numberList.get(i) == searchKey) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }
}