package sort_algorithm

// 손 안의 카드 정렬 원리와 비슷
fun insertionSort(data: MutableList<Int>) {
    for (i in 1 until data.size) {
        val temp = data[i]
        var prev = i - 1
        while (prev >= 0 && data[prev] > temp) {
            data[prev + 1] = data[prev]
            prev--
        }
        data[prev + 1] = temp
    }
}

fun main() {
    val data = mutableListOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    insertionSort(data)
    println(data)
}