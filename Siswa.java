import java.util.Scanner;

public class Siswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa:");
        int NilaiAkhir = input.nextInt();
        int RataRata;
        int temp = 0;

        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nilai Siswa ke-" + i + ":");
            int NilaiSiswa = input.nextInt();
            temp += NilaiSiswa;
        }
System.out.println("Rata rata nilai siswa adalah: " + (temp / NilaiAkhir));


    }
}

