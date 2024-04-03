
class Program {

  public int[] sortedSquaredArray(int[] array) {
    int[] result = new int[array.length];
    int left = 0;
    int right = array.length - 1;
    for (int i = array.length - 1; i >= 0; i--) {
      if (Math.abs(array[right]) > Math.abs(array[left])) {
        result[i] = array[right] * array[right];
        right -= 1;
      } else {
        result[i] = array[left] * array[left];
        left += 1;
      }
    }
    return result;
  }
}