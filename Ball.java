package ru.mirea.arkabaev.lab1;

public class Ball {
    public static void main(String[] args) {
    Balls b1 = new Balls("Red",10);
    System.out.println(b1);
    }
}
class Balls
{
    private String color;
    private int weight;

    public Balls(String color, int weight)
    {
        this.color = color;
        this.weight = weight;
    }
    public String toString(){
        return "Ball is "+color+ " and his weight is "+weight;
    }
}
