public class BinarySearch implements Searcher {
    @Override
    public int search(int[] sortedValues, int value) {

        int high = sortedValues.length;
        int low = 0;
        int mid = (low + high) / 2;

        while(low <= high) {
            mid = (low + high) / 2;

            if(value == sortedValues[mid]) {
                return mid;
            } else if(value < sortedValues[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
