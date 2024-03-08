public class AvgArrays {
    public static void main(String[] args) {
        double[] numArray = {23.5, 34.6, 76.4, 89.9, 65.2, 31.7};
        double sum = 0.0;

        for(double num:numArray){
            sum+=num;
        }
        double avg = sum/numArray.length;
        System.out.format("Average: %.2f",avg);
    }
}
