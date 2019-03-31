package com.lintcode.algorithm;

/**
 * @author lenovo
 * @create 2019-03-31 20:40
 **/
public class FindPeak {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 4, 5, 7, 6};
    }

    public int findPeak(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while ((j - i) > 1) {
            int mid = (i + j) / 2;
            if (A[mid] > A[mid-1] && A[mid] > A[mid+1]) {
                return mid;
            }
            if (A[mid] <= A[i+1] && (mid - i) > 1) {
                j = mid;
            } else if (A[mid] <= A[j-1] && (j - mid) > 1) {
                i = mid;
            } else {
                if (A[mid] < A[mid-1]) {
                    j = mid;
                } else if (A[mid] < A[mid+1]) {
                    i = mid;
                }
            }
        }
        return 0;
    }
}
