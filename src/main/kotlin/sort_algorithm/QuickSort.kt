package sort_algorithm

//fun quickSort(data: List<Int>): List<Int> {
//    if (data.size < 2) {
//        return data
//    }
//    val pivot = data[0]
//
//    val left = data.filter { it < pivot }
//    val equal = data.filter { it == pivot }
//    val right = data.filter { it > pivot }
//
//    return quickSort(left) + equal + quickSort(right)
//}
//
//fun main() {
//    val data = listOf(6, 3, 2, 5, 9, 2, 6, 2, 8, 1, 10, 4)
//    println(quickSort(data))
//}