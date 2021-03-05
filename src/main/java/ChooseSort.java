import java.util.ArrayList;
import java.util.Collections;

/**
 * @description:
 * @author: lio
 * @time: 2021/3/5 9:00 下午
 * 选择排序
 */
public class ChooseSort {

    public static void main(String[] args) {
        int n[] = {6,2,5,3,1,9,7,10,1};
        for(int i = 0; i < n.length; i ++ ){
            int min = i;
            for(int j = i; j< n.length; j++){
                if(n[j] < n[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(n,i,min);
            }
        }
        print(n);
    }

    private static void print(int[] n) {
        for(int i : n){
            System.out.println(i);
        }
    }

    private static void swap(int[] n, int j, int i) {
        int temp = n[j];
        n[j] = n[i];
        n[i] = temp;
    }

}
