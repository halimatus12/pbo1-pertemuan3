package percabangan;

public class percabanganifElse {
    //condition1 false, condition2 true
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDidompet = 53000;

        if (uangDidompet < totalBelanja) {
            System.out.println("Uang Kurang, Kurangi Jajan Anda");
        } else if (uangDidompet > totalBelanja) {
            double angsul = uangDidompet - totalBelanja;
            System.out.println("Uang Cukup, angsul :" +angsul);
        } else {
            System.out.println("Uang pas... uWuuu..");
        }
    }
}