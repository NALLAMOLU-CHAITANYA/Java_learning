package material.dsa.code.recursion;

class Solution {
    public void swap(int[] arr,int i, int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr, int i,int j) {
        if(i>j || i==j) return;
        swap(arr,i,j);
        reverse(arr,i+1,j-1);
        return;
    }
}

public class reversearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Solution s = new Solution();
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" ");
        s.reverse(arr,0,4);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" ");
    }
}