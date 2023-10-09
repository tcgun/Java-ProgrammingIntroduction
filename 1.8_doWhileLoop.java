public class Main {

    public static void main(String[] args) {
        // Do-While

        // "j" değişkeni 1'den başlayarak başlar.
        // Döngü, "j" değişkeninin 10'dan küçük olduğu sürece çalışır.
        // Her adımda "j" değişkeni 2 artar.
        int j = 1;
        do {
            // "j" değişkeninin değerini ekrana yazdırır.
            System.out.println(j);
            // "j" değişkenini 2 artırır.
            j += 2;
        } while (j < 10);

        // Döngü tamamlandığında, "Do-While Döngüsü Bitti" mesajını yazdırır.
        System.out.println("Do-While Döngüsü Bitti");
    }
}
