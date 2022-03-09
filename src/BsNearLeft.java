/**
 * @author ljx
 * @create 2022-02-28 15:49
 */
public class BsNearLeft {
    public static int bsNearLef(int[] arr,int num){
       int index=-1;
       int L=0;
       int R=arr.length-1;
       int mid=0;
       while (L<R){
           mid=L+(R-L)>>1;
           if(arr[mid]>=num){
               index=mid;
               R=mid-1;
           }else {
               L=mid+1;
           }
       }
        return index;
    }
}
