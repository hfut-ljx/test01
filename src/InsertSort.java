/**
 * @author ljx
 * @create 2022-02-28 14:47
 */
public class InsertSort {
    public static void insertSort(int[] arr){
        if(arr==null||arr.length<=1){
            return;
        }
        //0-0有序
        //0-i想有序
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,i,j);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }
}
