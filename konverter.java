package com.company;

public class konverter implements operation {
    int pilih1, pilih2;
    float hasil;

    public float getHasil() { return hasil; }

    public void setHasil(float hasil) { this.hasil = hasil; }

    public int getPilih1() { return pilih1; }

    public void setPilih1(int pilih1) { this.pilih1 = pilih1; }

    public int getPilih2() { return pilih2; }

    public void setPilih2(int pilih2) { this.pilih2 = pilih2; }

    @Override
    public void convertion() {
        if (pilih1 == 1 && pilih2 == 2) {
            System.out.println("Nilai Awal = " + hasil + " KB");
            System.out.println("Hasil MegaByte (MB) = " + (hasil / 1024.0) + " MB");
        }else if (pilih1 == 1 && pilih2 == 3) {
            System.out.println("Nilai Awal = " + hasil + " KB");
            System.out.println("Hasil GigaByte (GB) = " + (hasil / 1048576.0) + " GB");
        }else if (pilih1 == 2 && pilih2 == 1) {
            System.out.println("Nilai Awal = " + hasil + " MB");
            System.out.println("Hasil KiloByte (KB) = " + (hasil * 1024.0) + " KB");
        }else if (pilih1 == 2 && pilih2 == 3) {
            System.out.println("Nilai Awal = " + hasil + " MB");
            System.out.println("Hasil GigaByte (GB) = " + (hasil / 1024.0) + " GB");
        }else if (pilih1 == 3 && pilih2 == 1) {
            System.out.println("Nilai Awal = " + hasil + " GB");
            System.out.println("Hasil KiloByte (KB) = " + (hasil * 1048576.0) + " KB");
        }else if (pilih1 == 3 && pilih2 == 2) {
            System.out.println("Nilai Awal = " + hasil + " GB");
            System.out.println("Hasil MegaByte (MB) = " + (hasil * 1024.0) + " MB");
        }else {
            System.out.println("Hasil Anda Sama Saja Mas");
        }
    }
}
