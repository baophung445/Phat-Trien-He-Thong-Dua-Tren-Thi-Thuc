/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author UnmatchedTaiNguyen
 */
public class NewClass {

    public static void main(String[] args) {
        PhanSo phanSo = new PhanSo(2, 3);
        PhanSo phanSo1 = new PhanSo(3, 7);
        phanSo1 = phanSo;
        System.out.println(phanSo1.add());
        PhanSo kq = phanSo1.add(phanSo1);
        System.out.println(kq.tu + "/" + kq.mau);
    }
}

class PhanSo {

    public PhanSo(int t, int m) {
        tu = t;
        mau = m;
    }

    public Integer tu;
    public Integer mau;

    public int add() {
        return tu + mau;

    }

    public PhanSo add(PhanSo s2) {
        return new PhanSo(this.tu * s2.mau + this.mau * s2.tu, this.mau * s2.mau);
    }
}
