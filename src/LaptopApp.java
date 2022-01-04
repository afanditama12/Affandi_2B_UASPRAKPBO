import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {
        // class scanner untuk input data dari user
        Scanner scanner = new Scanner(System.in);
        // intansiasi class laptop dengan polymorphism
        Komputer komputer = new Laptop();
        // user memilih kanan atau kiri
        System.out.println("Pilih Klik Kanan atau Klik Kiri : ");
        // menerima hasil inputan user
        String pilihan = scanner.nextLine();
        // seleksi jika user memilih kanan maka tampilkan isi dari method hidupkan_os
        if (pilihan.equals("kanan")) {
            komputer.hidupkan_os();
            // seleksi jika user memilih kanan maka tampilkan isi dari method hidupkan_os
        } else if (pilihan.equals("kiri")) {
            komputer.matikan_os();
            // jika tidak memilih keduanya
        } else {
            System.out.println("Input salah");
        }
        // menampilkan isi dari method tekan enter
        ((Laptop) komputer).tekan_enter();
        // menerima hasil input user
        String enter = scanner.nextLine();
        // seleksi jika user mengetik huruf enter maka tampilkan isi dari method cetak data
        if (enter.equals("enter")) {
            ((Laptop) komputer).cetak_data();
            // jika user tidak mengetik enter
        } else {
            System.out.println("Input salah");
        }

    }
}
