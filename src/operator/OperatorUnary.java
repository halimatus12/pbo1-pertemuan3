package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;

        i++;                    //i tadinya 0 ditambah 1 sehingga i = 1
        System.out.println(i);  //betulkan i nilainya 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi 1 menjadi 2
        System.out.println(i);  //ya betul i nya jadi 2
        i=i+1;                  //bisa diliat i++ sama dengan i = i+1
        System.out.println(i);  //i tadi 2 jadi 3 gaess


        i+=3;
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3;
        System.out.println(i);

        i*=3;
        System.out.println(i);
    }
}
