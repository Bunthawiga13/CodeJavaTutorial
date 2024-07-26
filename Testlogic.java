public class Testlogic {
    public static void main(String[] args) {
        /*
         > น้อยกว่า
         < มากกว่า
         == เท่ากับ
         >= มากว่าหรือเท่ากับ
         <= น้อยกว่าหรือเท่ากับ
         != ไม่เท่ากับ

         ตัวอย่าง
         6 > 7 false
         6 > 7 true
         
         ตัวดำเนินการหาตรรกศาสตร์
         false/true

         && AND และ (8 > 7 && 10 = 10)
         true && true = true
         false && true = false
         false  && false = false

         || OR หรือ (8 > 7 || 10 > 10)
         true && true = true
         false && true = true
         false  && false = false

         ! NOT ไม่ 
         */
        int x = 6, y = 9;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println((x < y) && (y > 3));
        System.out.println((x == 5) || (y > 2));
        System.out.println(!(y > x));
    }
}
