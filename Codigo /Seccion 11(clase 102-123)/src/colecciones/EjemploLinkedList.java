package colecciones;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add(1);
        linkedList.add(true);
        System.out.println(linkedList.toString());

        LinkedList<String> linkedListString = new LinkedList();
        linkedListString.add("1");
        linkedListString.add("2");
        linkedListString.add("true");
        System.out.println(linkedListString.toString());

        System.out.println(linkedListString.poll());
        System.out.println(linkedListString.toString());

        System.out.println(linkedListString.peek());
        System.out.println(linkedListString.toString());

    }
}
