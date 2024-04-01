def twoNumberSum(array, targetSum):
    result = []
    lookup = {}
    for i in range(len(array)):
        valueNeeded = targetSum - array[i]
        if valueNeeded in lookup:
            result.append(array[i])
            result.append(array[lookup[valueNeeded]])
            return result
        else:
            lookup[array[i]] = i
    return result