public class Main {

    public static void main(String[] args) {
        // İki tamsayı değişkeni oluşturulur ve değerleri atanır.
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        // Bir tamsayı değişkeni oluşturulur ve başlangıçta 'sayi1' değişkeninin değeri atanır.
        int enBuyuk = sayi1;

        // İlk if bloğu: Eğer 'enBuyuk' değişkeni, 'sayi2' değişkeninden küçükse,
        // 'enBuyuk' değişkenine 'sayi2' değişkeninin değeri atanır. Bu blok, en büyük sayıyı bulmak için kullanılır.
        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        // İkinci if bloğu: Eğer 'enBuyuk' değişkeni, 'sayi3' değişkeninden küçükse,
        // 'enBuyuk' değişkenine 'sayi3' değişkeninin değeri atanır. Bu blok da en büyük sayıyı güncellemeye yardımcı olur.
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        // En büyük sayı 'enBuyuk' değişkeninde saklandığı için, bu değer ekrana yazdırılır.
        System.out.println("En Büyük = " + enBuyuk);
    }
}
