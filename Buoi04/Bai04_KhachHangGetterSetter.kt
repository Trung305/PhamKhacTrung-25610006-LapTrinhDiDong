//Phạm Khắc Trung - 25610006
class KhachHang(var ho: String, var ten: String) {
    var hoTen: String = ""
        get() = "$ho $ten"
        set(value) {
            val components = value.split(" ")
            ho = components[0]
            ten = components[1]
            field = value
        }
}

fun main() {
    val kh = KhachHang("Nguyen", "An")
    println("Ho ten ban dau: " + kh.hoTen)

    kh.ten = "Binh"
    println("Sau khi doi ten: " + kh.hoTen)

    kh.hoTen = "Tran Mai"
    println("ho = " + kh.ho)
    println("ten = " + kh.ten)
    println("hoTen = " + kh.hoTen)
}