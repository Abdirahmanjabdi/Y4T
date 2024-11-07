//Name: Abdirahman Jama Abdi
// ID: 2508555
import java.util.Stack;
public class FRStack {
    public static void main(String[] args) {
// Creating a Stack
        Stack<String> myFriends = new Stack<>();
// Pushing my friends names into the stack
        myFriends.push("Sheikh");
        myFriends.push("Saxib");
        myFriends.push("Sahal");
        myFriends.push("Qasali");
        System.out.println("FRStack => " + myFriends);
        System.out.println();
// Popping/Removing friend at the top
        String FrAtTop = myFriends.pop(); // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + FrAtTop);
        System.out.println("Current Stack => " + myFriends);
        System.out.println();
// call the item at the top of the stack without removing it
        FrAtTop = myFriends.peek();
        System.out.println("Stack.peek() => " + FrAtTop);
        System.out.println("Current Stack => " + myFriends);
    }
}
