import java.util.Scanner;
public class day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.print("Masukkan Nilai A : ");
        a = sc.nextInt();
        System.out.print("Masukkan Nilai B : ");
        b=sc.nextInt();
        System.out.print("Masukkan Nilai C : ");
        c = sc.nextInt();
        System.out.print("Masukkan Nilai D : ");
        d = sc.nextInt();
        System.out.print("Masukkan Nilai E : ");
        e = sc.nextInt();
        cariMaxMin(a,b,c,d,e);
    }
    static void cariMaxMin(int a,int b,int c,int d,int e){
        int[] data = {a,b,c,d,e};
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0 ; j < data.length-i-1; j++) {
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        System.out.println("Nilai Min : "+data[0]);
        System.out.println("Nilai Max : "+data[data.length-1]);
    }
}