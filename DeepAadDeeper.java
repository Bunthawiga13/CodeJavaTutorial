public class DeepAadDeeper {
    public static void main(String[] args) {
        System.out.println(" I am Starting in main"); //1
        deep();
        System.out.println("Now I am back in main."); //5
    }
    public static void deep(){
        System.out.println("I am now in deep."); //2
        deeper();
        System.out.println("Now I am back in deep."); //4
    }
    public static void deeper(){
        System.out.println("I am now in deeper."); //3
    }
}
