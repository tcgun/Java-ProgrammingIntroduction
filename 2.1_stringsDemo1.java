public class Main {

    public static void main(String[] args) {

        // Bir metin dizisi (String) tanımlanıyor ve "mesaj" adı veriliyor.
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);  // "mesaj" değişkeni konsola yazdırılıyor.

        // Metin dizisinin uzunluğu (karakter sayısı) yazdırılıyor.
        System.out.println("Eleman sayısı : " + mesaj.length());

        // Metin dizisinin 5. karakteri (indeksi 4) yazdırılıyor.
        System.out.println("5.Eleman :" + mesaj.charAt(4));

        // Metin dizisi "mesaj" ile " Yaşasın!" metni birleştirilip yazdırılıyor.
        System.out.println(mesaj.concat(" Yaşasın!"));

        // Metin dizisinin "B" harfi ile başlayıp başlamadığı kontrol ediliyor ve sonucu yazdırılıyor.
        System.out.println(mesaj.startsWith("B"));

        // Metin dizisinin "." ile bitip bitmediği kontrol ediliyor ve sonucu yazdırılıyor.
        System.out.println(mesaj.endsWith("."));

        // Metin dizisinin "b" harfi ile başlayıp başlamadığı kontrol ediliyor (büyük-küçük harf duyarlı) ve sonucu yazdırılıyor.
        System.out.println(mesaj.startsWith("b"));

        // "karakterler" adında yeni bir karakter dizisi (char array) oluşturuluyor ve "mesaj" dizisinin ilk 5 karakteri bu diziye kopyalanıyor.
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);

        // "karakterler" dizisi konsola yazdırılıyor.
        System.out.println(karakterler);

        // Metin dizisinde belirli bir karakterin veya alt dizenin ilk indeksini döndüren "indexOf" kullanılıyor.
        // İlk 'a' harfinin indeksi ve 'ok' alt dizesinin ilk indeksi yazdırılıyor.
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("ok"));

        // Metin dizisinde belirli bir karakterin veya alt dizenin son indeksini döndüren "lastIndexOf" kullanılıyor.
        // Son 'a' harfinin indeksi ve 'ava' alt dizesinin son indeksi yazdırılıyor.
        System.out.println(mesaj.lastIndexOf('a'));
        System.out.println(mesaj.lastIndexOf("ava"));
    }
}