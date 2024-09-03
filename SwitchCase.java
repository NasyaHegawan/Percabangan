import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Kelas : ");
        System.out.println("1. XRPL1\n2. XRPL2\n3. XRPL3\n4. XRPL4\n5. XRPL5");
        pilihan = s.nextInt();

        switch (pilihan){
            case 1:
            kelas = "XRPL1";
            break;
            case 2:
            kelas = "XRPL2";
            break;
            case 3:
            kelas = "XRPL3";
            break;
            case 4:
            kelas = "XRPL4";
            break;
            case 5:
            kelas = "XRPL5";
            break;
            default:
            kelas = "Kelas tidak terdaftar";

        }
        System.out.println("Kelas : "+kelas);
        }
    }

