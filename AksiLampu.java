public class AksiLampu {
    public static void main(String[] args) {
        
        lampu lampu1 = new lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
        
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
    }
}