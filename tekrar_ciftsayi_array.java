import java.util.Arrays;

public class tekrar_ciftsayi_array {
    public static void main(String[] args) {
        int[] list = {1,3,5,4,9,4,7,5,2,69,55,12,7987,2,12,3,5,9};
        Arrays.sort(list);
        for(int i = 0; i<list.length; i++){
            if(list[i]%2 == 0){
                int a = Arrays.binarySearch(list, list[i]);
                for(int j = a+1; j<list.length; j++){
                    if(list[i] == list[j]){
                        System.out.println(list[i]);
                        i++;
                    }
                }

            }
        }
    }
}
