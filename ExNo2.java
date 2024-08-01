public class ExNo2 {
    public static void main(String[] args) {
        System.out.println("ตัวเลขไม่เกิน 100 ที่หารด้วย 3 และ 5 ลงตัว คือ:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
