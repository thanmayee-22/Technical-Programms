public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 255, 17, 76, 3, 98, 92 };
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j])
                    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
        for (int index = 0; index < arr.length; index++)
            System.out.print(arr[index] + " ");

    }
    
}
