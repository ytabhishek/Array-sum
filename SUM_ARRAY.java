package Array;
class sum{

    void sum_of_array(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for(int i= 0; i<arr.length; i++){
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}
public class SUM_ARRAY {
    public static void main(String[] args) {
        sum obj = new sum();
        obj.sum_of_array();

    }
}
