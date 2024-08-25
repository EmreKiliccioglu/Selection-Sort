package selectionsort;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        Random random = new Random();
        
        for(int i=0 ; i < numbers.length ; i++)
        {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Once" + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("Sonra" + Arrays.toString(numbers));

    }

    private static void selectionSort(int[] numbers) 
    {
        int length = numbers.length;
        
        for(int i=0 ; i<length-1 ; i++)
        {
            int min = numbers[i];
            int indexOfMin = i;
            
            for(int j=i+1 ; j<length ; j++)
            {
                if(numbers[j] < min)
                {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers , i , indexOfMin);
        }
    }

    private static void swap(int[] numbers, int x, int y) 
    {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    } 
}
