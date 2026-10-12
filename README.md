# Minpro 4 - Pemrograman Berbasis Objek

## Identitas

Nama  : Akhmad Rafliansyah

NIM   : 2509116045

Prodi : Sistem Informasi 25'B

Tema  : Sistem Informasi Manajemen Pencucian Kendaraan

# Deskripsi Singkat Program

Program Sistem Pencucian Kendaraan merupakan aplikasi berbasis Java yang dibuat untuk mengelola data pencucian kendaraan secara terstruktur. 
Program ini mengelola data pelanggan, kendaraan, layanan, dan transaksi, serta menyediakan fitur untuk menambah, menampilkan, mengubah, dan 
menghapus data pencucian. Pengguna dapat memilih jenis kendaraan berupa mobil atau motor dan menentukan layanan pencucian yang tersedia 
beserta harganya. Program ini juga menerapkan konsep Object-Oriented Programming (OOP), seperti encapsulation pada pengelolaan atribut dan 
inheritance pada class Mobil dan Motor yang merupakan turunan dari class Kendaraan

# Penjelasan Struktur Package

Struktur package pada program Sistem Pencucian Kendaraan dibagi menjadi beberapa bagian agar kode lebih terorganisir dan setiap bagian 
memiliki fungsi masing-masing.

- Package sistempencuciankendaraan Berisi SistemPencucianKendaraan.java sebagai main class yang menjadi titik awal program.
- Package sistempencuciankendaraan. Controller Berisi MenuController yang menjadi pengatur alur program. Controller menerima pilihan       dari View, kemudian menjalankan proses seperti tambah, tampil, ubah, hapus, dan proses pencucian.
- Package sistempencuciankendaraan.Model Berisi class yang merepresentasikan data dan objek utama dalam sistem, seperti pelanggan,         kendaraan, layanan, dan transaksi. Di dalamnya juga terdapat penerapan konsep OOP seperti inheritance, polymorphism, abstraction,        encapsulation, dan interface.
- Package sistempencuciankendaraan.View Berisi MenuView yang bertugas menangani tampilan menu dan input menu dari pengguna. Jadi bagian    ini berhubungan dengan interaksi pengguna dengan program.
- Package sistempencuciankendaraan.DAO Berisi TransaksiDAO yang menangani akses dan operasi data ke database, seperti INSERT, SELECT,      UPDATE, dan DELETE. Karena proyekmu menggunakan JDBC, proses SQL dilakukan di bagian ini.
- Package sistempencuciankendaraan.Database
- Berisi Koneksi yang bertugas membuat koneksi antara aplikasi Java dengan database MySQL.

Secara keseluruhan, pembagian tersebut menggunakan pola MVC (Model–View–Controller), yaitu Model untuk mengelola data, View untuk 
tampilan dan input, sedangkan Controller untuk mengatur proses dan alur program.

# Penjelasan Alur Program

Program dimulai dengan menampilkan menu utama yang berisi beberapa pilihan, yaitu tambah data, tampilkan data, ubah data, hapus data, 
proses pencucisn, dan keluar dari program. Pengguna dapat memilih salah satu menu dengan memasukkan angka sesuai pilihan yang tersedia.

<img width="269" height="193" alt="Screenshot 2026-10-07 094153" src="https://github.com/user-attachments/assets/627f3b57-01bc-4bc9-b9fd-38e43b2b39c7" />

1. Tambah Data Pencucian
   
   Pada menu **Tambah Data Pencucian**, pengguna memilih menu 1, yaitu Tambah Data Pencucian. Pengguna kemudian memasukkan nama             pelanggan, nomor telepon, nomor plat, merk, dan warna kendaraan. Setelah itu, pengguna memilih jenis kendaraan, yaitu mobil atau         motor. Pada contoh tersebut dipilih mobil, sehingga pengguna memasukkan jumlah roda sebanyak 4. Selanjutnya, pengguna memilih layanan    pencucian, yaitu cuci reguler atau cuci premium; pada contoh dipilih Cuci Premium Mobil dengan harga Rp75.000. Setelah seluruh data      dan layanan dipilih, sistem membuat data transaksi dan menampilkan pesan "Data Berhasil disimpan ke Database" dan “Data Pencucian        Berhasil Ditambahkan!”, yang menandakan data berhasil disimpan ke dalam database dan sistem.
   
   <img width="262" height="586" alt="image" src="https://github.com/user-attachments/assets/89ab2d58-6d70-47d4-9042-66de3c590ab9" />

2. Tampilkan Data Pencucian

   Pada menu **Tampilkan Data Pencucian**, sistem akan memeriksa apakah terdapat data transaksi di dalam database. Jika belum terdapat data,
   sistem akan menampilkan informasi bahwa belum ada data pencucian. Jika terdapat data, sistem menggunakan perulangan untuk mengambil setiap
   transaksi dan menampilkan informasi transaksi, pelanggan, kendaraan, serta layanan yang dipilih.

   <img width="260" height="629" alt="Screenshot 2026-10-07 095845" src="https://github.com/user-attachments/assets/cf9e9c59-8135-4341-b065-08d7ca653dae" />

3. Ubah Data Pencucian

   Pada menu **Ubah Data Pencucian**, pengguna dapat memperbarui data transaksi yang sudah tersimpan dengan memasukkan ID transaksi yang ingin       diubah. Data yang dapat diperbarui meliputi informasi pelanggan, kendaraan, jenis kendaraan, serta layanan pencucian. Setelah seluruh data        baru dimasukkan, sistem akan memperbarui transaksi dan menampilkan pemberitahuan bahwa data berhasil diubah.

    <img width="260" height="629" alt="Screenshot 2026-10-07 095845" src="https://github.com/user-attachments/assets/13151e38-e46b-4362-adf0-ab2a071589b0" />

4. Hapus Data Pencucian

   Pada menu **Hapus Data Pencucian**, pengguna memasukkan ID transaksi yang ingin dihapus. Sistem mencari transaksi berdasarkan ID tersebut.
   Jika transaksi ditemukan, data akan dihapus dari `ArrayList`. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak             ditemukan.

   <img width="247" height="296" alt="Screenshot 2026-10-07 101218" src="https://github.com/user-attachments/assets/273fbe8b-a517-4911-a31c-38b33e2af678" />

5. Proses Pencucian

   Pada menu **Proses Pencucian**, pengguna memasukkan ID transaksi yang akan diproses. Sistem kemudian menampilkan data pencucian dari transaksi    tersebut, seperti informasi kendaraan, layanan, dan harga. Setelah pengguna mengonfirmasi proses pencucian, sistem menampilkan bahwa kendaraan    sedang dicuci dan memberikan informasi bahwa proses sedang berlangsung hingga akhirnya menampilkan pesan “Pencucian Selesai”.

   <img width="311" height="522" alt="Screenshot 2026-10-07 101507" src="https://github.com/user-attachments/assets/85808da0-3b00-4663-b919-ce798cf36384" />

6. Keluar Dari Program

   Setelah setiap proses selesai, program kembali menampilkan menu utama sehingga pengguna dapat memilih proses lainnya. Program akan terus
   berjalan selama pengguna belum memilih menu **Keluar**. Ketika pengguna memilih menu keluar, program akan menampilkan pesan bahwa program
   selesai dan menghentikan proses.

   <img width="517" height="306" alt="Screenshot 2026-10-07 101739" src="https://github.com/user-attachments/assets/7e4732fd-4b69-467c-a25d-da89df582a13" />

# Penerapan Encapsulation

penerapan encapsulation terdapat pada class Pelanggan, yaitu dengan menggunakan access modifier private pada atribut nama dan noTelepon, kemudian menyediakan method getter dan setter untuk mengakses dan mengubah nilai atribut tersebut.

<img width="306" height="58" alt="Screenshot 2026-10-07 102305" src="https://github.com/user-attachments/assets/73cbf6c9-c8bf-490b-b435-9fc686896415" />


<img width="411" height="301" alt="Screenshot 2026-10-07 102323" src="https://github.com/user-attachments/assets/f22e24ae-f47e-4f8a-b7b2-5bd4e5d008b7" />

# Penerapan Inheritance

Penerapan inheritance terdapat pada class Mobil dan Motor yang mewarisi class Kendaraan menggunakan keyword extends. Dengan inheritance, atribut dan method yang terdapat pada class Kendaraan dapat digunakan oleh class turunannya.

<img width="766" height="147" alt="Screenshot 2026-10-07 102520" src="https://github.com/user-attachments/assets/c56fd611-1ca2-4d42-9a40-147575bca1f3" />


<img width="719" height="147" alt="Screenshot 2026-10-07 102530" src="https://github.com/user-attachments/assets/06827478-2de0-48b7-9468-8cfcf8660661" />

# Penerapan Polymorphism

Penerapan polymorphism terdapat pada method tampilkanData() yang dioverride oleh class Mobil dan Motor. Method yang sama dapat menghasilkan tampilan data yang berbeda sesuai dengan jenis objek kendaraan yang digunakan.

<img width="388" height="90" alt="Screenshot 2026-10-07 102947" src="https://github.com/user-attachments/assets/fd6f3997-5b18-4ed2-8c22-8674447b0b8f" />


<img width="593" height="182" alt="Screenshot 2026-10-07 103022" src="https://github.com/user-attachments/assets/a278f2fb-6259-4ee9-82ad-743c0f6b51af" />


<img width="613" height="204" alt="Screenshot 2026-10-07 103032" src="https://github.com/user-attachments/assets/fecc5122-927d-49a1-a25a-37dcf1cf38fc" />

# Penerapan abstraction

Abstraction diterapkan melalui class Kendaraan yang menyediakan atribut dan method umum seperti tampilkanData() untuk kendaraan. Detail penampilan data kemudian disesuaikan pada class turunan seperti Mobil dan Motor.

<img width="348" height="113" alt="Screenshot 2026-10-07 103453" src="https://github.com/user-attachments/assets/a8174b1d-bb76-4322-8062-6fcf6aa6d5ce" />


<img width="346" height="16" alt="Screenshot 2026-10-07 103501" src="https://github.com/user-attachments/assets/2857cbb5-1fb5-4bf9-ad1d-fca79ff87e25" />
