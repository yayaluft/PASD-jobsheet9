## Percobaan 1:
1.	Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
2.	Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
3.	Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
4.	Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
5.	Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
6.	Commit dan push kode program ke Github
### Jawaban:
1. saya mengganti method print menjadi ```(int i=top; i >= 0; i--)```.
2. Stack dapat menampung 5 data tugas mahasiswa.
```StackTugasMahasiswa10 stack = new StackTugasMahasiswa10(5);```
3. !isFUll() diperlukan untuk mencegah array index out of bound. Apabila kondisi is-else dihapus maka top terus bertambah melebihi indeks maksimal array, program akan melempar ArrayIndexOutOfBoundException dan crash, dan data sebelumnya bisa tertimpa secara tidak sengaja.
4. Sudah saya modifikasi.
5. Sudah saya modifikasi.
6. Sudah saya commit dan push.