import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++){
            int bil = 0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.println(i+" ");
            }
        }
    }
}
