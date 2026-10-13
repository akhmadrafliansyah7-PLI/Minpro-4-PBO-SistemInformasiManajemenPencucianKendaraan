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
   
  <img width="273" height="582" alt="image" src="https://github.com/user-attachments/assets/5ca6a6e2-4d38-4e7a-8ec2-1358aa1124f6" />


2. Tampilkan Data Pencucian

   Pada menu **Tampilkan Data Pencucian**, sistem akan memeriksa apakah terdapat data transaksi di dalam database. Jika belum terdapat      data, sistem akan menampilkan informasi bahwa belum ada data pencucian. Jika terdapat data, sistem menggunakan perulangan untuk          mengambil setiap transaksi dan menampilkan informasi transaksi, pelanggan, kendaraan, serta layanan yang dipilih.

   <img width="247" height="474" alt="image" src="https://github.com/user-attachments/assets/a6e31371-47ff-4236-a02a-e8f86d74279a" />

3. Ubah Data Pencucian

   Pada menu **Ubah Data Pencucian**, pengguna dapat memperbarui data transaksi yang sudah tersimpan dengan memasukkan ID transaksi yang    ingin diubah. Data yang dapat diperbarui meliputi informasi pelanggan, kendaraan, jenis kendaraan, serta layanan pencucian. Setelah      seluruh data baru dimasukkan, sistem akan memperbarui transaksi dan menampilkan pemberitahuan bahwa data berhasil diubah di database.

   <img width="259" height="610" alt="image" src="https://github.com/user-attachments/assets/a3148f4b-a6c3-4c9d-9cc4-9de74fd2fd47" />

4. Hapus Data Pencucian

   Pada menu **Hapus Data Pencucian**, pengguna memasukkan ID transaksi yang ingin dihapus. Sistem mencari transaksi berdasarkan ID         tersebut. Jika transaksi ditemukan, data akan dihapus dari Dtabase. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa data    tidak ditemukan.

   <img width="266" height="319" alt="image" src="https://github.com/user-attachments/assets/684a79d2-813d-426b-883c-e2a79edcfe66" />

5. Proses Pencucian

   Pada menu **Proses Pencucian**, pengguna memasukkan ID transaksi yang akan diproses. Sistem kemudian menampilkan data pencucian dari     transaksi    tersebut, seperti informasi kendaraan, layanan, dan harga. Setelah pengguna mengonfirmasi proses pencucian, sistem          menampilkan bahwa kendaraan    sedang dicuci dan memberikan informasi bahwa proses sedang berlangsung hingga akhirnya menampilkan        pesan “Pencucian Selesai”.

   <img width="312" height="517" alt="image" src="https://github.com/user-attachments/assets/bdfc0efe-e556-4570-adeb-bbefd1b1ee07" />

6. Keluar Dari Program

   Setelah setiap proses selesai, program kembali menampilkan menu utama sehingga pengguna dapat memilih proses lainnya. Program akan       terus berjalan selama pengguna belum memilih menu **Keluar**. Ketika pengguna memilih menu keluar, program akan menampilkan pesan        bahwa program selesai dan menghentikan proses.

   <img width="530" height="316" alt="image" src="https://github.com/user-attachments/assets/ff00b373-0717-443a-9b50-099d4d4f1150" />

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

#Penerapan JDBC

Salah satu contoh penerapan JDBC pada sistem ditunjukkan pada proses penyimpanan data pencucian ke dalam database. Pada kode tersebut, Connection digunakan untuk menghubungkan program dengan database melalui Koneksi.getConnection(), sedangkan PreparedStatement digunakan untuk menyiapkan perintah SQL dan memasukkan data menggunakan ps.setString(), ps.setInt(), dan ps.setDouble(). Selanjutnya, ps.executeUpdate() digunakan untuk menjalankan perintah SQL sehingga data dapat disimpan ke dalam database.

<img width="508" height="565" alt="Screenshot 2026-10-13 113744" src="https://github.com/user-attachments/assets/bbb3e84d-112d-46ba-ba7b-4abba5205004" />


  
