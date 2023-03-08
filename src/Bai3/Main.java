package Bai3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chuỗi text ban đầu là : ");
        VanBan vanBan1 = new VanBan("Bài kiểm tra số 2 ở BKACAD");
        System.out.println(vanBan1);
        vanBan1.chuHoaTatCa();
        vanBan1.chuThuongTatCa();
        vanBan1.demTu();
        vanBan1.vietHoaChuDau();
    }
}
