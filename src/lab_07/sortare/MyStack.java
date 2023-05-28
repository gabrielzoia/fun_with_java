package lab_07.sortare;

public class MyStack extends Array {
    public Array array;

    public MyStack() {
        array = new Array();
    }

    public void push(Integer x) {
        array.addElement(x);
    }

    public Integer pop() {
        if (array.getSize() == 0) {
            return null;
        }
        return array.remove(array.getSize() - 1);
    }
}
