package percabangan;

public class SwitchNilai {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   :\"Terimakasih Pak (Muha Masam)\"");
                System.out.println("Dosen :\"Selamat lahh\"");
                break;
            case 'B':
                System.out.println("Mhs   :\"Kenapa ulun malah dapat B, kada A pak\"");
                System.out.println("Dosen :\"uuu Bawa betangg sadar sadar diri haja buhan kam ni\"");
                break;
            case 'C':
                System.out.println("Mhs   :\"Pak ulun nih rajin banar liwar turun, tugas liwar jua ngumpul tarus\"");
                System.out.println("Dosen :\"Tapi pas ujian, jar aku close semua kenapa masih buka hp\"");
                System.out.println("Mhs   :\"KHILAF PAK\"");
                break;
            default:
                System.out.println("Mhs   :\"Pak ulun handak komplain!!\"");
                System.out.println("Dosen :\"Napa yang handak di Komplain akan pulang??\"");
                System.out.println("Mhs   :\"Ulun turun pol tarus, tugas jua pol\"");
                System.out.println("Dosen :\"Bujur juakah, aja hadang aku mencek dulu (Mencek Berkas)\"");
                System.out.println("Dosen :\"Menceleng\"");
                System.out.println("Mhs   :\"Kabooorrrrrr...(Hilang setengah penyawaan:D)\"");
                break;

        }
    }
}
