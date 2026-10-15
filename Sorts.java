import java.util.Arrays;

/** 
** Software Technology 152
** Class to hold various static sort methods.
*/
class Sorts
{
    // bubble sort
    public static void bubbleSort(int[] A)
    {
      //System.out.println(Arrays.toString(A));

      int length = A.length;

      boolean swapped = true;

      while(swapped){

        swapped = false;

        for(int pass = 0; pass < length - 1; pass++){

            if(A[pass] > A[pass+1]){

              int temp = A[pass];
              A[pass] = A[pass+1];
              A[pass+1] = temp;

              swapped = true;

            }
          }

          length--;
        }
      
    }//bubbleSort()

    // selection sort
    public static void selectionSort(int[] A)
    {
      // System.out.println(Arrays.toString(A));

        for(int i = 0; i < A.length - 1; i++){

          int minIdx = i;

          for(int j = i+1; j < A.length; j++){

            if(A[j] < A[minIdx]){

              minIdx = j;
            }
          }

          int temp = A[minIdx];
          A[minIdx] = A[i];
          A[i] = temp;

        }
      
      // System.out.println(Arrays.toString(A));
      // System.out.println("");
    }// selectionSort()

    // insertion sort
    public static void insertionSort(int[] A)
    {
      // System.out.println(Arrays.toString(A));
      
        for(int nn = 1; nn < A.length ; nn++){

          int ii = nn;

          while (ii > 0 && A[ii-1] > A[ii]){
            int temp = A[ii];
            A[ii] = A[ii-1];
            A[ii-1] = temp;

            ii = ii-1;
          }
        }

      // System.out.println(Arrays.toString(A));
      // System.out.println("");
    }// insertionSort()

    // mergeSort - front-end for kick-starting the recursive algorithm
    public static void mergeSort(int[] A)
    {
    }//mergeSort()
    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//mergeSortRecurse()
    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
    }//merge()


    // quickSort - front-end for kick-starting the recursive algorithm
    public static void quickSort(int[] A)
    {
    }//quickSort()
    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//quickSortRecurse()
    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
		return 0;	// TEMP - Replace this when you implement QuickSort
    }//doPartitioning


}//end Sorts calss
