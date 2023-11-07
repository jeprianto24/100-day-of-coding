public class day30 {
    public static void main(String[] args) {
        String [][][] kata={
                {{"aku","kamu","kita"},
                {"dia","mereka","kami"},
                {"ayah","ibu","anak"}},
                {{"kakek","nenek","om"},
                {"tante","kakak","adik"},
                {"saudara","saudari","sepupu"}},
                {{"ini","itu","anu"},
                {"mungkin","karena","adalah"},
                {"sebab","akibat","jadinya"}}
        };
        int i, j,k;
        for ( i=0;i<3; i++){
            for ( j=0;j<3; j++){
                for ( k=0;k<3; k++){
                    System.out.print(kata[i][j][k]+" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
