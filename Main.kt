fun main() {
    val b1 = Buku()
    b1.judul = "Hujan"
    b1.penulis = "Tere Liye"
    b1.tahun = 2016
    b1.jumlahEksemplar = 4

    val b2 = Buku()
    b2.judul = "Dilan: Dia adalah Dilanku Tahun 1990"
    b2.penulis = "Pidi Baiq"
    b2.tahun = 2014
    b2.jumlahEksemplar = 6

    val b3 = Buku()
    b3.judul = "3726 MDPL"
    b3.penulis = "Nurwina Sari"
    b3.tahun = 2024
    b3.jumlahEksemplar = 5

    val b4 = Buku()
    b4.judul = "Azzamine:Raden Azzam Al-Baihaqi"
    b4.penulis = "Sophie Aulia"
    b4.tahun = 2022
    b4.jumlahEksemplar = 5

    println("=== Perpustakaan ===")
    b1.tampilkaninfo()
    b2.tampilkaninfo()
    b3.tampilkaninfo()
    b4.tampilkaninfo()

    b1.kurangiEksemplar(1)
    println("||Peminjaman 1 Buku Hujan||")
    b1.tampilkaninfo()

    b3.kurangiEksemplar(2)
    println("||Peminjaman 2 Buku 3726 MDPL||")
    b3.tampilkaninfo()
}