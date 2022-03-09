/**
 * @author ljx
 * @create 2022-02-28 16:10
 */
public class BsFindOneLessValue {
    public static int bsFindOneLessValue(int[] val){
        if(val==null&&val.length==0){
            return -1;
        }
        if(val.length==1&&val[0]<val[1]){
            return 0;
        }if(val[val.length-1]<val[val.length-2]){
            return val.length-1;
        }
        int l=1;
        int r=val.length-2;
        int mid=0;
        while (l<r){
            mid=l+(r-l)>>2;
            if(val[mid]>val[mid+1]){
                l=mid+1;
            }else if(val[mid]>val[mid-1]){
                r=mid-1;
            }else {
                return mid;
            }
        }
        return l;
    }
}
