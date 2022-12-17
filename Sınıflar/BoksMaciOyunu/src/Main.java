public class Main {
    public static void main(String[] args) {

        Fighter f1=new Fighter("Çorumlu Abidin",15,100,90,5);
        Fighter f2=new Fighter("Golcuklu Veysel",20,100,85,2);

        Match match=new Match(f1,f2,80,100);
        match.run();
    }
}
