package com.lpu.dsa.bitmagic;

public class E_191NumberOf1Bits {

    public static void main(String[] args) {
      E_191NumberOf1Bits ques = new E_191NumberOf1Bits();
      int count= ques.hammingWeight(11);
      System.out.println(count);
    }
    public int hammingWeight(int n) {
              int bit;
              int count=0;
              for(int i=0;i<=31;i++)
              {
                  bit=(n>>i)&1;

                  if(bit==1)
                  {
                      count++;
                  }
              }
              return count;
    }
}
