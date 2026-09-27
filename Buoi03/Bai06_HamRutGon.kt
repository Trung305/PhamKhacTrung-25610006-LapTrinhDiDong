//Phạm Khắc Trung - 25610006
fun main() {
    println("binhPhuong1: ${binhPhuong1(7)}")
    println("binhPhuong2: ${binhPhuong2(7)}")
    println("chuVIHV1: ${chuVIHV1(7, 3)}")
    println("chuVIHV2: ${chuVIHV2(7, 3)}")
    println("isChan1: ${isChan1(7)}")
    println("isChan2: ${isChan2(7)}")
}

fun binhPhuong1(x: Int): Int {
    return x * x
}
fun chuVIHV1(x: Int, y: Int): Int {
    return (x + y) * 2
}
fun isChan1(x: Int): Boolean {
    return x % 2 == 0
}
fun binhPhuong2(x: Int): Int = x * x
fun chuVIHV2(x: Int, y: Int): Int = (x + y) * 2
fun isChan2(x: Int): Boolean = x % 2 == 0