

class Program {
    public static int findClosestValueInBst(BST tree, int target) {
        BST current = tree;
        int result = current.value;
        while (current != null) {
            if (current.value < target) {
                current = current.right;
            } else if (current.value > target) {
                current = current.left;
            } else {
                return current.value;
            }
            if (current != null && Math.abs(current.value - target) < Math.abs(result - target)) {
                result = current.value;
            }
        }
        return result;
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