package org.example;

public class RectangleAreaAndPerimeterCalculator {
    public int area(int base, int height){

        return base * height;

    }

    public int perimeter(int base, int height){

        return (2*base)+ (2 * height);
    }

    public boolean isTriangle(int a,int b, int c){

        if(a < b+c && b < a+c && c < a +b ){
                return true;
        } else {
            return false;
        }
    }
}
