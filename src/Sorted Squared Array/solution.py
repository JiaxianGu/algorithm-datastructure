def sortedSquaredArray(array):
    smallest = 0
    biggest = len(array) - 1

    result = [0]*len(array)
    count = -1
    while smallest <= biggest:
        smallest_sqr = array[smallest] ** 2
        biggest_sqr = array[biggest] ** 2
        if smallest_sqr > biggest_sqr:
            result[count] = smallest_sqr
            smallest += 1
        else:
            result[count] = biggest_sqr
            biggest -= 1
        count -= 1
    
    return result