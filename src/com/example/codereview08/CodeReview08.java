package com.example.codereview08;

public class CodeReview08 {
    public static void main(String[] args) {
        //Parameter Rectangle
        System.out.println("The Area of the Rectangle is "+calculateRectArea(20,30)+ " cm² ");
        System.out.println("The Area of the Rectangle is "+calculateRectArea(40,50)+ " cm² ");
        System.out.println("The Area of the Rectangle is "+calculateRectArea(30,20)+ " cm² ");
        System.out.println("The Area of the Rectangle is "+calculateRectArea(450,200)+ " cm² ");

        //RectanglePerimeter
        System.out.println("The Perimeter of the Rectangle is "+rectanglePerimeter(20,30)+ " cm ");
        System.out.println("The Perimeter of the Rectangle is "+rectanglePerimeter(23,45)+ " cm ");
        System.out.println("The Perimeter of the Rectangle is "+rectanglePerimeter(565,454)+ " cm ");
        System.out.println("The Perimeter of the Rectangle is "+rectanglePerimeter(56,80)+ " cm ");


        //SquareArea
        System.out.println("The Area of the Square is "+squareArea(200)+ " cm² ");
        System.out.println("The Area of the Square is "+squareArea(40)+ " cm² ");
        System.out.println("The Area of the Square is "+squareArea(89)+ " cm² ");
        System.out.println("The Area of the Square is "+squareArea(4)+ " cm² ");

        //SquarePerimeter
        System.out.println("The Perimeter of the Square is "+squarePerimeter(200)+ " cm ");
        System.out.println("The Perimeter of the Square is "+squarePerimeter(34)+ " cm ");
        System.out.println("The Perimeter of the Square is "+squarePerimeter(67)+ " cm ");
        System.out.println("The Perimeter of the Square is "+squarePerimeter(90)+ " cm ");


       //Area of Rectangle
                double length = 2.0;
                double width = 5.0;
                double area = length*width;
                System.out.println("Area of Rectangle is:"+area+ " cm² ");

         //Bonus Part 1
        int [] widh={23,34,545,654,12,43};
        int [] height={22,45,342,433,23,34};
        int sum= 0;
        int sum2 = 0;
        for(int i=0;i<widh.length;i++) {
            sum=widh[i]*height[i];
            sum2=widh[i]+ height[i]*2;

            System.out.println("The Area of the Rectangle is "+widh[i]+ " * "+ height[i] + " = "+ sum);
            System.out.println("The Perimeter of the Rectangle is "+widh[i]+ " + "+ height[i] + "*2"+  " = "+ sum2);
        }

        }


    public static int calculateRectArea(int a, int b){
        return(a*b);
    }
    public static int rectanglePerimeter(int c, int d){
        return(c+d+c+d);
    }
    public static int squareArea(int a ){
        return(a*a);

    }
    public static int squarePerimeter(int a ){
        return(a*4);

    }
}
