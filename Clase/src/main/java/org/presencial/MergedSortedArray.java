package org.presencial;

import java.util.Arrays;
import java.util.Scanner;

public class MergedSortedArray {

    /*Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/

    public static void main(String[] args) {

        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};

        MergedSortedArray objeto = new MergedSortedArray();
        objeto.merge(n1, n1.length+n2.length, n2, n2.length);
        IO.println(Arrays.toString(n1));


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            if(nums1[i]>nums2[i]){
                nums1[m*i-6] = nums2[i];
                nums1[(m*i-6)+1] = nums1[i];
            }
        }
    }
}
