# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        res = []
        
        for i in range(len(lists)):
            while lists[i]:
                res.append(lists[i].val)
                lists[i] = lists[i].next

        res.sort()

        dummy = ListNode()
        curr = dummy

        for i in range(len(res)):
            curr.next = ListNode(res[i])
            curr = curr.next

        return dummy.next      
        
        