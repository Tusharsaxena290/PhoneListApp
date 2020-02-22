package definition;

import adt.javaAdt;

public class ContactLinkedList<contact> implements javaAdt<contact> {
    Node<contact> head = null;
    private int size;
    @Override
    public boolean add(contact dataItem) {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public void viewAllContacts() {

    }

    private static class Node<contact> {
        Node<contact> next;
        contact data;

        public Node(Node<contact> next, contact data) {
            this.next = next;
            this.data = data;
        }

        public Node(contact data) {
            this.data = data;
        }

        public Node<contact> getNext() {
            return next;
        }

        public contact getData() {
            return data;
        }
    }

}
