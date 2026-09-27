//Phạm Khắc Trung - 25610006
fun main() {
    val kiemTraDoDai: (String) -> Boolean = { mk -> mk.length >= 8 }

    val matKhau1 = "abc123"
    val matKhau2 = "matkhau123"
    val matKhau3 = "1234567"

    println("$matKhau1 -> ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 -> ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 -> ${kiemTraDoDai(matKhau3)}")
}