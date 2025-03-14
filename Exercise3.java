import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayListCreater arrayCreation = new ArrayListCreater();
        numberList = arrayCreation.createArray();
        ArrayList<Integer> resultNumberList = SelectionSort(numberList, numberList.size());
        System.out.println("Selection Sorted " + resultNumberList);
    }

    private static ArrayList<Integer> SelectionSort(ArrayList<Integer> numberList, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (numberList.get(j) < numberList.get(min)) {
                    min = j;
                }
            }
            int temp = numberList.get(i);
            numberList.set(i, numberList.get(min));
            numberList.set(min, temp);
        }
        return numberList;
    }
}
