function findClosestValueInBst(tree, target) {
    let current = tree;
    let result = current.value;
    while (current !== null) {
      
      if (current.value < target) {
        current = current.right;
      } else if (current.value > target) {
        current = current.left;
      } else {
        return current.value;
      }
      if (current && Math.abs(current.value - target) < Math.abs(result-target)) {
        result = current.value;
      }
    }
    return result;
  }