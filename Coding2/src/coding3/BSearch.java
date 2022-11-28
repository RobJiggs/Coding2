package coding3;

public class BSearch {
	static int binarySearch(int [] arr,int x){
		int high=arr.length;
		int low=0;
   while( low != high) {
          int mid = ((low + high)/2);
               if (x == arr[mid])
               return mid;

               else if (x > arr[mid]) // x is on the right side
                   low = mid + 1;

               else                  // x is on the left side
                   high = mid - 1;
	}
return -1;           }
    public static void main(String[] args) {}
}
