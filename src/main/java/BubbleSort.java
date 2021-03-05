/**
 * @description:
 * @author: lio
 * @time: 2021/3/5 9:00 下午
 */
public class BubbleSort {

    public static void main(String[] args) {
        int n[] = {6,2,5,3,1,9,7,10,1};
        insertSort(n);
        print(n);
    }

    private static void print(int[] n) {
        for(int i : n){
            System.out.println(i);
        }
    }

    private static void insertSort(int[] n) {
        int i = 0;
        while(i < n.length){

            for(int j =0; j < n.length - 1 ; j++){
                if(n[j] > n[j+1]){
                    swap(n,j,j+1);
                }
            }
            i++;
        }

    }

    private static void swap(int[] n, int j, int i) {
        int temp = n[j];
        n[j] = n[i];
        n[i] = temp;
    }

}
