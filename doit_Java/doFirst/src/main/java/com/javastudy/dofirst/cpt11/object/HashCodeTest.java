package com.javastudy.dofirst.cpt11.object;

class Hash{

    String hash;
    public Hash(String hash){
        this.hash = hash;
    }
    @Override
    public int hashCode(){
        return 12323232;
    }
}

public class HashCodeTest {
    public static void main(String[] args) {
        Hash str1 = new Hash("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}
