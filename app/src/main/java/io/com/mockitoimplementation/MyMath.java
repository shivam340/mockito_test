package io.com.mockitoimplementation;

/**
 * Created by shivam on 2/24/16.
 */
public class MyMath {


    private int a;
    private int b;


    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multi(int a, int b){
        return a * b;
    }


    public float div(int a, int b){
        if ( b != 0) {
            return a / b;
        }else {
            throw new NumberFormatException("can't divide by zero");
        }
    }
}
