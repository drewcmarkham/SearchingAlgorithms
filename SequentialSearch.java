public class SequentialSearch {

    // 2 points
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // 2 points
    public static int count(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    // 2 points
    public static int max(int[] array) {
        int biggestNum = array[0];
        for (int num: array) {
            if (num > biggestNum) {
                biggestNum = num;
            }
        }
        return biggestNum;
    }

    // 4 points
    public static int[] even(int[] array) {
        int count = 0;
        for (int num: array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index] = array[i];
                index++;
            }
        }
    return evenArray;

    }
}