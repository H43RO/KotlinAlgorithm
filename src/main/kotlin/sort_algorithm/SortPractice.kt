package sort_algorithm

fun quickSort(data: List<Int>): List<Int> {
    if (data.size < 2) {
        return data
    }

    val pivot = data[0]
    val left = data.filter { it < pivot }
    val mid = data.filter { it == pivot }
    val right = data.filter { it > pivot }

    return quickSort(left) + mid + quickSort(right)
}

fun mergeSort(data: MutableList<Int>, start: Int, end: Int) {
    if (start >= end) return

    val mid = (start + end) / 2
    mergeSort(data, start, mid)
    mergeSort(data, mid + 1, end)

    merge(data, start, mid, end)
}

fun merge(data: MutableList<Int>, start: Int, mid: Int, end: Int) {
    val sortedList = mutableListOf<Int>()
    var indexA = start
    var indexB = mid + 1

    while (indexA <= mid && indexB <= end) {
        if (data[indexA] <= data[indexB]) {
            sortedList.add(data[indexA])
            indexA++
        } else {
            sortedList.add(data[indexB])
            indexB++
        }
    }

    while (indexA <= mid) {
        sortedList.add(data[indexA])
        indexA++
    }

    while (indexB <= end) {
        sortedList.add(data[indexB])
        indexB++
    }

    for (x in sortedList.indices) {
        data[start + x] = sortedList[x]
    }
}

fun main() {
    val data = mutableListOf(10, 9, 6, 2, 3, 8, 1, 4, 5)

    println(quickSort(data))
    mergeSort(data, 0, data.size - 1)
    println(data)
}