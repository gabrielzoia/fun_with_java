package lab_07.sortare;

public class Main {
    public static void main(String[] args) {
        // SortedArray
        SortedArray sortedArray = new SortedArray();
        sortedArray.addElement(3);
        sortedArray.addElement(1);
        sortedArray.addElement(2);
        System.out.println(sortedArray); // { 1, 2, 3, }

        // MyStack
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // return 3
        System.out.println(stack.pop()); // return 2
        System.out.println(stack.pop()); // return 1
        System.out.println(stack.pop()); // return null
    }
}
