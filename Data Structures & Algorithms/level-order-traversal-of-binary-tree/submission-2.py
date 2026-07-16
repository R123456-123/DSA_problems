# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []

        res = []    

        dq = deque([root])

        while dq:
            res_loc = [] 
            size = len(dq)
            
            for _ in range(size):
                node = dq.popleft()

                if node.left:
                    dq.append(node.left)

                if node.right:
                    dq.append(node.right)

                res_loc.append(node.val)   

            res.append(res_loc)


        return res    






                


        