public class Guru {
    // variabel
    int nip;
    String nama;
    String mapel;
    String status;

    // Constructor Parameter
    public Guru (int i, String n, String k, String p){
        nip = i;
        nama = n;
        mapel = k;
        status = p;
}
        public void print() {
            System.out.println("NIP: "+nip);
            System.out.println("Nama: "+nama);
            System.out.println("Mapel: "+mapel);
            System.out.println("Status: "+status);

        }
}
