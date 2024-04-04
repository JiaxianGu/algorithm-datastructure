class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def branchSums(root):
    sums = []
    branchSumsHelper(root, 0, sums)
    return sums

def branchSumsHelper(node, runningSum, sums):
    if node is None:
        return

    if node.left is None and node.right is None:
        runningSum += node.value
        sums.append(runningSum)

    runningSum += node.value
    branchSumsHelper(node.left, runningSum, sums)
    branchSumsHelper(node.right, runningSum, sums)
    return
