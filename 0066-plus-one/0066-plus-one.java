class Solution {
    public int[] plusOne(int[] arr) {
        int[] ar = new int[arr.length+1];
        if(arr[arr.length-1]!=9){
            arr[arr.length-1] += 1;
            return arr;
        }else{
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]==9){
                    arr[i]=0;
                }else{
                    arr[i] +=1;break;
                }
            }
            if(arr[0]==0){
                ar[0]=1;
                for(int i=1;i<ar.length;i++){
                    ar[i] = arr[i-1];
                }
            }
            else{
                ar = arr;
            }
        }return ar;
    }
}