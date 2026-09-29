//Phạm Khắc Trung - 25610006
class NhanVien (
    maNhanVien: String,
    val ten: String,
    var luongThang: Double = 0.0
){
    constructor (ten:String):this("TAM",ten,0.0)
}
fun main() {
    val nhanVien1 =NhanVien("NV001", "Nguyen Van A", 15000000.0)
    val nhanVien2 =NhanVien("Nguyen Van B")

    println("Nhan vien 1")
    println("Ten: " + nhanVien1.ten)
    println("Luong thang: " + nhanVien1.luongThang)

    println()
    println("Nhan vien 2")
    println("Ten: " + nhanVien2.ten)
    println("Luong thang: " + nhanVien2.luongThang)
}
