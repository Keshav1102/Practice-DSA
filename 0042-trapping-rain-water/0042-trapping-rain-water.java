class Solution {
    public int trap(int[] height) {
        int max = 0,len=height.length;
        for(int i=0;i<len;i++){
            if(height[max]<height[i]){
                max =i;
            }
        }
        int res = 0;
        int i=0,j=i;
        while(j<max){
            if(height[i]>height[j]){
                res+=height[i]-height[j];
            }else i=j;
            j++;
        }
        i=--len;j=i;
        while(j>max){
            if(height[i]>height[j]){
                res+=height[i]-height[j];
            }else i=j;
            j--;
        }
        return res;
    }
}