public class Main {

    public static void main(String[] args) {

        // double türünden bir dizi oluşturuyoruz ve başlangıç değerlerini atıyoruz.
        double[] myList = {1.2, 1.3, 1.4, 1.5};
        // Alternatif olarak, diziyi şu şekilde oluşturabilirdik: "new double[4];"

        // Dizinin elemanlarının toplamını saklayacak değişkeni tanımlıyoruz ve sıfıra başlatıyoruz.
        double total = 0;

        // En büyük elemanı saklayacak değişkeni tanımlıyoruz ve başlangıçta dizinin ilk elemanına eşitliyoruz.
        double enBuyukEleman = myList[0];
        // Daha açıklayıcı bir isim kullanmak isteseydik "max" gibi bir isim de kullanabilirdik.

        // Dizi elemanlarını tek tek işlemek için bir for-each döngüsü kullanıyoruz.
        for (double number : myList) {
            // Eğer mevcut eleman, şu ana kadar görülen en büyük elemandan daha büyükse:
            if (enBuyukEleman < number) {
                // "enBuyukEleman" değişkenini güncelliyoruz ve yeni büyük değeri atıyoruz.
                enBuyukEleman = number;
            }
            // Dizinin elemanlarının toplamını hesaplamak için "total" değişkenini güncelliyoruz.
            total = total + number;

            // Her elemanı ekrana yazdırıyoruz.
            System.out.println(number);
        }

        // Dizinin elemanlarının toplamını ve en büyük elemanı ekrana yazdırıyoruz.
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + enBuyukEleman);
    }
}