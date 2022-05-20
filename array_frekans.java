public class array_frekans {
    public static void main(String[] args) {
        int[] list = {10,20,20,10,10,20,5,20};
        int count=0, i, j;
        int[] differ = new int[8];

        for (i =0; i<list.length; i++){
            for(j=0; j<list.length; j++){
                if(list[i] == list[j]){
                    break;
                }
            }
            if(i == j){
                count++;
                differ[i] = list[i];
            }
        }
        int a = 0;
        for(int h=0; h<differ.length; h++) {
            if(differ[h] != 0) {
                for(int k=0; k<list.length; k++){
                    if(differ[h] == list[k]){
                        a++;
                    }
                }
                System.out.println(differ[h] +" sayısı "+a+" kere tekrar edildi.");
                a = 0;
            }
        }
    }
}
