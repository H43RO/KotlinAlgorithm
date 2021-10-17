package sort_algorithm

fun bubbleSort(data: MutableList<Int>) {
    var temp = 0
    for (i in data.indices) {
        for (j in 1 until data.size - i) {
            if (data[j - 1] > data[j]) {
                temp = data[j - 1]
                data[j - 1] = data[j]
                data[j] = temp
            }
        }
    }
}

fun main() {
    val data = mutableListOf(1, 9, 8, 5, 4, 6, 3, 2, 7)
    bubbleSort(data)
    println(data)
}