package com.lintcode.algorithm;

/**
 * @author lenovo
 * @create 2019-03-30 21:59
 * @desc
 **/
public class BinarySearch01 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,4,5,5};

        int a=findPosition(nums,2);
        System.out.println(a);
    }

    public static int findPosition(int[] nums, int target) {
        int head = 0;
        int tail = nums.length-1;
        int mid = 0;
        int getMid = 0;
        if(nums.length==0){
            return -1;
        }
        while(head < tail){
            mid = (head+tail+1)/2;
            getMid = nums[mid];
            if(getMid>target){
                tail = mid-1;
            }else if(getMid<target){
                head =mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
