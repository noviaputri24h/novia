import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <String> Mahasiswa = new ArrayList<>();
        Mahasiswa.add("Budi");
        Mahasiswa.add("Andi");
        Mahasiswa.add("Joko");
        Mahasiswa.add("Rudi");

        for (String mhs:Mahasiswa) {
            System.out.println(mhs);

        System.out.println("=====================");
        for (int i = 0; i < Mahasiswa.size(); i++) {
            System.out.println(Mahasiswa.get(1));
        }
        }
    }
}