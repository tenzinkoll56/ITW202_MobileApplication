package com.example.todo_9;

public class Calculator {
     public enum Operator {ADD, SUB, DIV, MUL}

     public double add(double optone, double opttwo){
         return optone + opttwo;
     }
    public double sub(double optone, double opttwo){
        return optone - opttwo;
    }
    public double div(double optone, double opttwo){
        return optone / opttwo;
    }
    public double mul(double optone, double opttwo){
        return optone * opttwo;
    }
}
