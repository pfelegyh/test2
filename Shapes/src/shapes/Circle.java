/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Peter
 */
public class Circle extends Shape{
  
  
  
  @Override
  public void draw() { System.out.println("Circle.draw()"); }
  
  public void erase() { System.out.println("Circle.erase()"); }
  
}
