package util;
import driver.*;//imports package

public class Main {
	// makes a random array of n elements (elements = numbers of elements you want in the random array)
	public static int []randomArray(int elements){ 
		int[] randArray = new int[elements];
    	for(int i = 0; i < elements; i++){
    	    randArray[i] = (int)(Math.random()*elements);
    	}
    	return randArray;
	}
	

    public static void main(String args[])
    {
    	long sumTime1 = 0,sumTime2=0;
    	int m=5;
    	for (int i=0;i<m;i++) {
	    	//
    		
	    	int[] randomArray1kI = new int[10000];//insertion 1k elements
	    	int[] randomArray1kH = new int[10000];//heap 1k elements
	    	randomArray1kI=randomArray(10000);
	    	randomArray1kH=randomArray1kI;
	    	
	    	
	        //int arr[] = {3000,2000,4000,5000,1000,6000,9000,10000,7000,8000,};
	        //insertionSort
	    	System.out.println("*****  Insertion sort   *****");
	        InsertionSort ob1 = new InsertionSort();//create object
	        ob1.sort(randomArray1kI);//sort random array of 1k
	        InsertionSort.printArray(randomArray1kI);//print sorted array
	        sumTime1+=ob1.getTimeMicro();//micro seconds
	 
	        
	        //nt arr1[] = {3000,2000,4000,5000,1000,6000,9000,10000,7000,8000,};
	        //heapSort
	        System.out.println("*****  Heap sort  *****");
	        HeapSort ob2 = new HeapSort();//create object
	        ob2.sort(randomArray1kH);//sort random array of 1k
	        HeapSort.printArray(randomArray1kH);
	        sumTime2+=ob2.getTimeMicro();
    	}
    	System.out.println("Final total :"+ sumTime1/m +" : "+sumTime2/m);

    }
    
    /* version 1 Works
 
    public static void main(String args[])
    {
    	//
    	int[] randomArray1kI = new int[1000];//insertion 1k elements
    	int[] randomArray1kH = new int[1000];//heap 1k elements
    	randomArray1kI=randomArray(1000);
    	randomArray1kH=randomArray1kI;
    	
    	
        //int arr[] = {3000,2000,4000,5000,1000,6000,9000,10000,7000,8000,};
        //insertionSort
    	System.out.println("*****  Insertion sort   *****");
        InsertionSort ob1 = new InsertionSort();//create object
        ob1.sort(randomArray1kI);//sort random array of 1k
        InsertionSort.printArray(randomArray1kI);//print sorted array
 
        
        //nt arr1[] = {3000,2000,4000,5000,1000,6000,9000,10000,7000,8000,};
        //heapSort
        System.out.println("*****  Heap sort  *****");
        HeapSort ob2 = new HeapSort();//create object
        ob2.sort(randomArray1kH);//sort random array of 1k
        HeapSort.printArray(randomArray1kH);

    }
    
    */
    
    
}
