package com.sanju.spring;

import java.util.List;

public class Rectangle implements Shape {
 
       private List<Point> points;
 
       public List<Point> getPoints() {
              return points;
       }
 
       public void setPoints(List<Point> points) {
              this.points = points;
       }
      
       public void draw() {
              for(Point point : points) {
                     System.out.println(" (" + point.getX() + ", " + point.getY() + ")");
              }
       }
      
}