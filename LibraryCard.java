public class LibraryCard {
    private student owner; //ประกาศออบเจ็กต์ owner ซึ่งอยู่ในคลาส student
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOBooks){
        borrowcnt = borrowcnt + numOBooks;
    }
    public void setOwnerName(student student){ //เมธอดกำหนนดผู้ยืมจะรับข้อมูล
        owner = student;
    }
    public int getNumberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "Owner Name : "+owner.getName() + " \n" + "Email : " +owner.getEmail() + "\n" + "Books Borrowed : " +borrowcnt;
    }
}
