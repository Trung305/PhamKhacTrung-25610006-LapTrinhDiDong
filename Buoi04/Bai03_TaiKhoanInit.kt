//Phạm Khắc Trung - 25610006
class TaiKhoanNganHang (
    val soTaiKhoan: String,
    val soDuBanDau: Double,
){
    var soDu: Double = soDuBanDau
    init {
        if (soDuBanDau < 0){
            println("So du khong hop le")
        }else{
            println("Tao tai khoan thanh cong, So du ban dau la: $soDuBanDau")
        }
    }
}

fun main() {
    val tk1 =TaiKhoanNganHang("TK001", 100000.0)
    val tk2 =TaiKhoanNganHang("TK002", -100.0)
}
