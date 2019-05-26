import java.util.*;
class Source1{
    public static void main(String args[]){
        int array[];
      Scanner input = new Scanner(System.in);
      int count = input.nextInt();  
         for (int i = 1; i <= count; i++) {
           array[i] = input.nextInt();
       }
       int key = input.nextInt();
       input.close();
     int in=1;
     for(int i=count;i>0;i--)
     {
         if(key==array[i]){
             System.out.println(in);
         }
         in++;
         
     }
       
     
      //write your code here
  }
}

