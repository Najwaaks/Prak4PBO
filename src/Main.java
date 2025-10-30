public class Main {
    public static void main(String[] args) { // method main
        Pilot P1 = new Pilot("Davin");
        Pilot P2 = new Pilot("Dawim");
        Pilot P3 = new Pilot("Ogaima");
        Pilot P4 = new Pilot("Rizky");
        Maskapai M1 = new Maskapai("Citilink");
        Maskapai M2 = new Maskapai("Garuda Indonesia");
        Maskapai M3 = new Maskapai("Indonesia AirAsia");
        Maskapai M4 = new Maskapai("Lion Air");

        // menampilkan hasil asosiasi
        System.out.println("=== Asosiasi Pilot dan Maskapai ===");
        P1.maskapai(M1); 
        P2.maskapai(M2);
        P3.maskapai(M3);
        P4.maskapai(M4);
    }
}