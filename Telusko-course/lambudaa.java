@FunctionalInterface  // we give annotation of functional interface so this has only one abstract method.
interface chubby{
  //void stipe();
  int add(int i,int j);

}

public class lambudaa {
  public static void main(String[] args) {

    // chubby chub = new chubby() {
    //   public int add(int i, int j){
    //     return  i+j;
    //   }
    // }; this can be written in lambda expresssions as :

    chubby chub = (i,j) -> i+j;// this i+j becomes return type

    int result = chub.add(4,5);
    System.out.println(result);
    
  }
}
