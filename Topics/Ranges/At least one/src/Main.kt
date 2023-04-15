fun main() {
    val int1 = readln().toInt()
    val int2 = readln().toInt()
    val int3 = readln().toInt()
    val int4 = readln().toInt()
    val int5 = readln().toInt()
    val range1 = int1..int2
    val range2 = int3..int4
    print(int5 in range1 || int5 in range2)
}