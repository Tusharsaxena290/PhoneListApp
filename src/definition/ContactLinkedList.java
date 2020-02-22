package definition;

import adt.javaAdt;

public class ContactLinkedList<contact> implements javaAdt<contact> {
    Node<contact> head = null;
    private int size;
    @Override
    public boolean add(contact dataItem) {

        return add(data, size);
    }

    private boolean addFirst(contact data) {
        head = new Node((Node) data, head);
        size++;
        return true;
    }

    private boolean addAfter(contact data, Node<contact> node) {
        node.next = new Node((Node) data, node.next);
        size++;
        return true;
    }

    private boolean add(contact data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
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
