fun main(args: Array<String>) {
    println(arithmeticAverage((listOf(1, 2, 3, 4, 5, 6))))
    println(arithmeticAverageV2(listOf(1, 2, 3, 4, 5, 6)))
    println("kotlin".isPalindrome())
    println(isPalindromeV2("rotor rotor"))
    println(isPalindromeV3("Palindrome"))
}

// დავალება 1
// მოცემული ფუნქცია იძახებს ყოველ ლუწ ინდექსზე მდგომ ციფრს და შემდეგ ითვლის მათ საშუალო არითმეტიკულს.

fun arithmeticAverage(listOfIntegers: List<Int>) =
    listOfIntegers.filterIndexed { index, _ -> index % 2 == 0 }.average().toInt()

// დავალება 1 v2.0
// გლეხურად

fun arithmeticAverageV2(startingListOfIntegers: List<Int>): Int {
    val filteredNumbers = arrayListOf<Int>()
    startingListOfIntegers.forEachIndexed { _, number ->
        filteredNumbers.add(number)
    }

    return filteredNumbers.sum() / filteredNumbers.size
}

// დავალება 2
// მოცემული ფუქნცია გადაცემულ სტრინგს ატრიალებს უკუღმა და ადარებს იმავე სტრინგს

fun String.isPalindrome(): Boolean {
    return this.reversed() == this
}

// დავალება 2 v2.0
// გლეხურად

fun isPalindromeV2(string: String): Boolean {
    return string.reversed() == string
}

// დავალება 2 v3.0
// კიდე უფრო გლეხურად

fun isPalindromeV3(string: String): Boolean {
    var reversedString = ""
    for (charIndex in string.length - 1 downTo 0) {
        reversedString += string[charIndex]
    }

    return string == reversedString
}