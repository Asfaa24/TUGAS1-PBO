class Buku {
    var judul: String = ""
    var penulis: String = ""
    var tahun: Int = 0
    var jumlahEksemplar: Int = 0

    fun tampilkaninfo() {
        println("$judul | $penulis | $tahun | eksemplar: $jumlahEksemplar")
    }

    fun kurangiEksemplar(jumlah: Int) {
        jumlahEksemplar = jumlahEksemplar - jumlah
    }
}