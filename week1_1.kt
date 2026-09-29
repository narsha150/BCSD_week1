fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(2, 3, 4)

    val list3 = (list1 + list2).distinct()

    println(list3)
}