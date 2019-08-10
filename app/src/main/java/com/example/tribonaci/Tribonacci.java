package com.example.tribonaci;

public class Tribonacci {
    private int n;

    public Tribonacci(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int tribo(int N){
        if(N == 0){
            return 0;
        }
        if (N == 1 || N == 2){
            return 1;
        }
        return tribo(N-1) + tribo(N-2) + tribo(N-3);

    }
}
