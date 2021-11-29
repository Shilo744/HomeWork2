public class Task6 {
    public static void main(String[] args) {
        int[]arr1={3,9,0,3,2,8,1,7,100};
        int[]arr2={1,23,4,10,5,100,7};
        int counter=0;
        counter = testForSameNumbers(arr1, arr2, counter);
        if (!checkIfDifferent(arr1, arr2)) {
        int[] countOfSameNumbers = similarNumbers(arr1, arr2, counter);
        arrayToPrint(countOfSameNumbers);
        }
        else
        {
       System.out.println("The arrays are 'strangers'.");
        }}
    public static boolean checkIfDifferent(int[] arr1, int[] arr2) {
        boolean arraysStrangers = true;
        for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
        arraysStrangers = false;
        break;
        }}}
        return arraysStrangers;
    }
    public static int testForSameNumbers(int[] arr1, int[] arr2, int counter) {
        for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
        counter++;
        }}}
        return counter;
    }
    public static int[] similarNumbers(int[] arr1, int[]arr2, int counter) {
        int [] sameNumberInArrays = new int[counter];
        for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
        do{
        sameNumberInArrays[counter - 1] = arr1[i];
        counter = counter - 1;
        } while (counter > sameNumberInArrays.length);
        }}}
        return sameNumberInArrays;
    }
    public static void arrayToPrint(int[] sameNumberInArrays){
        System.out.print("The arrays same numbers is: ");
        System.out.print("{");
        for (int i = 0; i < sameNumberInArrays.length; i++){
        System.out.print(sameNumberInArrays[i] + "|");
        }
        System.out.println("}");
    }}