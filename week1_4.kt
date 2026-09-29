open class BcsdLabUser(
    val name: String,
    val emoji: String
)

class Beginner(
    name: String,
    val failedTaskCount: Int
) : BcsdLabUser(name, "🌱")

class Regular(
    name: String,
    val hasPaidFee: Boolean
) : BcsdLabUser(name, "🍏")

class Mentor(
    name: String,
    val email: String?
) : BcsdLabUser(name, "✨")

fun main() {
    val users: List<BcsdLabUser> = listOf(
        Beginner("김민수", 2),
        Beginner("이서준", 4),
        Regular("박지훈", true),
        Regular("최예린", false),
        Mentor("양지수", "jisoo@example.com"),
        Mentor("김도현", null)
    )

    // 1. 모든 비기너 목록 출력
    val beginners = users.filterIsInstance<Beginner>()
    println("모든 비기너")
    beginners.forEach {
        println("${it.emoji} ${it.name}")
    }

    // 2. 과제를 3회 이상 수행하지 않은 비기너 출력
    val failedBeginners = users
        .filterIsInstance<Beginner>()
        .filter { it.failedTaskCount >= 3 }

    println("\n과제를 3회 이상 수행하지 않은 비기너")
    failedBeginners.forEach {
        println("${it.emoji} ${it.name}")
    }

    // 3. 이번달 회비를 납부하지 않은 레귤러 출력
    val unpaidRegulars = users
        .filterIsInstance<Regular>()
        .filter { !it.hasPaidFee }

    println("\n이번달 회비를 납부하지 않은 레귤러")
    unpaidRegulars.forEach {
        println("${it.emoji} ${it.name}")
    }

    // 4. 성이 양씨인 사람 출력
    val yangUsers = users.filter {
        it.name.startsWith("양")
    }

    println("\n성이 양씨인 사람")
    yangUsers.forEach {
        println("${it.emoji} ${it.name}")
    }
}