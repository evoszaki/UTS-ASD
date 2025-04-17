import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Akademik akademik = new Akademik();
        int pilihan;

        do {
            System.out.println("\nMENU SISTEM AKADEMIK");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                akademik.tampilMahasiswa();
            } else if (pilihan == 2) {
                akademik.tampilMataKuliah();
            } else if (pilihan == 3) {
                akademik.tampilPenilaian();
            } else if (pilihan == 4) {
                akademik.urutkanBerdasarkanNilaiAkhir();
            } else if (pilihan == 5) {
                System.out.print("Masukkan NIM: ");
                String nim = input.next();
                akademik.cariMahasiswa(nim);
            } else if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan sistem.");
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
