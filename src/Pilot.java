public class Pilot { // kelas Pilot
    private String nama; 

    public Pilot(String nama) { // konstruktor
        this.nama = nama;
    }

    public String getNama() {  
        return nama;
    }

    public void maskapai(Maskapai maskapai) { // asosiasi
        System.out.println("Pilot " + nama + " penerbangan " + maskapai.getNama());
    }
}