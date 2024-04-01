import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrayPointer = 0;
    int sequencePointer = 0;
    while (arrayPointer < array.size() && sequencePointer < sequence.size()) {
      if (array.get(arrayPointer).equals(sequence.get(sequencePointer))) {
        arrayPointer += 1;
        sequencePointer += 1;
        if (sequencePointer == sequence.size()) {
          return true;
        }
      } else {
        arrayPointer += 1;
      }
    }
//    if (arrayPointer == array.size() && sequencePointer == sequence.size()) {
//        return true;
//    }
    return false;
  }
}
