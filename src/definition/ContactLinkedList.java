package definition;

import adt.javaAdt;

public class ContactLinkedList<contact> implements javaAdt<contact> {
    Node<contact> head = null;
    private int size;
    @Override
    public boolean add(contact dataItem) {

        return add(dataItem, size);
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
        if (index == 0) {
            addFirst(data);
        } else {
            Node<contact> node = getNode(index - 1);
            addAfter(data, node);
        }

        return true;
    }

    public Node<contact> getNode(int index) {
        Node<contact> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.getNext();
        }
        return node;

    }

    private contact removeFirst() {

        if (head != null) {
            head = head.next;

        }
        Node<contact> temp = head;
        if (temp != null) {
            size--;
        } else {
            return null;
        }
        return temp.getData();
    }

    private contact removeAfter(Node<contact> node) {
        contact response = null;
        Node<contact> temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
        }
        if (response != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    public contact remove(int index) {
        contact response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            removeFirst();
        } else {
            Node<contact> temp = getNode(index - 1);
            response = removeAfter(temp);
        }
        return response;
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
