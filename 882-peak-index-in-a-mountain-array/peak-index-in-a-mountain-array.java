class Solution{
    public int peakIndexInMountainArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] < arr[mid + 1]) {
            left = mid + 1;   // go to right side
        } else {
            right = mid;      // keep mid, peak may be here
        }
    }

    return left;  // or right
}
}
