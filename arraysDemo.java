public class Main {

	public static void main(String[] args) {
		// Öğrenci isimleri için dört ayrı String değişkeni oluşturuldu.
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		// Her bir öğrenci ismi ekrana yazdırılır.
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		// Bu satır, programın farklı bölümlerini veya sonuçları ayırmak ve daha iyi bir görsel ayrım sağlamak için eklenmiştir.
		System.out.println("--------------------------------------");

		// Öğrenci isimlerini saklamak için 4 elemanlı bir String dizisi oluşturuluyor.
		String[] ogrenciler = new String[4];

		// Diziye öğrenci isimleri atanıyor.
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";

		// Dizi elemanlarını sırayla dolaşmak için bir for döngüsü başlatılıyor.
		for (int i = 0; i < ogrenciler.length; i++) {
			// Her bir öğrenci ismi ekrana yazdırılıyor.
			System.out.println(ogrenciler[i]);
		}

		// Bu satır, programın farklı bölümlerini veya sonuçları ayırmak ve daha iyi bir görsel ayrım sağlamak için eklenmiştir.
		System.out.println("----------------------------------------");

		// "for-each" döngüsü kullanılarak dizinin her elemanı tek tek alınır.
		// Her öğrenci ismi "ogrenci" değişkenine atanır ve ekrana yazdırılır.
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}