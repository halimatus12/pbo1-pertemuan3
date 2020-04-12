package percabangan;

public class ifElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDidompet = 25000;

        if (uangDidompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        }else {
            System.out.println("Uang Cukup, Selamat Menikmati");
        }
    }
}
