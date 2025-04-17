public class Akademik {
    Mahasiswa[] daftarMahasiswa;
    MataKuliah[] daftarMataKuliah;
    Penilaian[] daftarPenilaian;

    public Akademik() {
        daftarMahasiswa = new Mahasiswa[] {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        daftarMataKuliah = new MataKuliah[] {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };

        daftarPenilaian = new Penilaian[] {
            new Penilaian(daftarMahasiswa[0], daftarMataKuliah[0], 80, 85, 90),
            new Penilaian(daftarMahasiswa[0], daftarMataKuliah[1], 60, 75, 70),
            new Penilaian(daftarMahasiswa[1], daftarMataKuliah[0], 75, 70, 80),
            new Penilaian(daftarMahasiswa[2], daftarMataKuliah[1], 85, 90, 95),
            new Penilaian(daftarMahasiswa[2], daftarMataKuliah[2], 80, 90, 65)
        };
    }

    public void tampilMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilMahasiswa();
        }
    }

    public void tampilMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah mk : daftarMataKuliah) {
            mk.tampilMatakuliah();
        }
    }

    public void tampilPenilaian() {
        System.out.println("\nData Penilaian:");
        for (Penilaian p : daftarPenilaian) {
            p.tampilPenilaian();
        }
    }

    public void urutkanBerdasarkanNilaiAkhir() {
        for (int i = 0; i < daftarPenilaian.length - 1; i++) {
            for (int j = 0; j < daftarPenilaian.length - i - 1; j++) {
                if (daftarPenilaian[j].getNilaiAkhir() < daftarPenilaian[j + 1].getNilaiAkhir()) {
                    Penilaian temp = daftarPenilaian[j];
                    daftarPenilaian[j] = daftarPenilaian[j + 1];
                    daftarPenilaian[j + 1] = temp;
                }
            }
        }
        tampilPenilaian();
    }

    public void cariMahasiswa(String nim) {
        boolean ditemukan = false;
        for (Penilaian p : daftarPenilaian) {
            if (p.getNIM().equals(nim)) {
                p.tampilPenilaian();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}
