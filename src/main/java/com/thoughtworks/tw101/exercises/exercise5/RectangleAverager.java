package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int sum = 0 ;

        for (Rectangle rect: rectangles){
            sum += rect.area() ;
        }

        float avg = (float) sum / (float) rectangles.length ;

        return avg;
    }
}
