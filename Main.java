
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a SingleLinkedList instance
        SingleLinkedList list = new SingleLinkedList();
        Scanner reader = new Scanner(System.in);

        // Prompt user for the number of elements
        System.out.print("How many elements do you want to add to the linked list? ");
        int numElements = reader.nextInt();

        // Loop to read each element and add it to the list
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = reader.nextInt();
            list.addNode(element, false); // Add to the tail of the list
        }

        // Optionally print the list to verify
        System.out.println("List initialized:");
        list.printMe();

        // Ask for an index to print
        System.out.print("Enter the index of the element you want to print: ");
        int index = reader.nextInt();
        list.printElementAtIndex(index); // Call printElementAtIndex to print specific element

        // Ask if the user wants to delete from head or tail
        System.out.print("Do you want to delete from head (true) or tail (false)? ");
        boolean deleteFromHead = reader.nextBoolean();
        list.delete(deleteFromHead);

        // Print the updated list
        System.out.println("Updated list after deletion:");
        list.printMe();

        // Close the scanner
        reader.close();
    }
}