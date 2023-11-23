import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas angka : ");
        int n =sc.nextInt();

        for (int i=1; i<=n;i++){
            if (i%5==0){
                System.out.println("ini kelipatan 5");
            }else {
                System.out.println(i);
            }
        }
    }
}
