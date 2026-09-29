//Phạm Khắc Trung - 25610006
class SanPham (
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)
fun main() {
    val sanPham1 = SanPham("Nuoc hoa", 120000.0, 3)
    val sanPham2 = SanPham(tenSanPham = "My pham", gia = 220000.0)
    println("San pham 1:")
    println("Ten san pham " + sanPham1.tenSanPham)
    println("Gia: " + sanPham1.gia)
    println("So luong ton kho: " + sanPham1.soLuongTonKho)
    println()
    println("San pham 2:")
    println("Ten san pham " + sanPham2.tenSanPham)
    println("Gia: " + sanPham2.gia)
    println("So luong ton kho: " + sanPham2.soLuongTonKho)
}
