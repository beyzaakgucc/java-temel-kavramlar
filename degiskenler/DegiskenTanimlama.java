//Değişken = bilgisayarda bir bilgiyi saklamak için verdiğimiz isim
public class OgrenciProfil {
    public static void main(String[] args) {
        
        int yas = 21;
        int yas = 20.5;   // HATA int tam sayılar içindir.
        double yas=20.5; //DOĞRU✅

        double notOrtalamasi = 3;
        
        String isim = "Beyzanur";
        String isim = Beyzanur; // HATA!! String türündeki değerler Java’da metin olduğu için çift tırnak içinde yazılmalıdır.
        boolean mezunMu = false;

        System.out.println(isim); //YAZDIRMA İŞLEMLLERİ
        System.out.println(yas);
        System.out.println(notOrtalamasi);
        System.out.println(mezunMu);
    }
}
