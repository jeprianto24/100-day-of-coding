public class day51 {

    public static void selectionShortIntDesc(int [] bilangan){
        System.out.println("==sebelum==");
        for(int bl : bilangan) {
            System.out.print(bl+", ");
        }
        for(int i =0; i< bilangan.length;i++){
            int indeksArray = i;
            for(int j=i; j< bilangan.length-1; j++){
                if(bilangan[indeksArray] < bilangan[j]){
                    indeksArray =j;
                }
            }
            int tampung = bilangan[i];
            bilangan[i]=bilangan[indeksArray];
            bilangan[indeksArray]=tampung;
        }
        System.out.println("\n==sesudah di selection==");
        for (int bl : bilangan){
            System.out.print(bl+", ");
        }

    }
    public static void main(String[] args) {
        int nilai[] ={99,1,54,89,100,34,0};
        selectionShortIntDesc(nilai);
    }
}
