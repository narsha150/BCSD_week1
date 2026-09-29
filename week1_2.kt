fun <T> List<T>.stepBy(n: Int = 2): List<T> {
    return this.filterIndexed { index, _ ->
        index % n == 0
    }
}

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50, 60)

    val result = numbers.stepBy()

    println(result)
}