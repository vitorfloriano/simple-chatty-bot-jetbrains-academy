fun main() {
    val CONST: Int
    val listNumber = mutableListOf<Int>()
    CONST = 100
    listNumber.add(CONST * CONST)
    listNumber.add(CONST * CONST * CONST)
    listNumber.add(CONST * CONST * CONST * CONST)
    println(listNumber)
}