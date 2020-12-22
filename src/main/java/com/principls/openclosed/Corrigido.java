package com.principls.openclosed;

public class Corrigido {

    public static void main(String[] args) {
        GraphicEditor2 graphicEditor = new GraphicEditor2();
        graphicEditor.drawShape(new Circle2());
        graphicEditor.drawShape(new Rectangle2());
        graphicEditor.drawShape(new Triangle2());
    }
}

class GraphicEditor2 {
    public void drawShape(Shape2 s) {
       s.draw();
    }
}

abstract class Shape2 {
    int m_type;
    public abstract void draw();
}

class Rectangle2 extends Shape2 {
    Rectangle2() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
class Circle2 extends Shape2 {
    Circle2() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle2 extends Shape2{
    Triangle2() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}