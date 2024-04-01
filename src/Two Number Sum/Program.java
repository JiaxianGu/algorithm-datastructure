import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      int valueNeeded = targetSum - array[i];
      if (map.containsKey(valueNeeded)) {
        int[] result = {array[i], array[map.get(valueNeeded)]};
        return result;
      } else {
        map.put(array[i], i);
      }
    }
    return new int[0];
  }
}