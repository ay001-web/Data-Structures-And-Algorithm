package Arrays;

public class BinarySearch {
    public static int BinarySearch(int numbers[],int key) {
        int start = 0,end =numbers.length;

        while(start<=end) {
            int mid = (start+end)/2;
            //Comparisons
            if(numbers[mid]==key) { //Found
                return mid;
            }
            if(numbers[mid] < key ) { //Right
                start = mid+1;
            }
            else { //Left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 4;
        System.out.println("index for key is : " +BinarySearch(numbers,key));
    }
    
}
