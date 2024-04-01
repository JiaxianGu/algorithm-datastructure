export function sortedSquaredArray(array: number[]): number[] {
    let result: number[] = new Array(array.length);
    let left: number = 0;
    let right: number = array.length - 1;
    for (let i: number = array.length - 1; i >= 0; i--) {
      if (Math.abs(array[left]) <= Math.abs(array[right])) {
        result[i] = array[right] * array[right];
        right -= 1;
      } else {
        result[i] = array[left] * array[left];
        left += 1;
      }
    }
    return result;
  }