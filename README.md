# Tugas 5 PBO - Collection, Overloading, dan Overriding

Program ini merupakan implementasi sederhana dari manajemen perpustakaan menggunakan konsep pemrograman berorientasi objek (OOP) dalam bahasa Java. Dalam sistem ini, kami memanfaatkan struktur data Collection untuk menyimpan dan mengelola informasi mengenai buku dan anggota perpustakaan. Melalui penggunaan kelas Perpustakaan dan subclass PerpustakaanCabang, program ini mendemonstrasikan konsep overloading dan overriding, yang merupakan bagian integral dari OOP.
<br/>
- Overloading digunakan untuk memberikan beberapa cara dalam menambahkan buku ke dalam perpustakaan, baik dengan hanya menyertakan judul maupun dengan menambahkan informasi tentang penulis.
- Overriding diterapkan untuk memungkinkan subclass memberikan implementasi khusus dari metode yang sudah ada di superclass, sehingga informasi yang ditampilkan dapat disesuaikan dengan konteks cabang perpustakaan.
Dengan struktur yang 

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
   <br />Mengimpor `ArrayList` dan `List` dari Java Collection Framework untuk menyimpan daftar buku.
3. Kelas Perpustakaan :
- Atribut
  <br />`daftarBuku` : List yang menyimpan judul buku (tipe String).
- Metode
  <br />`tambahBuku(String judulBuku)` : Menambahkan buku dengan hanya judul.
  <br />`tambahBuku(String judulBuku, String penulis)`: Overloading metode untuk menambahkan buku dengan judul dan penulis.
  <br />`tampilkanDaftarBuku()` : Menampilkan semua buku yang ada di daftarBuku.
  <br />`infoPerpustakaan()` : Metode yang memberikan informasi umum tentang perpustakaan.

3. Kelas PerpustakaanCabang (subclass dari Perpustakaan):
- Atribut
  <br />`namaCabang` : Menyimpan nama cabang perpustakaan.
- Metode:
  <br />`PerpustakaanCabang(String namaCabang)` : Constructor untuk menetapkan nama cabang.
  <br />`infoPerpustakaan()` : Overriding dari metode superclass untuk memberikan informasi spesifik tentang cabang perpustakaan.
  <br />`tampilkanBukuCabang()` : Menampilkan buku dari cabang tertentu dengan memanggil metode dari superclass.

### Main.java
```
public class Main {
    public static void main(String[] args){
        // membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // menambah buku menggunakan metode overloading
        perpustakaan.tambahBuku("Pemrograman Java");
        perpustakaan.tambahBuku("Struktur Data", "Mukidi");

        // menampilkan daftar buku di perpustakaan umum
        perpustakaan.tampilkanDaftarBuku();

        // membuat objek PerpustakaanCabang
        PerpustakaanCabang cabangA = new PerpustakaanCabang("Surabaya");

        // menambah buku di cabang Surabaya
        cabangA.tambahBuku("Algoritma", "Jokowi");
        cabangA.tambahBuku("Jaringan Komputer");

        // menampilkan daftar buku di cabang Surabaya
        cabangA.tampilkanBukuCabang();

        // menampilkan info perpustakaan umum dan cabang (demonstrasi overriding)
        perpustakaan.infoPerpustakaan();  // Info dari kelas induk
        cabangA.infoPerpustakaan();       // Info dari kelas anak yang telah di-override
    }
}
```
Penjelasan :
1. Metode main : Titik awal eksekusi program.
2. Proses :
<br/>Membuat objek Perpustakaan dan menambah buku menggunakan metode overloading.
<br/>Menampilkan daftar buku yang telah ditambahkan ke perpustakaan.
<br/>Membuat objek PerpustakaanCabang dan menambahkan buku dengan judul dan penulis.
<br/>Menampilkan daftar buku dari cabang tertentu.
<br/>Menampilkan informasi tentang perpustakaan umum dan cabang dengan memanggil metode infoPerpustakaan (demonstrasi overriding).

#### Cara Kerja Program:
<br/>Saat program dijalankan, metode main pada Main.java dieksekusi.
<br/>Objek Perpustakaan dibuat, dan buku ditambahkan menggunakan dua metode yang berbeda (overloading).
<br/>Daftar buku di perpustakaan ditampilkan.
<br/>Objek PerpustakaanCabang dibuat dengan nama cabang tertentu.
<br/>Buku ditambahkan ke cabang tersebut, dan daftar buku dari cabang ditampilkan.
<br/>Informasi tentang perpustakaan umum dan cabang dipanggil untuk menunjukkan penggunaan overriding.
