import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
biggerThenAverage();
    }
    public static void biggerThenAverage() {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers= new int [10];
        int total=0;
        double average=0;

    System.out.println("Enter 10 numbers:");

        for (int i=0; i<inputNumbers.length; i++){
        inputNumbers[i] = scanner.nextInt();
        }
        for(int j=0; j<inputNumbers.length; j++)
        {
        total+=(inputNumbers[j]);
        average=(total/inputNumbers.length);
        }
        for(int i=0; i<inputNumbers.length;i++)
            if (inputNumbers[i]>average)
            System.out.print(inputNumbers[i]+".");
        }
}
