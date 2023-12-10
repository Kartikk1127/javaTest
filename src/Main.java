
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//write a program to reverse the elements in the array
//int [] arr = [78,45,21,32,67]


//10,67,32,21,45,78

//153

public class Main {
    public static void main(String[] args) {

        int n = 154;

        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int number){

        int temp = number;
        int lastDigit = 0;
        int sum = 0;

        while (number!=0){
            lastDigit = number % 10;
            sum = (int) (sum + Math.pow(lastDigit, 3));
            number = number / 10;
        }

        return sum==temp;
    }
}