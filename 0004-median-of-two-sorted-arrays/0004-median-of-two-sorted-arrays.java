class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        double ans =0;
        int[] c = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, c, 0, num1.length); 
        System.arraycopy(num2, 0, c, num1.length, num2.length); 
        // for(int i=0;i<c.length;i++){
        //     ans += c[i];
        // }return ans/c.length;
        Arrays.sort(c);
        int mid = c.length/2;
        if(c.length%2==0){
            ans=(c[mid-1]+c[mid]);
            return ans/2;
        }else{
            return c[mid];
        }
    }
}