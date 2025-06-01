package DSA.dataStructure.arrayToCollections.linkedList;

public class LinkedList {

  Node head;

  public boolean isEmpty() {
    return head == null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);

    if (isEmpty()) {
      head = newNode;
      return;
    }

    Node last = head;

    while (last.next != null)
      last = last.next;

    last.next = newNode;
  }

  public void boobleSort() {
    if (head == null || head.next == null) {
      return;
    }

    boolean swapped;
    Node current;

    do {
      swapped = false;
      current = head;

      while (current.next != null) {
        if (current.data > current.next.data) {
          swapped = true;

          int temp = current.data;
          current.data = current.next.data;
          current.next.data = temp;
        }

        current = current.next;
      }

    } while (swapped);
  }

  @Override
  public String toString() {
    if (isEmpty())
      return "[]";

    String str = "[";

    Node last = head;

    while (last.next != null) {
      str += last.data + ", ";
      last = last.next;
    }

    str += last.data + "]";

    return str;
  }
}
