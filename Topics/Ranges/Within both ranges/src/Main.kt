fun main() {
    val range1 = readln().toInt()  .. readln().toInt()
    val range2 = readln().toInt() .. readln().toInt()
    val result = readln().toInt()
    print(result in range1 && result in range2)
}