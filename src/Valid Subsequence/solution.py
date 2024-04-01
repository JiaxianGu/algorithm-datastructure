def isValidSubsequence(array, sequence):
    arrayPointer = 0
    sequencePointer = 0
    while arrayPointer < len(array) and sequencePointer < len(sequence):
        if array[arrayPointer] == sequence[sequencePointer]:
            arrayPointer += 1
            sequencePointer += 1
        else:
            arrayPointer += 1
    if sequencePointer >= len(sequence):
        return True
    else:
        return False