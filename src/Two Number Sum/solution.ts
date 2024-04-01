export function twoNumberSum(array: number[], targetSum: number) {
    type lookup = {[key:number]: number};
    let output: number[] = [];
    let lookup: lookup = {};
    for (let i:number = 0; i < array.length; i++) {
      
      let valueNeeded: number = targetSum - array[i];
      if (lookup[valueNeeded] !== undefined) {
        output.push(array[lookup[valueNeeded]]);
        output.push(array[i]);
        return output;
      }
      lookup[array[i]] = i;
    }
    return output;
  }
  