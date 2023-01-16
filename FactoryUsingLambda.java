package com.assigmentjava8;
//In this example, a Shape interface and Rectangle and Circle classes that 
//implement it are defined. Then a ShapeFactory interface and RectangleFactory 
//and CircleFactory classes that implement it are defined. The FactoryUsingLambda
//class demonstrates how to use lambda expressions to create objects of Rectangle
//and Circle classes via the create() method of the ShapeFactory interface.
//
//You can see that instead of having to create
//separate classes for the factory pattern, you can
//use lambda expressions to create objects directly in the method that uses them

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

interface ShapeFactory {
    Shape create();
}

class RectangleFactory implements ShapeFactory {
    public Shape create() {
        return new Rectangle();
    }
}

class CircleFactory implements ShapeFactory {
    public Shape create() {
        return new Circle();
    }
}

class FactoryUsingLambda {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = () -> new Rectangle();
        Shape rectangle = rectangleFactory.create();
        rectangle.draw();

        ShapeFactory circleFactory = () -> new Circle();
        Shape circle = circleFactory.create();
        circle.draw();
    }
}
