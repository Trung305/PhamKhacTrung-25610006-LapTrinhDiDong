//Phạm Khắc Trung - 25610006
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hinhVuong = HinhVuong(5.0)
    val hinhTron = HinhTron(3.0)

    println("Dien tich hinh vuong: " + hinhVuong.tinhDienTich())
    println("Dien tich hinh tron: " + hinhTron.tinhDienTich())
}