public class Netbook extends Komputer implements Mouse{

    // method hidupkan os
    @Override
    public void hidupkan_os() {
        System.out.println("OS telah dinyalakan");
    }

    // method matikan os
    @Override
    public void matikan_os() {
        System.out.println("OS telah dimatikan");
    }

    // method klik kanan
    public void klik_kanan() {
        System.out.println("Klik Kanan");
    }

    // method klik kiri
    public void klik_kiri() {
        System.out.println("Klik Kanan");
    }

    // method tekan enter
    public void tekan_enter() {
        System.out.println("Ketik enter untuk melanjutkan !");
    }

    // method cetak data
    public void cetak_data() {
        System.out.println("Selamat datang");
    }

}
