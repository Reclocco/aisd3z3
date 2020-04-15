class BinarySearch {
    public long comparisons = 0;

    int binarySearch(int[] arr, int l, int r, int x) {
        comparisons++;
        if (r >= l) {
            int mid = l + (r - l) / 2;

            comparisons++;
            if (arr[mid] == x)
                return 1;

            comparisons++;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return 0;
    }
} 