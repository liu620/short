/**
 * @description:
 * @author: lio
 * @time: 2021/3/6 11:30 上午
 * 插入排序的优化，希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int n[] = {6,2,5,3,1,9,7,10,1};
        int length = n.length;
        //区间
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = n[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && n[j] > tmp) {
                    n[j + gap] = n[j];
                    j -= gap;
                }
                n[j + gap] = tmp;
            }
            gap = gap / 3;
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
