class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(k>=0){
            if(i==-1){nums1[k--]=nums2[j--];}
            else if(j==-1){nums1[k--]=nums1[i--];}
            else{nums1[k--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];}
        }
    }
}
//https://leetcode.com/problems/merge-sorted-array/
