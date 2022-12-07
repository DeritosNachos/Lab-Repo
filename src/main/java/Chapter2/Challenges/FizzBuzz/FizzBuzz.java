package Chapter2.Challenges.FizzBuzz;
/*

 */
public class FizzBuzz {
    /**
     * A classic coding problem that will make use of the modulus (%) operator.
     * The modulus operator returns the remainder after a division (eg 8%3=2).
     * If you try to copy answers from the internet you will probably get this one wrong.
     *
     * @param n the number that will determine the fizzbuzz result.
     * @return if a number is divisible by 3, return 'Fizz'. if a number is divisible by 5, return 'Buzz'. If
     * divisible by both, return 'FizzBuzz'. If none of these are true, return a blank string "".
     */
    public String FizzBuzzGen(int n){
        String Fizz = "Fizz";
        String Buzz = "Buzz";

        if (n % 3 == 0 && n % 5 == 0){
            return (Fizz + Buzz);
        } else if (n % 3 == 0) {
            return Fizz;
        } else if (n % 5 == 0) {
            return Buzz;
        }

        else {
        return "";
        }

    }
}
