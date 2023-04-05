package answer2;

public class Main {

    public static void main(String[] args){
        int num = RandomNumbers.getRandomInt (0,2_000_000_000);
        System.out.println("The number is: " + num);

        //Since the random number is greater than 0, no need to check the min value.
        //getRandom() returns an int, therefore not required to check long
        if(num<=Byte.MAX_VALUE){
            System.out.println("The number can be stored in byte variable");
        }
        else if(num<=Short.MAX_VALUE){
            System.out.println("The number can be stored in short variable");
        }
        else{
            System.out.println("The number can be stored in int variable");
        }
    }
}
