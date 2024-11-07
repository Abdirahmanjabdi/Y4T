/*Student ID:2508555
Name:Abdirahman Jama Abdi
*/
public class JaggedArray {
    public static void main(String[] args) {
        int r = 6; 
        int[][] jaggedArray = new int[r][]; //create the array
        int count = 1; // initial value counting strats from
        

        for (int i = 0; i <jaggedArray.length ; i++) {
            jaggedArray[i] = new int[i + 1];   // in every column increment by one
            for (int j = 0; j < i + 1; j++) {
                jaggedArray[i][j] = count++;
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " "); // print the outcome
            }
            System.out.println(); //print 
        }
    }
}
