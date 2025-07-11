class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] n=new int [nums1.length+nums2.length];
        int k=0;
        for(int i =0;i<nums1.length;i++)
        {
            n[k]=nums1[i];
            k++;
        }
        for(int i =0;i<nums2.length;i++)
        {
            n[k]=nums2[i];
            k++;
        }
        Arrays.sort(n);
        int len= n.length;
        int mid =len/2;
        if(len%2==0)
        {
            return(n[mid-1] + n[mid]) / 2.0 ;
            } 
            else
            {
            return n[mid];
            }
        }
    }
