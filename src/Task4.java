public class Task4 {
    public static void main(String[] args) {
        int [] originalArray = {1,4,7,1,8,9,2,1,3,8,0};
        int counter = findSameNumbers(originalArray);
        int[] arrayWithoutSameNumbers = arrayWithoutDoubles(originalArray,counter);
        newArrayPrinter(arrayWithoutSameNumbers);
    }
    public static int findSameNumbers(int [] originalArray){
        int counter = 0;
        for (int i = 0; i < originalArray.length; i++){
        for (int j = i+1 ; j < originalArray.length; j++){
        if (originalArray[i] == originalArray[j]){
        counter++;
        break;
        }}}
        return counter;
    }
    public static int[] arrayWithoutDoubles(int[] fullArray, int counter){
        int [] arrayWithoutDoubles = new int[fullArray.length-counter];
        int index = 0;
        for (int i = 0; i<fullArray.length; i++){
        if (index == arrayWithoutDoubles.length){
        break;
    }
            for (int j = 0; j < arrayWithoutDoubles.length; j++){
            if (fullArray[i] == arrayWithoutDoubles[j] && j <= index){
            break;
    }
            else if (fullArray[i] != arrayWithoutDoubles[j] && j == index){
            arrayWithoutDoubles[index] = fullArray[i];
            index++;
            break;
    }}}
    return arrayWithoutDoubles;
    }
    public static void newArrayPrinter(int[] arrayWithoutDoubles){
        System.out.print("{");
        for (int i = 0; i < arrayWithoutDoubles.length; i++) {
        System.out.print(arrayWithoutDoubles[i] + "|");
    }
        System.out.println("}");
    }}