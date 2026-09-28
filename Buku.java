public class Buku {
    String judul;
    String penulis;
    int tahun;
    int jumlahEksemplar;

    void tampilkaninfo() {
        System.out.println(judul + " | " + penulis + " | " + tahun + " | eksemplar: " + jumlahEksemplar);
    }

    void kurangiEksemplar(int jumlah) {
        jumlahEksemplar = jumlahEksemplar - jumlah;
    }
}