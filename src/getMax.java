/**
 * @author ljx
 * @create 2022-03-02 13:47
 */
public class getMax {
    public static int getMax(int[] arr){
       return process(arr,0,arr.length-1);
    }
    public static int process(int[] arr,int l,int r){
        if(l==r){
            return arr[l];
        }
        int mid=l+((r-l)>>1);
        int leftMax=process(arr,l,mid);
        int rightMax=process(arr,mid,r);
        return Math.max(leftMax,rightMax);
    }
}
