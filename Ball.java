package ru.mirea.arkabaev.lab1;
import java.lang.*;

public class Ball {
    private String color;
    private int weight;
    public Ball() {
        color = "Red";
        weight = 10;
    }
        public Ball(String c, int w){
            color = c;
            weight = w;
        }
        public Ball(String c){
            color = c;
            weight = 10;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }
        public String getColor(String color){
        return color;
            public int getWeight() {
                return weight();
            }
            public String toString(){
                return this.color+", weight "+this.weight;
            }
            public void intoHumanAge(){
                System.out.println(color+"'ball's weight is "+weight+" killograms");
            }
        }
    }

}
