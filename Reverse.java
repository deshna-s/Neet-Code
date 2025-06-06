import java.util.*;

public class Reverse {
    static List<Integer> vector = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for number of elements
        System.out.print("Enter your number: ");
        int n = input.nextInt();  // Change to int to store the number of elements

        // Input for List of elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            vector.add(input.nextInt());  // Add elements to the list
        }

        collectionReverse();

        System.out.println("Reversed List:"+ vector);


        // Call reverse function will set back to original
        reverseList(0, vector, n);

        // Output reversed list
        System.out.println("Reversed List:");
        for (int i = 0; i < n; i++) {
            System.out.println(vector.get(i));
        }
        
        input.close();
    }

    // Recursive method to reverse the list
    public static void reverseList(int l, List<Integer> vector,  int r) {
        if (l >= r / 2) {  // Base case: stop when indices cross
            return;
        }
        
        // Swap elements at indices l and n-i-1 (which is r-l-1)
        Collections.swap(vector, l, r - l - 1);

        // Recursive call
        reverseList(l + 1, vector, r);
    }

    public static void collectionReverse() {
        Collections.reverse(vector);
    }
}
