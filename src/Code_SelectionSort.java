/**
 * @author ljx
 * @create 2022-02-28 13:36
 */
public class Code_SelectionSort {
    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;++i){
            int minIndex=i;
            for(int j=i+1;j<arr.length;++j){
                minIndex=arr[j]>arr[minIndex]?minIndex:j;
            }
            swap(arr,i,minIndex);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }
}
