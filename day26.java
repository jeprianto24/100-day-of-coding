public class day26 {
    public static void main(String[] args) {
        System.out.println("While");
        System.out.println("<<<<<<<<<int>>>>>>>>\n");
        int [] number={1,3,2,4,5,8,6,9,7};
        int i=0;
        while (i < number.length){
            System.out.println("number "+number[i]);
            i++;
        }
        System.out.println("<<<<<<<<<String>>>>>>>>\n");
        String [] buah={"apel","mangga","jeruk"};
        int b=0;
        while(b< buah.length){
            System.out.println("buah "+buah[b]);
            b++;
        }
        System.out.println("---------------------");
        System.out.println("do while\n");
        System.out.println("<<<<<<<<<int>>>>>>>>\n");
        int [] numbers ={11,22,33,44,55,66,77,88,99};
        int j =0;
        do{
            System.out.println("numbers "+ numbers[j]);
            j++;
        }while(j< numbers.length);
        System.out.println("<<<<<<<<<String>>>>>>>>\n");
        String [] hewan={"kucing","ayam","sapi"};
        int c=0;
        do{
            System.out.println("itu adalah "+hewan[c]);
            c++;
        }while(c< hewan.length);
    }
}
