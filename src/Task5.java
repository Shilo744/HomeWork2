public class Task5 {
    public static void main(String[] args) {
        int[] array = {-3,1,3,6,11,10,9,4,2,0,-5};
        int index = findHighNumber(array);
        System.out.println(index);
    }
    public static int findHighNumber(int[] array) {
        int highNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[highNumber]) {
                highNumber = i;
            }}
        boolean goingUp = true;
        for (int j = 0; j < highNumber; j++) {
            if (array[j] > array[j + 1]) {
                goingUp = false;
                break;
            }}
        boolean goingDown = true;
        for (int r = highNumber; r < array.length - 1; r++) {
        if (array[r] < array[r + 1])
        {
            goingDown = false;
                break;
        }}
        if (!goingUp | !goingDown) {
            highNumber = -1;
    }
        return highNumber;
    }}