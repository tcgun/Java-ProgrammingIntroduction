public class Main {

    public static void main(String[] args) {
        // char türünde 'grade' adlı bir değişken oluşturuyoruz ve 'D' değerini atıyoruz.
        char grade = 'D';

        // 'switch' ifadesi, 'grade' değişkeninin değerini kontrol etmek için kullanılıyor.
        switch (grade) {

            // Eğer 'grade' değişkeni 'A' değerine eşitse, bu blok çalışır.
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;

            // Eğer 'grade' değişkeni 'B' değerine eşitse, bu blok çalışır.
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;

            // Eğer 'grade' değişkeni 'C' değerine eşitse, bu blok çalışır.
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;

            // Eğer 'grade' değişkeni 'D' değerine eşitse, bu blok çalışır.
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;

            // Eğer 'grade' değişkeni 'F' değerine eşitse, bu blok çalışır.
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;

            // Yukarıdaki 'case' ifadelerine uymayan herhangi bir değer için, bu blok çalışır.
            default:
                System.out.println("Geçersiz Not Girdiniz");
        }
    }
}
