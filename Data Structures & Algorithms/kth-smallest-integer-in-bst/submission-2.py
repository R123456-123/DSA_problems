# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:

    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.res = None
        self.c = 0
        
        self.smallest(root,k)

        return self.res

    def smallest(self, node: Optional[TreeNode], k: int) -> None:
        if not node or self.res is not None:
            return

        self.smallest(node.left, k)

        self.c += 1

        if self.c == k:
            self.res = node.val
            return

        self.smallest(node.right, k)  

        return       

        