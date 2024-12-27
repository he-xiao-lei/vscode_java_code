package 常见算法.查找算法.二分查找;

public class BinarySearch {
    public static void main(String[] args) {
        // 需求:定义一个方法利用二分查找，获取某个元素在数组中的索引
        int[] arr = { 7, 23, 79, 81, 103, 127, 131, 147 };
        System.out.println(binarySearch(arr, 7));
    }

    public static int binarySearch(int[] arr, int num) {
        // 最小索引
        int min = 0;
        // 最大索引
        int max = arr.length - 1;
        while (true) {
            int mid = (max + min) / 2;
            // 拿着mid指向的元素跟要查找的元素进行比较
            //如果min> max 就说明这个元素找不到
            if (min > max) {
                return -1;
            } else if (arr[mid] < num) {
                // number在mid的左边
                // max不变,min = mid + 1;
                min = mid + 1;
            } else if (arr[mid] > num) {
                // number在mid的左边
                // min不变，max = mid - 1；
                max = mid - 1;
            } else {
                // 如果指向的元素相同,那就吧索引返回
                return mid;
            }
        }

    }

}
