public class Librarain {
    public static void main(String[] args) {
        student st1;
        LibraryCard card1, card2;
        st1 = new student();
        st1.setName("Jon Java");
        st1.setEmail("jj@email.com");
        card1 = new LibraryCard();
        card1.setOwnerName(st1);
        card1.checkOut(3);
        card2 = new LibraryCard();
        card2.setOwnerName(st1);

        System.out.println("Card1 Info : ");
        System.out.println(card1.toString()+"\n");
        System.out.println("Card2 Info : ");
        System.out.println(card2.toString()+"\n");
    }
}
