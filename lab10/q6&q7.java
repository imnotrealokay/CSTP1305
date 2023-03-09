

// Recursively processing a Linked List
// 6 - Write a function displayListForward(Node head) that displays the integers in a list starting from the first element using
// -- Iterative approach (only loops)
// -- Recursive approach (the function call itself)

// 7 - Write a function displayListBackward(Node head) that displays the integers in a list starting from the last element using
// -- Iterative approach (only loops)
// -- Recursive approach (the function call itself)

import java.util.Stack;

import org.junit.runner.notification.StoppedByUserException;
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

public class q6 {
  static void displayListForward_i(Node head) {
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
  }

  static void displayListForward_r(Node head) {
    if (head != null) {
      System.out.println(head.data);
      displayListForward_r(head.next);
    }
  }

  static void displayListBackward_i(Node head) {
    Stack<Integer> aStack = new Stack<>();
    while (head != null) {
      aStack.add(head.data);
      head = head.next;
    }

    while (!aStack.empty()) {
      System.out.println(aStack.pop());
    }
  }

  static void displayListBackward_r(Node head) {
    if (head != null) {
      displayListBackward_r(head.next);
      System.out.println(head.data);
    }
  }

  public static void main(String[] args) {
    Node head;
    head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);

    // head: 10->20->30
    // displayListForward_i(head); // 10, 20, 30
    // displayListForward_r(head); // 10, 20, 30
    // displayListBackward_i(head); // 30, 20, 10
    displayListBackward_r(head); // 30, 20, 10
  }

}