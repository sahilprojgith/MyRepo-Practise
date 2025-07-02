public class mdarray {
  public static void main(String args[]){

    int nums[][] = new int[3][4];


    for(int i = 0;i<3;i++){
      for(int j = 0;j<4;j++){
        nums[i][j]=(int)(Math.random()*100);
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

    for(int i = 0;i<3;i++){
      for(int j = 0;j<4;j++){
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

    for(int n[] : nums){     // n here is a single dimensional array
       for(int m :n){
        System.out.print(m + " ");
       }
       System.out.println();
    }


  }
}
