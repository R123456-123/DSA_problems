# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        slow = head
        fast = head.next

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next   

        list2 = slow.next
        slow.next = prev = None
         
        while list2:
            temp = list2.next
            list2.next = prev
            prev = list2
            list2 = temp

        curr, second = head, prev
        while curr and second:
            temp1, temp2 = curr.next, second.next
            curr.next = second
            second.next = temp1
            curr, second = temp1, temp2
   


        