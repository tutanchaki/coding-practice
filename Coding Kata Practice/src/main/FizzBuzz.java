package main;

/**
 * Created by tutan on 6/24/2017.
 */
public class FizzBuzz {

    String ret = "";

    public String of(int n) {
        if (n == 0) return "0";
        if(n % 3 == 0)
            ret += "Fizz";
        if (n % 5 == 0)
            ret += "Buzz";
        return ret.isEmpty()? String.valueOf(n): ret;
    }
}
