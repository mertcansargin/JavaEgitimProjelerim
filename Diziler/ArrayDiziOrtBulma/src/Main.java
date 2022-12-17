public class Main {
    public static void main(String[] args) {
        int[] dizi= {1,2,3,4,5,6};
        double top = 0,ort;

        for(int i = 0; i< dizi.length; i++){
            top+=(1/dizi[i]);
        }
        System.out.println("Toplam: "+top);
        ort=dizi.length/top;
        System.out.println("Ortalama: "+ort);
    }
}