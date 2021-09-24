package com.inheritance;

public class MethodOverridingTask extends MethodOverloadingTask{
    public static void main(String[] args) {

        MethodOverloadingTask son = new MethodOverridingTask();
        son.overloadingTask();
        son.adeyiHobby(1,true);

    }
    public void overloadingTask(){
        System.out.println("This is the first task on overriding");
    }
    public void adeyiHobby(int type, Boolean condition){
        System.out.println("Adeyi's hobby is his wife");
    }

}
