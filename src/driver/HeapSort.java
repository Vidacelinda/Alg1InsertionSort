package driver;

public class HeapSort {
	
	long totalTime;
	public void sort(int arr[]) {
		//Start time (used for calalation not part of the heap sort)
		long startTime = System.nanoTime();//start time nano seconds
		
		//Start of Heap sorting alogritim 
		int N =arr.length;
		maxHeap(arr,N);
		
		for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
		//END of Heap sorting alogritim 
		
		//END Time
		long endTime   = System.nanoTime();//end time nano seconds
        totalTime = endTime - startTime;//total time
        System.out.println("TEST runtime in nano seconds :"+totalTime+" n");
	}
	
	public long getTimeMicro() {//get time
    	return this.totalTime/1000;
    }
	
	public void maxHeap(int arr[],int N) {
		for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
	}
	
	public static void heapify(int arr[], int N, int i){
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
	
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
	 
}
