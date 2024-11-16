import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        insertionSort(nums);

        for(int num : nums){
            System.out.println(num);
        }

    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];

                    for (int k = i; k > j; k--)
                        arr[k] = arr[k - 1];

                    arr[j] = temp;
                    break;
                }
            }
        }
    }
}


