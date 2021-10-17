package sort_algorithm
//
//
//fun mergeSort(data: MutableList<Int>, start: Int, end: Int) {
//    if (start >= end) return
//
//    val mid = (start + end) / 2  // 반으로 쪼갬
//    mergeSort(data, start, mid)
//    mergeSort(data, mid + 1, end)
//
//    merge(data, start, mid, end)  // 분할된 두 리스트을 하나로 정렬하며 합침
//}
//
//fun merge(data: MutableList<Int>, start: Int, mid: Int, end: Int) {
//    val sortedList = mutableListOf<Int>()  // 정렬된 새로운 리스트
//    var indexA = start  // 왼쪽 배열 인덱스
//    var indexB = mid + 1  // 오른쪽 배열 인덱스
//
//    while (indexA <= mid && indexB <= end) {  // 두 리스트 중 하나라도 모두 소진되면 종료
//        // 둘 중 최솟값을 새로운 리스트에 담아주는 작업
//        if (data[indexA] <= data[indexB]) {
//            sortedList.add(data[indexA])
//            indexA++
//        } else {
//            sortedList.add(data[indexB])
//            indexB++
//        }
//    }
//
//    if (indexA > mid) {  // 오른쪽 배열 원소가 아직 남았다면
//        for (i in indexB..end) {
//            sortedList.add(data[i])
//        }
//    }
//
//    if (indexB > end) {  // 왼쪽 배열 원소가 아직 남았다면
//        for (i in indexA..mid) {
//            sortedList.add(data[i])
//        }
//    }
//
//    for (x in sortedList.indices) {  // 정렬된 부분 대입
//        data[start + x] = sortedList[x]
//    }
//}
//
//
//fun main() {
//    val data = mutableListOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
//    mergeSort(data, 0, data.size - 1)
//    println(data)
//}