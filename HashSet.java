import java.util.Iterator;
//Java HashSet class is used to create a collection that uses a hash table for storage.
public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> print = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        print.add("zero");
        print.add("one");
        print.add("two");
        print.add("three");
        print.add("four");
        print.add("five");
        print.add("six");
        print.add("seven");
        print.add("eight");
        print.add("nine");
        print.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        print.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("print = " + print);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = print.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(print.clone());

        //c. Removing a specific element using remove() method
        print.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("print = " + print);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(print.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(print.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(print.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        print.clear();
        System.out.println("print = " + print);
    }
}