public class Sepeda {
    
    int gear = 5;
    int gear2 = 6;
    int Roda;
    String Jenis;
    String Merk;

    void ngerem() {
        System.out.println("Sepeda direm");
    }

    Sepeda(int jumlahRoda, String jenis, String merk) {

        Roda = jumlahRoda;
        Jenis = jenis;
        Merk = merk;

        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}