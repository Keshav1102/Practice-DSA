class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans =0;
        
        int i=0,j=0,x=0,m=nums1.length,n=nums2.length;
        int[] c = new int[m + n];
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                c[x] = nums1[i];
                i++;x++;
            }
            else if(nums1[i]>nums2[j]){
                c[x] = nums2[j];
                j++;
                x++;
            }else{
                c[x] = nums1[i];
                x++;
                c[x] = nums2[j];
                x++;
                i++;j++;
            }
        }
        if(i<m){
            while(i<m){
                c[x] = nums1[i];
                i++;x++;
            }
        }
        else{
            while(j<n){
                c[x] = nums2[j];
                j++;x++;
            }
        }
        int sum =m+n;
        int mid = sum/2;
        if(sum%2==0){
            ans=(c[mid-1]+c[mid]);
            ans/=2;
        }else{
            ans = c[mid];
        }
        return ans;
        // for(int a:c){
        //     System.out.print(a+" ");
        // }
        // return ans;
    }
}