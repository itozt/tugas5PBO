# Tugas 5 PBO - Collection, Overloading, dan Overriding


### Perpustakaan.java
```
import java.util.ArrayList;
import java.util.List;

// kelas utama Perpustakaan
class Perpustakaan {
    List<String> daftarBuku = new ArrayList<>();

    // overloading metode tambahBuku
    public void tambahBuku(String judulBuku){
        daftarBuku.add(judulBuku);
        System.out.println("Buku '" + judulBuku + "' telah ditambahkan.");}

    // overloading metode tambahBuku dengan penulis
    public void tambahBuku(String judulBuku, String penulis){
        daftarBuku.add(judulBuku + " oleh " + penulis);
        System.out.println("Buku '" + judulBuku + "' oleh " + penulis + " telah ditambahkan.");}

    // menampilkan daftar buku di perpustakaan
    public void tampilkanDaftarBuku(){
        System.out.println("Daftar Buku di Perpustakaan:");
        for (String buku : daftarBuku){
            System.out.println(buku);}}

    // method yang akan di-override di subclass
    public void infoPerpustakaan(){
        System.out.println("Perpustakaan Umum dengan berbagai koleksi buku.");}
}

// subclass PerpustakaanCabang untuk menerapkan overriding
class PerpustakaanCabang extends Perpustakaan{
    private String namaCabang;
    // constructor untuk menetapkan nama cabang
    public PerpustakaanCabang(String namaCabang){
        this.namaCabang = namaCabang;}

    // Overriding metode infoPerpustakaan
    @Override
    public void infoPerpustakaan(){
        System.out.println("Ini adalah Perpustakaan Cabang: " + namaCabang);}

    // Menampilkan daftar buku dari cabang tertentu
    public void tampilkanBukuCabang(){
        System.out.println("Daftar Buku di Perpustakaan Cabang " + namaCabang + ":");
        super.tampilkanDaftarBuku();}  // Memanggil metode dari superclass
}
```

Penjelasan :
1. Imports :
Mengimpor `ArrayList` dan `List` dari Java Collection Framework untuk menyimpan daftar buku.
2. Kelas Perpustakaan :
- Atribut
  `daftarBuku` : List yang menyimpan judul buku (tipe String).
- Metode
  `tambahBuku(String judulBuku)` : Menambahkan buku dengan hanya judul.
  `tambahBuku(String judulBuku, String penulis)`: Overloading metode untuk menambahkan buku dengan judul dan penulis.
  `tampilkanDaftarBuku()` : Menampilkan semua buku yang ada di daftarBuku.
  `infoPerpustakaan()` : Metode yang memberikan informasi umum tentang perpustakaan.

3. Kelas PerpustakaanCabang (subclass dari Perpustakaan):
- Atribut
  `namaCabang` : Menyimpan nama cabang perpustakaan.
- Metode:
  `PerpustakaanCabang(String namaCabang)` : Constructor untuk menetapkan nama cabang.
  `infoPerpustakaan()` : Overriding dari metode superclass untuk memberikan informasi spesifik tentang cabang perpustakaan.
  `tampilkanBukuCabang()` : Menampilkan buku dari cabang tertentu dengan memanggil metode dari superclass.
