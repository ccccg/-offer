package solution;

public class AdjustArrayEvenOdd {

    /**
     * 保证奇数之间、偶数之间的相对位置不变
     * 1.要求稳定的排序，采用插入排序的思想
     * 相当于找到奇数，就往前插入（类似冒泡往前冒），将插入之后的元素依次向后挪动一次，复杂度O(n^2)\
     *
     * 2.开辟同样大小的数组，扫描数组，奇数存入，再扫描存入偶数，修改数组引用，时空复杂度都是O(n).
     * @param array
     */
    public void reOrderArray(int [] array) {
        int length = array.length;
        int k = 0;
        for(int i = 0;i<length;i++){
            if((array[i]&1)==1){
                int j = i;
                while(j>k){
                    swap(array,j,j-1);
                    j--;
                }
                k++;
            }
        }
    }

    /**
     * 如果不要求稳定排序，使用双指针法，一个在数组头，寻找偶数，
     * 另一个在数组末尾，寻找奇数，找到之后交换。 时间复杂度O(n).
     * @param array
     */
    public void reOrderArrayNoSeq(int [] array) {
        // 偶数
        int p1 = 0;
        // 奇数
        int p2 = array.length - 1;
        while(p1<p2){
            while(p1<p2 && (array[p1]&1)==1){
                p1++;
            }
            while(p1<p2 && (array[p2]&1)==0){
                p2--;
            }
            swap(array,p1,p2);
        }
    }



    public void swap(int[] array, int p1, int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

}
