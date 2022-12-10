public class Main {
    public static void main(String[] args) {
        int[] dizi= {10,28,83,44,53,60};
        int top = 0,ort,sayac=0;

        for(int i = 0; i< dizi.length; i++){
            top+=dizi[i];
            sayac++;
        }
        System.out.println("Toplam: "+top);
        System.out.println("Sayac: "+sayac);
        ort=top/sayac;
        System.out.println("Ortalama: "+ort);
    }
}