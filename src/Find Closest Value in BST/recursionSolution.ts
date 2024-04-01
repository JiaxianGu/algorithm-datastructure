class BST {
    value: number;
    left: BST | null;
    right: BST | null;
  
    constructor(value: number) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  export function findClosestValueInBst(tree: BST, target: number) {
    return findClosestValueInBstHelper(tree, target, tree.value)
  }
  
  function findClosestValueInBstHelper(tree: BST | null, target: number, closest:number): number {
    if (tree === null) {
      return closest;
    }
    if (Math.abs(tree.value - target) < Math.abs(closest - target)) {
      closest = tree.value;
    }
    if (target < tree.value) {
      return findClosestValueInBstHelper(tree.left, target, closest);
    } else if (target > tree.value) {
      return findClosestValueInBstHelper(tree.right, target, closest);
    } else {
      return closest;
    }
  }
  