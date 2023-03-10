public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(2, "x", "y");

        int gearSepeda1 = sepeda1.gear;
        System.out.println("Jumlah gear "+gearSepeda1);
        sepeda1.ngerem();

    }
}