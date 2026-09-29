class Beginner(
    val name: String,
    val failedTaskCount: Int
) {
    val emoji: String = "🌱"
}

class Regular(
    val name: String,
    val hasPaidFee: Boolean
) {
    val emoji: String = "🍏"
}

class Mentor(
    val name: String,
    val email: String?
) {
    val emoji: String = "✨"
}