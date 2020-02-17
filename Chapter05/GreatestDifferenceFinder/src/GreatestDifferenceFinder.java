public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        int temp = 0;
        for (int i : intArray) {
            for (int j : intArray) {
                int difference = i - j;
                if (difference > temp) {
                    temp = difference;
                }
            }
        }
        return temp;
    }
}
