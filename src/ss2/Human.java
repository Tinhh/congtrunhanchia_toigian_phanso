package ss2;



import java.util.Scanner;

public class Human {
    private int tu, mau;

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void khaibao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tu so");
        tu = scanner.nextInt();
        mau = scanner.nextInt();
    }

    public void inphanso(){
        System.out.println(tu + "/" + mau);
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
        int i = timuocchung(this.getTu(),this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }


}
