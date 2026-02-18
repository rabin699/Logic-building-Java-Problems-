// Problem 026: Write a program to count persons aged between 50 to 60.
class Problem026{
  public static void main(String[] args) {
    int[] array={20,30 ,50,80,90,100,65,22,55,70};
    //or we can take a user input too but i wont do this okay
    int count=0;
    for (int i : array) {
      if(i>=50 && i<=60){
        count++;
      }
    }
    System.out.println("The person aged between 50 to 60 are :"+count);
  }
}