# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        
        left = self.isValid(root.left, float('-inf'), root.val)
        right = self.isValid(root.right, root.val, float('inf'))

        return left and right


    def isValid(self, node: TreeNode, lower, upper) -> bool:
        if not node:
            return True

        if node.val > lower and node.val < upper:
            return self.isValid(node.left,lower,node.val) and self.isValid(node.right, node.val, upper)
        else:
            return False                         

                      

        


        