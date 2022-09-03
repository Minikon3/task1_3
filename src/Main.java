public class Main {
    public static void main(String[] args) {
        int digit=1;
        for (int i=0;i<10;i++){
            if (digit!=1) {
                System.out.print("1/");
            }
            System.out.print(digit+" ");
            digit=digit+1;
        }
    }
}