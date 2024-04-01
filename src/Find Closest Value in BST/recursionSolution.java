import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBstHelper(tree, target, tree.value);
  }

  public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
    if (tree == null) {
      return closest;
    }
    if (Math.abs(tree.value - target) < Math.abs(closest - target)) {
      closest = tree.value;
    }
    if (tree.value < target) {
      return findClosestValueInBstHelper(tree.right, target, closest);
    } else if (tree.value > target) {
      return findClosestValueInBstHelper(tree.left, target, closest);
    } else {
      return tree.value;
    }
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
