public class array_harmonic {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum += 1/(double)numbers[i];
        }
        double ort = numbers.length/sum;
        System.out.println(ort);
    }
}
