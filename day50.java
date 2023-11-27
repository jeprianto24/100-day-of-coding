public class day50 {

    public static void bubleShortIntAsc(int [] bilangan){
        System.out.println("==sebelum==");
        for(int bl : bilangan) {
            System.out.print(bl+", ");
        }
        for(int i =0; i< bilangan.length;i++){
            for(int j=0; j< bilangan.length-1; j++){

                if(bilangan[j] > bilangan[j+1]) {
                    int tampung = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = tampung;
                }
            }
        }
        System.out.println("\n==sesudah==");
        for (int bl : bilangan){
            System.out.print(bl+", ");
        }

    }
    public static void main(String[] args) {
        int nilai[] ={99,1,54,89,100,34,0};
        bubleShortIntAsc(nilai);
    }
}
