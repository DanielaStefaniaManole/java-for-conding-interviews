package basics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(7);
        list.print();
        list.remove(4);
        list.print();
        list.remove(10);
        list.print();
    }
}