import java.util.Scanner;

public class SuratMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan size stack");
        int n = sc.nextInt();
        StackSurat10 stackSurat = new StackSurat10(n);
        int pilih;

        do {
            System.out.println("== MENU SURAT ==");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat IZin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat    : ");
                    String idSUrat = sc.nextLine();
                    System.out.print("Nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas       : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S=Sakit, I=Izin): ");
                    char jenisIzin = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi(hari):");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat10 surat = new Surat10(idSUrat, nama, kelas, jenisIzin, durasi);
                    stackSurat.push(surat);
                    break;
                case 2:
                    Surat10 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("--Surat Diproses--");
                        System.out.println("ID Surat    : " + diproses.idSurat);
                        System.out.println("Nama        : " + diproses.namaMahasiswa);
                        System.out.println("Kelas       : " + diproses.kelas);
                        System.out.println("Jenis Izin  : " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi      :" + diproses.durasi + " hari");
                    }
                    break;
                case 3:
                    Surat10 top = stackSurat.peek();
                    if (top != null) {
                        System.out.println("ID Surat    : " + top.idSurat);
                        System.out.println("Nama        : " + top.namaMahasiswa);
                        System.out.println("Kelas       : " + top.kelas);
                        System.out.println("Jenis Izin: " + (top.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi   : " + top.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String search = sc.nextLine();
                    stackSurat.cariSurat(search);
                    break;
                default:
                    break;
            }
        } while (pilih != 0);
    }
}
