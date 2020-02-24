package MyAssignment;

public class Operations {
    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty() {
        return head == null;
    }

    private int getSize() {
        return size;
    }

    public void add(Node person) {
        if (isEmpty() || person.getPerson().getF_name().toLowerCase().compareTo(head.getPerson().getF_name().toLowerCase()) <= 0) {
            head = person;
            person.setNext(head);
            size++;
        } else {
            Node temp = head;
            Node previous = null;
            while (temp != null && person.getPerson().getF_name().toLowerCase().compareTo(temp.getPerson().getF_name().toLowerCase()) >= 0) {
                previous = temp;
                temp = temp.getNext();
            }
            person.setNext(previous.getNext());
            previous.setNext(person);
            size++;
        }
    }

    public void deleteFront() {
        if (isEmpty())
            System.out.println("There are no contacts");
        else {
            Node removeNode = head;
            head = head.getNext();
            System.out.println(removeNode.getPerson().getF_name() + " " + removeNode.getPerson().getL_name() + "'s" + " contact deleted from list!");
            size--;
        }
    }

    public void deleteEnd() {
        if (isEmpty()) {
            System.out.println("There are no contacts");
        } else {
            Node current = head;
            Node previous = null;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            System.out.println(current.getPerson().getF_name() + " " + current.getPerson().getL_name() + "'s" + " contact deleted from list!");
            size--;
        }
    }

    public void removeAt(int position) {
        if (position == 1) {
            deleteFront();
            System.out.println();
        } else if (position == getSize()) {
            deleteEnd();
        } else if (position > 1 && position < getSize()) {
            Node current = head;
            Node previous = null;
            for (int i = 1; i < position; i++) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            System.out.println(current.getPerson().getF_name() + " " + current.getPerson().getL_name() + "'s" + " contact deleted from list!");
            size--;
        } else {
            System.out.println("Wrong Input!");
        }
    }

    public void find(String name) {
        int n = 0;
        Node current = head;
        while (current != null) {
            if (current.getPerson().getF_name().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                n++;
            }
            current = current.getNext();
        }
        if (n == 0) {
            System.out.println("NO RESULT FOUND!");
        } else {
            System.out.println(n + " match fount!");
            current = head;
            while (current != null) {
                if (current.getPerson().getF_name().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                    current.getPerson().showPerson();
                }
                current = current.getNext();
            }
        }
    }

    public void printList(boolean check) {
        if (check == true) {
            Node current = head;
            while (current != null) {
                current.getPerson().showPerson();
                current = current.getNext();
            }
        } else {
            Node current = head;
            int n = 1;
            while (current != null) {
                System.out.println(n + "." + " " + current.getPerson().getF_name());
                current = current.getNext();
                n++;
            }
        }
    }


}
