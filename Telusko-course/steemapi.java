
import java.util.Arrays;
import java.util.List;

public class steemapi {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4,5,7,2);


    // for(int n: nums){
    //   System.out.println(n);
    // }

    



    //foreach
    nums.forEach(n -> System.out.println(n)); //gives one value at a time. 

    // int sum = 0;
    // for(int n : nums){
    //   if(n%2==0){
    //     n=n*2;
    //     sum = sum + n;
    //   }
    // }

    System.out.println("");
  }
}
