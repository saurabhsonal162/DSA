package com.lpu.dsa.bitmagic;

public class E_190ReverseBits
{

    public static void main(String[] args)
    {
       E_190ReverseBits Ans= new E_190ReverseBits();
       int num= Ans.reverseBits(0b1000010011);
        System.out.println(num);
    }
    public int reverseBits(int n) {
        int result =0;
        int bit;
        for(int i=0;i<=31;i++)
        {
            bit=(n>>i)&1;

            result= result | bit<<(31-i);
        }
        return result;
    }
}
