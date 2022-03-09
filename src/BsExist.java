/**
 * @author ljx
 * @create 2022-02-28 15:42
 */
public class BsExist {
    public static boolean bsExist(int[] arr,int num){
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L=0;
        int R=arr.length-1;
        int mid;
        while (L<R){
            mid=L+(R-L)>>1;
            if(arr[mid]==num){
                return true;
            }else if(arr[mid]>num){
                R=mid-1;
            }else {
                L=mid+1;
            }
        }
        return arr[L]==num;
    }
}
