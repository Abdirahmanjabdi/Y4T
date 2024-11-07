public class Search {
    public static void main(String[] args){
        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int LowerBound = 0;
        int UpperBound = arr.length - 1;
        int result = Look(arr,target,LowerBound,UpperBound);
        if(result != -1){
            System.out.print("this is your target " + target + " and here is teh result " + result);
        }
        else {
            System.out.println("its out of bound");
        }
    }
    public static int Look(int[] arr, int target, int LowerBound, int UpperBound){
        int index = (LowerBound + UpperBound) / 2;
        if (arr[index] == target) return index; // Find the position
        else if (UpperBound < LowerBound) return -1; // Not find
        else
        {
            if (arr[index] > target) // Look in lower half
                return Look(arr, target, LowerBound, index-1);
            else // Look in upper half
                return Look(arr, target, LowerBound+1, UpperBound);
        }

    }
}

