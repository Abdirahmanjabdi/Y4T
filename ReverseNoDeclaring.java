/*Student ID:2508555
Name:Abdirahman Jama Abdi
*/
public class ReverseNoDeclaring {
    public static void main(String[] args) 
    {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0}; // array declaration 
       
       int a = myArray.length; //VAR
        
        for(int i = a - 1; i >= 0; i--) //Loop 
        {
            System.out.print(myArray[i] + " ");    //print
        }
    }
}




