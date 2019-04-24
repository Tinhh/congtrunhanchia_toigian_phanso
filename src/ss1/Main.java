package ss1;

import java.util.Scanner;

public class Main {
    private int tu1,tu2, mau1,mau2;

    public int getTu1() {
        return tu1;
    }
    public int getTu2() {
        return tu2;
    }
    public void setTu1(int tu1) {
        this.tu1 = tu1;
    }
    public void setTu2(int tu2) {
        this.tu2 = tu2;
    }


    public int getMau1() {
        return mau1;
    }
    public int getMau2() {
        return mau2;
    }


    public void setMau1(int mau1) {
        this.mau1 = mau1;
    }
    public void setMau2(int mau2) {
        this.mau2 = mau2;
    }


    public static void main(String[] args){
        Main m = new Main();
        m.khaibao1();
        m.khaibao2();
        m.inphanso();
        m.toigianps();
        m.nghichdao();
        m.add();
        m.sub();
        m.mul();
        m.div();
    }

    public void khaibao1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tu so va mau so phan so thu 1:");
        tu1 = scanner.nextInt();
        mau1 = scanner.nextInt();
        if (mau1 == 0) {
            System.out.println("Mau phan so phai khac 0");
            khaibao1();
        }
    }
    public void khaibao2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tu so va mau so phan so thu 2:");
        tu2 = scanner.nextInt();
        mau2 = scanner.nextInt();
        if(mau2 == 0){
            System.out.println("Mau phan so phai khac 0");
            khaibao2();
        }

    }

    public void inphanso(){
        System.out.println("Phan so da nhap la:");
        System.out.println(tu1 + "/" + mau1 + " va " + tu2 + "/" + mau2);
    }

    public int timuocchung(int a, int b){
        while (a != b){
            if (a > b){
                a = a -b;
            }
            else if(a < b){
                b = b - a;
            }
        }
        return a;
    }

    public void toigianps(){
        int i = timuocchung(this.getTu1(),this.getMau1());
        int j = timuocchung(this.getTu2(),this.getMau2());

        this.setTu1(this.getTu1() / i);
        this.setMau1(this.getMau1() / i);

        this.setTu2(this.getTu2() / j);
        this.setMau2(this.getMau2() / j);

        System.out.println("Phan so sau khi toi gian la:");
        System.out.println(this.getTu1() + "/" + this.getMau1() + " va " + this.getTu2() + "/" + this.getMau2());
    }

    public void nghichdao(){
//        if (tu1 == 0 || tu2 == 0){
//            System.out.println("Khong the nghich dao vi tu so bang 0");
//            return;
//        }
        System.out.println("Phan so sau khi nghich dao la:");
        System.out.println(this.getMau1() + "/" + this.getTu1()+" va "+ this.getMau2() + "/" + this.getTu2());
    }

    public void add(){
        int ts = this.getTu1()*this.getMau2() + this.getTu2() * this.getMau1();
        int ms = this.getMau1()*getMau2();
        System.out.println("Tong 2 phan so la: "+ ts + "/" + ms);


    }

    public void sub(){
        int ts = this.getTu1()*this.getMau2() - this.getTu2() * this.getMau1();
        int ms = this.getMau1()*getMau2();
        System.out.println("Hieu 2 phan so la: "+ ts + "/" + ms);

    }

    public void mul(){
        int ts = this.getTu1() * this.getTu2();
        int ms = this.getMau1() * this.getMau2();
        System.out.println("Tich 2 phan so la: "+ ts + "/" + ms);
    }

    public void div(){
        int ts = this.getTu1() * this.getMau2();
        int ms = this.getMau1() * this.getTu2();
        System.out.println("Thuong 2 phan so la: "+ ts + "/" + ms);
    }
}
