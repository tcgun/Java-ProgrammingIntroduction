public class Main {

    public static void main(String[] args) {
        // 'sayi' adında bir tamsayı değişkeni oluşturulur ve 24 değeri ile başlatılır.
        int sayi = 24;

        // Eğer 'sayi' değişkeni 20'den küçükse, bu şart bloğu çalışır.
        if (sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        }
        // Eğer 'sayi' değişkeni 20'ye eşitse, bu şart bloğu çalışır.
        else if (sayi == 20) {
            System.out.println("Sayı 20'ye eşittir.");
        }
        // Yukarıdaki şartlar sağlanmıyorsa, yani 'sayi' 20'den büyükse, bu şart bloğu çalışır.
        else {
            System.out.println("Sayı 20'den büyüktür.");
        }
    }
}
