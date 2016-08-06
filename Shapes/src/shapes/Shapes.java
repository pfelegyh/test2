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
public class Shapes {
  private static final RandomShapeGenerator gen =
new RandomShapeGenerator();
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  
  Shape[] s = new Shape[9];
// Fill up the array with shapes:
for(int i = 0; i < s.length; i++)
s[i] = gen.next();
// Make polymorphic method calls:
for(Shape shp : s){

//System.out.println(shp.getClass()); 
shp.draw();
if(shp instanceof Square){

 shp.move();
  
}
}
}
}

  
  
  
  
  

