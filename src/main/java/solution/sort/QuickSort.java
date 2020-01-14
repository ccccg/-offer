package solution.sort;

public class QuickSort {

    public static void quickSort(int[] a){
        if(a.length == 0){
            return ;
        }
        quickSort(a, 0, a.length-1);
    }

    public static void quickSort(int[] a, int start, int end){
        if(start == end){
            return ;
        }
        int index = partition(a, start, end);
        if(index > start){
            quickSort(a, start, index - 1);
        }
        if(index < end){
            quickSort(a, index + 1, end);
        }
    }

    public static int partition(int[] a, int start, int end){

        /*int p = a[start];
        int left = start+1;
        int right = end;
        while(left < right){
            while(a[left] <= p && left < right){
                left ++;
            }
            while(a[right] >= p && right > left){
                right --;
            }
            if(left < right){
                swap(a, left, right);
            }

        }
        if(a[left] < a[start]){
            swap(a, start, left);
               return left;
        }else{
            swap(a, start, left - 1);
            return left - 1;
        }*/
        int p = a[start];
        int left = start;
        int right = end;
        while(left < right){

            while(a[right] >= p && right > left){
                right --;
            }
            while(a[left] <= p && left < right){
                left ++;
            }
            if(left < right){
                swap(a, left, right);
            }

        }

        swap(a, start, right);
        return left;
    }
    public static void swap(int[] a, int left, int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
