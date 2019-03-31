package com.lintcode.algorithm;


/**
 * @author lenovo
 * @create 2019-03-31 20:46
 **/
public class FirstBadVersion {


    public int findFirstBadVersion(int n) {
            if (n <= 0) {
                return -1;
            }

            int start = 1;
            int end = n;
            int res = -1;
            /*while (start <= end) {
                int mid = start + ((end - start) >> 1);
                if (SVNRepo::isBadVersion(mid)) {
                    end = mid - 1;
                    res = mid;
                } else {
                    start = mid + 1;
                }
            }*/

            return res;
        }


}
