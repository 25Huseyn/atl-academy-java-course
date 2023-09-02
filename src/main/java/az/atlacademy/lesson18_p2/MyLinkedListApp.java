package az.atlacademy.lesson18_p2;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(5);
        System.out.println(linkedList.size);
        System.out.println(linkedList);

        linkedList.addTail(6);
        System.out.println(linkedList.size);
        System.out.println(linkedList);

        linkedList.addTail(7);
        System.out.println(linkedList.size);
        System.out.println(linkedList);

        linkedList.addHead(8);
        System.out.println(linkedList.size);
        System.out.println(linkedList);

        linkedList.findByIndex(3).ifPresent(System.out::println);
        linkedList.deleteTail(4);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList.size);
        System.out.println(linkedList);

    }
}