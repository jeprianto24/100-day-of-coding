import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("anu :");
        String a= sc.nextLine();
        System.out.println("ini ");
        int n = sc.nextInt();
        System.out.println("itu");
        int b = sc.nextInt();

        System.out.println("31");
        System.out.println("==========================");
        for (int i = 1;i<=n;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j = 1;j<=n;j++){
            System.out.print("   |");
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k = 1;k<=n;k++){
            System.out.print("---+");
        }

        System.out.println("\n==========================");
        System.out.println("32");
        System.out.println("==========================");
        for (int i = 1;i<=n;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j = 1;j<=n;j++){
            System.out.print(" X |");
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k = 1;k<=n;k++){
            System.out.print("---+");
        }
        System.out.println("\n==========================");
        System.out.println("33");
        System.out.println("==========================");
        System.out.print("+");
        for (int i = 1;i<=n;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j =1 ;j<=n;j++){
            if (j%2==1){
                System.out.print(" x |");
            }else {
                System.out.print(" O |");
            }
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k =1;k<=n;k++){
            System.out.print("---+");
        }
        System.out.println("\n==========================");
        System.out.println("34");
        System.out.println("==========================");

        int pang = a.length();
        for (int i=1;i<=pang;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j=0;j<=pang-1;j++){
            int manila = Integer.parseInt(String.valueOf(a.charAt(j)));
            if (manila%2==1){
                System.out.print(" X |");
            }else {
                System.out.print(" O |");
            }
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k=1;k<=pang;k++){
            System.out.print("---+");
        }
        System.out.println("\n==========================");
        System.out.println("35");
        System.out.println("==========================");
        for (int i = 1;i<=n;i++){
            System.out.println(" ");
            System.out.print("+");
            for (int j = 1;j<=b;j++){
                System.out.print("---+");
            }
            System.out.println(" ");
            System.out.print("|");
            for (int k = 1;k<=b;k++){
                System.out.print("   |");
            }
        }
        System.out.println(" ");
        System.out.print("+");
        for (int l=1;l<=b;l++){
            System.out.print("---+");
        }
        System.out.println("\n==========================");
    }
}
