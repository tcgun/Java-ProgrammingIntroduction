public class Main {
    // Bu satır, "Main" adlı bir Java sınıfını tanımlar.

    public static void main(String[] args) {
        // Bu satır, Java programının giriş noktasını temsil eder. Her Java uygulamasının bir "main" metodu olmalıdır.

        int ogrenciSayisi = 10;
        // Bu satır, bir tam sayı (integer) değişkeni olan "ogrenciSayisi"yi tanımlar ve 10 değeri ile başlatır.

        String mesaj = "Öğrenci Sayım : ";
        // Bu satır, bir metin (string) değişkeni olan "mesaj"ı tanımlar ve "Öğrenci Sayım : " metni ile başlatır.

        System.out.println(mesaj + ogrenciSayisi);
        // Bu satır, "mesaj" ve "ogrenciSayisi" değişkenlerini birleştirip ekrana yazdırır.

        System.out.println(mesaj + ogrenciSayisi);
        // Aynı metni bir kez daha ekrana yazdırır.

        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        // "mesaj" değişkenini kullanmadan doğrudan metin ve "ogrenciSayisi" değişkenini birleştirip ekrana yazdırır.

        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        // Bir kez daha aynı metni ekrana yazdırır.

        System.out.println("Öğrenci Sayım : " + ogrenciSayisi);
        // Metni bir kez daha ekrana yazdırır.

    }
}
