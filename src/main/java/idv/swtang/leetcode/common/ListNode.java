package idv.swtang.leetcode.common;

import java.util.List;

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int i) {
        this.val = i;
    }

    public int val() {
        return val;
    }
	   
	public static ListNode createSinglyLinkedList(List<Integer> listValues) {
		if (listValues == null || listValues.size() == 0) {
			throw new IllegalArgumentException("Please pass in a valid listValues to create a singly linked list.");
		}
		ListNode head = new ListNode(listValues.get(0));
		ListNode tmp = head;
		for (int i = 1; i < listValues.size(); i++) {
			ListNode next = new ListNode(listValues.get(i));
			tmp.next = next;
			tmp = tmp.next;
		}
		printList(head);
		return head;
	}
	
	 public static void printList(ListNode head) {
	        ListNode temp = head;
	        System.out.println();
	        while (temp != null) {
	            System.out.print(temp.val() + "\t");
	            temp = temp.next;
	        }
	    }
}
