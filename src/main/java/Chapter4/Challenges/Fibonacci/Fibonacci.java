package Chapter4.Challenges.Fibonacci;

public class Fibonacci {
    /**
     * return the nth number of fibonacci sequence
     * the sequence is: the nth number is the sum of n-1 and n-2
     * n0 = 0
     * n1 = 1
     * so.. the sequence is:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int number){


        int firstNum = 0;
        int secondNum = 1;

        if (number  == 0) {
            return firstNum;
        } else if (number == 1){
            return secondNum;
        }else if (number == 2) {
            return firstNum + secondNum;
        } else { //number greater than 2

            while(number > 3) {   //bad logic, not understood fully but works...
                firstNum += secondNum;
                secondNum += firstNum;
                number --;
            }
            return secondNum;
        }


    }



}
