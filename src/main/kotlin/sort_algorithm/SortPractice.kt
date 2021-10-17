package sort_algorithm

fun sort(data: List<Int>): List<Int> {
    if (data.size < 2) {
        return data
    }

    val pivot = data[0]
    val left = data.filter { it < pivot }
    val mid = data.filter { it == pivot }
    val right = data.filter { it > pivot }

    return sort(left) + mid + sort(right)
}

fun main() {
    val data = listOf(10, 9, 6, 2, 3, 8, 1, 4, 5)
    println(sort(data))
}