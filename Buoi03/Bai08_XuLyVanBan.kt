//Phạm Khắc Trung - 25610006
fun xuLyVanBan(chuoi: String, hamXuLy: (String) -> String): String {
    return hamXuLy(chuoi)
}
fun vietHoaChuCai(s: String): String {
    return s.uppercase()
}
fun main() {
    val vanBanGoc = "hello kotlin"
    val ketQua1 = xuLyVanBan(vanBanGoc, { s -> s.reversed() })
    println("Cách 1 (lambda trực tiếp): $ketQua1")
    val ketQua2 = xuLyVanBan(vanBanGoc, ::vietHoaChuCai)
    println("Cách 2 (function reference ::): $ketQua2")
    val ketQua3 = xuLyVanBan(vanBanGoc) { s ->
        s.replace(" ", "_")
    }
    println("Cách 3 (trailing lambda): $ketQua3")
}