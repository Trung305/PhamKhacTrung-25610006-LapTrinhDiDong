fun String.demNguyenAm(): Int {
    var dem = 0
    for (kyTu in this.lowercase()) {
        if (kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u') {
            dem++
        }
    }
    return dem
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    var i = 2
    while (i * i <= this) {
        if (this % i == 0) return false
        i++
    }
    return true
}

fun main() {
    val chuoi1 = "Hello World"
    val chuoi2 = "Kotlin"
    val chuoi3 = "AEIOU"

    println("$chuoi1 co " + chuoi1.demNguyenAm() + " nguyen am")
    println("$chuoi2 co " + chuoi2.demNguyenAm() + " nguyen am")
    println("$chuoi3 co " + chuoi3.demNguyenAm() + " nguyen am")

    println("7 la so nguyen to: " + 7.laSoNguyenTo())
    println("10 la so nguyen to: " + 10.laSoNguyenTo())
    println("29 la so nguyen to: " + 29.laSoNguyenTo())
    println("1 la so nguyen to: " + 1.laSoNguyenTo())
}