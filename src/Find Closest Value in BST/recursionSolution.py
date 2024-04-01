# recursive way

def findClosestValueInBst(tree, target):
    return findClosestValueInBstHelper(tree, target, tree.value)

def findClosestValueInBstHelper(tree, target, closest):
	if tree is None:
		return closest
	elif abs(tree.value - target) < abs(closest - target):
		closest = tree.value
	if tree.value < target:
		return findClosestValueInBstHelper(tree.right, target, closest)
	elif tree.value > target:
		return findClosestValueInBstHelper(tree.left, target, closest)
	else:
		return tree.value

# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None