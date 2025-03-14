import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int number;
        int preNumber = 0;
        do {
            System.out.print("Enter the Number, Enter -1 to Stop Adding into ArrayList: ");
            number = scanner.nextInt();
            if (number != -1) {
                if (number > preNumber) {
                    numberList.add(number);
                    preNumber = number;
                } else {
                    for (int i = 0; i < numberList.size(); i++) {
                        int num = numberList.get(i);
                        if (num > number) {
                            numberList.add(i, number);
                            break;
                        }
                    }
                }
            }
        } while (number != -1);
        System.out.println(numberList);
        System.out.println("Processing...");
        System.out.println("MinDistance: " + MinDistance(numberList));
    }

    private static int MinDistance(ArrayList<Integer> numberList) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < numberList.size()-1; i++) {
            if (minDistance > Math.abs(numberList.get(i)-numberList.get(i+1))) {
                minDistance = Math.abs(numberList.get(i)-numberList.get(i+1));
            }
        }
        return minDistance;
    }
}