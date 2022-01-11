import java.util.Scanner;
class QuickSort
{
	int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1); 
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	void sort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	static void printArray(int arr[],int k)
	{
		for (int i=0; i<k;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{   
        Scanner input =new Scanner(System.in);
		int arr[] = new int[30];
        int n,i;
        System.out.println("Enter the size of array: ");
        n=input.nextInt();
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
		QuickSort ob = new QuickSort();
		ob.sort(arr,0,n-1);
		System.out.println("Sorted array : ");
		printArray(arr,n);
	}
}
