package sort_algorithm

fun selectionSort(data: MutableList<Int>) {
    var indexMin = 0
    var temp = 0
    for (i in data.indices) {
        for (j in i + 1 until data.size) {
            if (data[indexMin] > data[j]) {
                indexMin = j
            }
        }
        temp = data[i]
        data[i] = data[indexMin]
        data[indexMin] = temp
    }
}

fun main() {
    val data = mutableListOf(6, 9, 8, 1, 3, 2, 4, 7, 5, 0)
    selectionSort(data)
    println(data)
}