class BinaryTree {
    value: number;
    left: BinaryTree | null;
    right: BinaryTree | null;
  
    constructor(value: number) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  export function branchSums(root: BinaryTree): number[] {
    let sums: number[] = [];
    calculateBranchSums(root, 0, sums);
    return sums;
  }
  
  function calculateBranchSums(node: BinaryTree | null, runningSum: number, sums: number[]) {
    if (node === null) {
      return;
    }
    if (node.left === null && node.right === null) {
      runningSum += node.value;
      sums.push(runningSum);
      return;
    }
    runningSum += node.value;
    calculateBranchSums(node.left, runningSum, sums);
    calculateBranchSums(node.right, runningSum, sums);
  }
  