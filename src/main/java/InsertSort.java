/**
 * @description:
 * @author: lio
 * @time: 2021/3/5 9:00 下午
 */
public class InsertSort {

    public static void main(String[] args) {
        int n[] = {6,2,5,3,1,9,7,10,1};
        for(int i = 1; i < n.length; i ++ ){
            int temp = n[i];
            int j = i;
            while(j >0 && temp < n[j -1]){
                n[j] = n[j -1];
                j--;
            }//
            if(j != i){
                n[j] = temp;
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
