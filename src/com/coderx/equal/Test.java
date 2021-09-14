package com.coderx.equal;

public class Test {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("12");
            System.out.println(a);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
