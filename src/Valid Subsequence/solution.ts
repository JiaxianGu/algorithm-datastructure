export function isValidSubsequence(array: number[], sequence: number[]) {
    let arrayPointer: number = 0;
    let sequencePointer: number = 0;
    while (arrayPointer < array.length && sequencePointer < sequence.length) {
      if (array[arrayPointer] === sequence[sequencePointer]) {
        arrayPointer += 1;
        sequencePointer += 1;
      } else {
        arrayPointer += 1;
      }
    }
    if (sequencePointer === sequence.length) {
      return true;
    } else {
      return false;
    }
  }