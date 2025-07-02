public class jaggedarr {
  public static void main(String[] args) {
      int nums[][] = new int[3][];

      nums[0] = new int[3];
      nums[1] = new int[4];
      nums[2] = new int[2];
      
      for(int i = 0;i<nums.length;i++){
        for(int j = 0;j<nums[i].length;j++){
          nums[i][j]=(int)(Math.random()*100);
        }
      }

      for(int n[]:nums){    //enhanced for loops directly detect the aray we don;t have to mention the size.
        for(int m : n){// m is taking value from n
          System.out.print(m + " "); 
        }
        System.out.println();
      }




  }
}
