package ss10_dsa_list.pratice.paratice2;

import ss10_dsa_list.exerise.exerise2.MyLinkedList2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList2 ll = new MyLinkedList2(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4,9);
        ll.add(4,8);
        ll.printList();
    }
}
