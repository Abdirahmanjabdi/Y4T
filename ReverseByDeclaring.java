
public class ReverseByDeclaring {
    public static void main(String[] args) 
    {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0}; //Original Array
        double[] ray = new double [myArray.length]; // new Array 
       int a = myArray.length;  //VAR
        
        for(int i = a - 1; i >= 0; i--)  //loop
        {
            ray[i] = myArray[i];
            System.out.print(ray[i] + " ");  // print
        }
        
        
    }
}