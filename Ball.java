package ru.mirea.arkabaev.lab1;

public class Ball {

        private String color;
        private int weight;

        public Ball (String color, int weight)
        {
            this.color = color;
            this.weight = weight;
        }
        public String toString(){
            return "Ball is " + color +  " and his weight is " + weight;
        }
    }
