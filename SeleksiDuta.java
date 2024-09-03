import java.util.Scanner;

public class SeleksiDuta {
    public static void main(String[] args) {
        String nama, kelas, perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = s.nextLine();
        System.out.println("Masukkan kelas (X/XI): ");
        kelas = s.next();

        if (kelas.equalsIgnoreCase("X")||kelas.equalsIgnoreCase("XI")) {
            System.out.println("Perilaku Siswa (Baik/Cukup) : ");
            perilaku = s.next();
            if (perilaku.equalsIgnoreCase("Baik")) {
            System.out.println("Masukkan Rata-Rata Nilai Siswa : ");
                nilai = s.nextInt();
                if (nilai>=90) {
                System.out.println("Anda dinyatakan lolos seleksi");
                }else{
                    System.out.println("Anda tidak lolos dikarenakan nilai");
                }
        }else{
            System.out.println("Anda dinyatakan tidak lolos dikarenakan perilaku");
        }
        }else{
            System.out.println("Anda dinyatakan tidak lolos dikarenakan kelas XII");
        }
    
    }
}
