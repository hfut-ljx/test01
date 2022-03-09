/**
 * @author ljx
 * @create 2022-02-28 14:25
 */
public class PrintOddTimesArr {
    public static void printOddTimesNum1(int[] arr){
        int eor=0;
        for(int i=0;i<arr.length;i++){
            eor=eor^arr[i];
        }
        System.out.println(eor);
    }

    public static void printOddTimesNum2(int[] arr) {
        int eor=0;
        for(int i=0;i<arr.length;i++){
            eor=eor^arr[i];
        }
        //eor=a^b;
        //eor!=0;
        //eor必有一位等于1
        int rightOne=eor&(~eor+1);
        int onlyOne=0;
        for(int cur:arr){
            if((cur&rightOne)==0){//或等于rightOne
                rightOne=rightOne^cur;
            }
        }
       System.out.println(onlyOne+"  "+(onlyOne^eor));
    }

}
