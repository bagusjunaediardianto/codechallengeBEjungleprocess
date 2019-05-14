# codechallengeBEjungleprocess
For Code Challenge

- Hi Semuanya

Perkenalkan nama saya bagus junaedi ardianto
saya ingin menjelaskan gambaran umum bagaimana code ini berjalan

langsung saja ya...!

saya memiliki 6 buah tabel yang saling berelasi, antara lain :
- tb_user
- tb_driver
- tb_tb_rental
- tb_penyewa
- tb_mobil
- tb_transaksi

* tb_user berelasi one to one dengan tb_driver, tb_tb_rental, dan tb_penyewa
  - maksudnya adalah setiap user hanya berhak terdaftar sebagai 1 akses
  - jika user terdaftar sebagai driver, maka user tidak bisa memiliki akses lain selain driver
  - jika user terdaftar sebagai rental, maka user tidak bisa menjadi selain dari rental
  - jika user terdaftar sebagai penyewa, maka user tidak bisa menjadi selain dari penyewa / cusotmer

* tb_rental berelasi one to many dengan tb_mobil
  - maksudnya adalah setiap rental berhak memiliki banyak mobil, 1 rental bisa mempunyai 5, 10 , 50 mobil

* tb_driver berelasi one to many dengan tb_transaksi
  - maksudnya adalah setiap driver berhak untuk melakukan banyak transaksi
  
* tb_mobil berelasi one to many dengan tb_transaksi
  - maksudnya adalah setiap mobil dapat melakukan banyak transaksi

* tb_penyewa berelasi one to many dengan tb_transaksi
  - maksudnya adalah setiap penyewa dapat melakukan banyak transaksi
  
saya kira gambaran umumnya adalah seperti yang sudah saya jabarkan diatas
mohon maaf masih terus update dikarenakan keterbatasan waktu yang harus terbagi
semoga sukses terus
