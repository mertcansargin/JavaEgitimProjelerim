public class Main {
    public static void main(String[] args) {
        String [][] dizi=new String[7][4];

        for (int i=0;i< dizi.length;i++){
            for (int k=0;k<dizi[i].length;k++){
                if(i==0||i==3||i==6){
                    dizi[i][k]=" B ";
                } else if (k==0||k==3) {
                    dizi[i][k]=" B ";
                }
                else
                    dizi[i][k]="   ";
            }
            for (String[] satir : dizi){
                for (String sutun : satir){
                    System.out.print(sutun);
                }
                System.out.println();
            }

        }
    }
}