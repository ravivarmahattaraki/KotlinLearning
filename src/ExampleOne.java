import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args){
        int n = 6;
        Integer arr[] = {0, -1, 2, -3, 10, 1};
        Integer arr1[] = {1, 2, 0, 3};
        boolean flag = false;

        //isFlag(arr, false);
        //isFlag(arr1, false);

        System.out.println(IsPowerOf7(7));

    }

    static int IsPowerOf7 (int n ) {
        int num = 7;
        boolean flag =false;
        if(n == 7){
            return 1;
        }
       while(num < n){
           num = num * 7;
           if(num == n){
               flag = true;
           }
       }

       if(flag){
           return 1;
       }else {
           return 0;
       }
    }


    private static boolean isFlag(Integer[] arr, boolean flag) {
        for(int i = 0; i< arr.length-2; i++){
            for(int j = i+1; j< arr.length-1; j++){
                for(int k = (j+1); k< arr.length; k++){
                    //if(arr[i] != null && arr[j] != null && arr[k] != null){
                        if(arr[i]+ arr[j]+ arr[k] == 0){
                            flag = true;
                            System.out.println(arr[i]+", "+ arr[j]+", "+ arr[k]);
                            //arr[i] = null;
                            //arr[j] = null;
                            //arr[k] = null;
                        }
                    //}
                }
            }
        }
        if(!flag) {
            System.out.println("false, no triplet exist");
        }else {
            System.out.println("true");
        }
        return flag;
    }
}
