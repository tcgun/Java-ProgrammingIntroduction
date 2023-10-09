public class Main {

    public static void main(String[] args) {
        //While

        // "i" değişkeni 1'den başlayarak başlar.
        // Döngü, "i" değişkeninin 10'dan küçük olduğu sürece çalışır.
        // Her adımda "i" değişkeni 2 artar.
        int i = 1;
        while (i < 10) {
            // "i" değişkeninin değerini ekrana yazdırır.
            System.out.println(i);
            // "i" değişkenini 2 artırır.
            i += 2;
        }

        // Döngü tamamlandığında, "While Döngüsü Bitti" mesajını yazdırır.
        System.out.println("While Döngüsü Bitti");
    }
}