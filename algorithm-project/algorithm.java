

public class algorithm
{
    public static void main(String[]args){
        int i=1;
        while(i<=100){
            if(i%5==0&&i%3==0){   
              
              System.out.println("FizzBuzz"); 
              i++;  
            }
            if(i%3==0){
                System.out.println("Fizz");
                i++;
            }
            if(i%5==0){                
                System.out.println("Buzz");
                i++;
            }
            else{              
                System.out.println(i);
                i++;
            }
        }
    }

}
