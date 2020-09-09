import java.util.Arrays;
import java.util.Random;

public class ex {
    public static void main (String[]args){
        int s = 0;
        int []arr = new int[10];
        for (int i = 0; i <10; i++){
            arr [i] =(int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 10; i++){
            s += arr [i];
        }
        System.out.println(s);
        s = 0;
        int i = 0;
        while (i < 10){
            s += arr [i];
            i++;
        }
        System.out.println(s);
        s = 0;
        i = 0;
        do {
            s += arr [i];
            i++;
        } while (i < 10);
        System.out.println(s);
        for(i = 0; i < 10; i++){
            Random myRandom = new Random();
            arr[i] = myRandom.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        for(i = 9 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int min = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        double []mas = new double[10];
        double k = 0;
        for (i = 0; i <10; i++){
            k++;
            mas [i] = 1/k;
        }
        System.out.println(Arrays.toString(mas));

    }
}