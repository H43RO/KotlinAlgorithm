package sort_algorithm

import java.util.Collections.max
import java.util.Collections.min

fun countingSort(data: MutableList<Int>) {
    if (data.isEmpty()) return

    val min = min(data)
    val max = max(data)
    val count = IntArray(max - min + 1)

    data.forEach {
        count[it - min]++
    }

    var index = 0
    for (i in min..max) {
        while (count[i - min] > 0) {
            data[index++] = i
            count[i - min]--
        }
    }
}

fun main() {
    val data = mutableListOf(1, 5, 4, 2, 7, 3, 9, 8, 6, 11)
    countingSort(data)
    println(data)
}