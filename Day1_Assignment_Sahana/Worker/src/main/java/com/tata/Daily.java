package com.tata;

public class Daily extends Worker{
    public void Pay(int h){
        System.out.println(getSalrate()*h/24);
    }

}
