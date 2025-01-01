import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
        int i = singleNumber(new int[]{4, 1, 2, 1, 2});
        System.out.println("i = " + i);
        int i1 = trailingZeroes(5);
        System.out.println("i1 = " + i1);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (hm.containsKey(element)){
                Integer value = hm.get(element);
                value++;
                hm.put(element,value);
            }else {
                hm.put(element,1);
            }
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            Integer key = integerIntegerEntry.getKey();
            Integer value = integerIntegerEntry.getValue();
            if (value==1) return key;
        }


        return -1;
    }
    public static int trailingZeroes(int n) {
        int ans=0;
        while(n!=0){
            n/=5;
            ans+=n;
        }
        return ans;
    }
}
