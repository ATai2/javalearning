package com.atai.basic.jmh;

//-verbose:gc
public class Verbgc {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a=0;
        System.gc();
    }
}
