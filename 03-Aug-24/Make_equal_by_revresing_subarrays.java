import java.util.*;

class Make_equal_by_reversing_subarrays{
    public static void main(String[] args) {
        
    }
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}