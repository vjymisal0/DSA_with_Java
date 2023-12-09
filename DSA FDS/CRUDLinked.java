import java.util.LinkedList;

public class CRUDLinked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        //creating doubly linked list

        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove("Charlie");
        System.out.println(list);
        list.add(1, "Eve");
        System.out.println(list);


            //doubly linked list operations
            //addFirst()
            
    }
}
