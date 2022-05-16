public class asal_sayi {
    public static void main(String[] args) {
        int i,j,number=0;
        for(i=2; i<100; i++){
            for(j=1;j<=i;j++){
                if(i%j == 0){
                    number++;
                }else{
                    continue;
                }
            }
            if(number == 2){
                System.out.print(i+" ");
                number = 0;
            }else{
                number = 0;
            }
        }
    }
}
