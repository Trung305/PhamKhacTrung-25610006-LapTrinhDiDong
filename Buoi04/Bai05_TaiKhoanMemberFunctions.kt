//Phạm Khắc Trung - 25610006
class TaiKhoanNganHang(
    soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau
    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
    fun napTien(soTien: Double) {
        soDu += soTien
    }
    fun rutTien(soTien: Double): Boolean {
        if (soDu >= soTien) {
            soDu -= soTien
            return true
        }
        return false
    }
fun main() {
    val tk = TaiKhoanNganHang("001-234-567", 1000000.0)
    tk.napTien(500000.0)
    println("Sau khi nap 500000: " + tk.soDu)
    val ketQua1 = tk.rutTien(300000.0)
    println("Rut 300000: " + ketQua1 + ", so du: " + tk.soDu)
    val ketQua2 = tk.rutTien(5000000.0)
    println("Rut 5000000: " + ketQua2 + ", so du: " + tk.soDu)
    tk.napTien(200000.0)
    println("Sau khi nap 200000: " + tk.soDu)
}