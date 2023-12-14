import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        int[] nums = new int[] {1,2,3,4,5};
        int[][] num = new int[][] {{1,2,3 }, {4,5,6}};
        String [] word = new String[] {"Hello", "World"};
        float[][] point = new float[][]{{2.2F, 4.5F },{6.7F,8.6F }};
        Print(nums);
        Print(num);
        Print(word);
        Print(point);
    }
    public static void Print (int[] num)
    {
        System.out.println(Arrays.toString(num));
    }
    public static void Print (int[][] num)
    {
        System.out.println(Arrays.deepToString(num));
    }
    public static void Print (String[] word)
    {
        System.out.println(Arrays.toString(word));
    }
    public static void Print (float[][] point)
    {
        System.out.println(Arrays.deepToString(point));
    }
}