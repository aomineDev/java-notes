package DSA.dataStructure.arrayToCollections.linkedList;

public class App {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(2);
    linkedList.insert(1);
    linkedList.insert(4);
    linkedList.insert(3);
    System.out.println(linkedList);
    linkedList.boobleSort();
    System.out.println(linkedList);

  }
}
