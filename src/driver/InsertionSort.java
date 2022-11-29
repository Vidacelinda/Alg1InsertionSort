package driver;

public class InsertionSort {


	long totalTime;
	 /*Function to sort array using insertion sort*/
    public void sort(int arr[])
    {
    	//Start time (used for calalation not part of the heap sort)
    	long startTime = System.nanoTime();//start time nano seconds
    	
    	//Start of insertion sorting alogritim 
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        //End of insertion sorting alogritim 
        
        // END Time
        long endTime   = System.nanoTime();//end time nano seconds
        totalTime = endTime - startTime;//total time
        System.out.println("TEST runtime in nano seconds :"+totalTime +" n");
    }
    
    public long getTimeMicro() {//get time
    	return this.totalTime/1000;
    }
  
    
    /* A utility function to print array of size n*/
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }


}
