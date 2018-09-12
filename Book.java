package ru.mirea.arkabaev.lab1;

public class Book {
    public static void main(String[] args) {
        Booka B1 = new Booka("War",1000);
        System.out.println(B1);
    }
}
 class Booka{
        private String name;
        private int pages;

        public Booka (String name,int pages) {
            this.name = name;
            this.pages = pages;
        }

     public String toString() {
         return name+pages;
     }
 }
