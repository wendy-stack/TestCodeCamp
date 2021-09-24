package com.inheritance;

public class Son extends Father {
    public static void main(String[] args) {
    Father father = new Father();
    father.playGuitar();
    father.playFootball();
    father.playSoccer();
    Son son = new Son();
    son.readBooks();
    son.watchMovies();

    }

    public void readBooks(){
        System.out.println("Ade loves to read books concerning software development");
    }

    public void watchMovies(){
        System.out.println("Ade loves to watch movies with me");
    }
}
