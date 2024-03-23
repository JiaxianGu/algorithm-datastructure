def findClosestValueInBst(tree, target):
    current = tree
    result = current.value
    while current != None:
        if current.value < target:
            current = current.right
        elif current.value > target:
            current = current.left
        else:
            return current.value
        if current and abs(current.value - target) < abs(result - target):
            result = current.value
    return result
    
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
