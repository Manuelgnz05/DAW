import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayInt = new int[scan.nextInt()];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scan.nextInt();
        }

        int num = 1;
        while(num < arrayInt.length){
            int temp;
            for (int i = 0; i < arrayInt.length - num; i++) {
                if(arrayInt[i] > arrayInt[i + 1]){
                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[i + 1];
                    arrayInt[i + 1] = temp;
                }
            }
            num++;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
