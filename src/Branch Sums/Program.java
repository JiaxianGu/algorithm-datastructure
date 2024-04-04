import java.util.*;

class Program {
  
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> sums = new ArrayList<Integer>();
    branchSumsHelper(root, 0, sums);
    return sums;
  }

  public static void branchSumsHelper(BinaryTree node, int runningSum, List<Integer> sums) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      runningSum += node.value;
      sums.add(runningSum);
      return;
    }
    runningSum += node.value;
    branchSumsHelper(node.left, runningSum, sums);
    branchSumsHelper(node.right, runningSum, sums);
    return;
  }
}
