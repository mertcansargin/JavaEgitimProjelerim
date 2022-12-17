public class Employee {
    String nameSur;
    int salary,workHours,hireYear,raise;

    //ödevde kullanılanlar hariç kendimce ihtiyacım olduğunu düşündüğüm değişkenler
    int bonus=30;
    int nowYear=2021;
    int workYear,salarytax,workbonus,topprice;

    public Employee(String nameSur,int salary,int workHours,int hireYear){
        this.nameSur=nameSur;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }



    public int tax(){
        if(hireYear>=0&&hireYear<=1000){
            System.out.println("Vergi: "+"Vergi borcunuz bulunmamaktadır.");
        }
        else if(hireYear>=1000){
            salarytax= (int) (salary*0.03);
            System.out.println("Vergi: "+salarytax);
        }
        return salarytax;
    }
    public void bonus(){

        if(workHours>40){
            workbonus=bonus*(workHours-40);
            System.out.println("Bonus: "+ workbonus);
        }
        else if (workHours>=0&&workHours<=40){
            System.out.println("Bonus: "+"Bonus ücretiniz bulunmamaktadır.");
        }
    }
    public void raiseSalary(){
        workYear=nowYear-hireYear;
        if (workYear<10){
            raise= (int) (salary*0.05);
            System.out.println("Maas artısı: "+raise);
        } else if (workYear>=10&&workYear<20) {
            raise=(int)(salary*0.1);
            System.out.println("Maas artısı: "+raise);
        } else if (workYear>=20) {
            raise=(int)(salary*0.15);
            System.out.println("Maas artısı: "+raise);
        }
    }
    public void topPrice(){
        topprice=salary+bonus-salarytax;
        System.out.println("Toplam maas: "+topprice);
    }
     void info(){
        System.out.println("Çalışanın adı: "+nameSur);
        System.out.println("Çalışanın Maaşı: "+salary);
        System.out.println("Çalıştığı saat: "+workHours);
        System.out.println("İşe giriş tarihi: "+hireYear);
    }
}
