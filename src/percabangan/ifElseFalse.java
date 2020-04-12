package percabangan;

public class ifElseFalse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDidompet = 50000;

        if (uangDidompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        }else {
            System.out.println("Uang Cukup, Selamat Menikmati");
        }
    }
}
