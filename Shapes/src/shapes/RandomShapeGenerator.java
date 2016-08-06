/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.*;
/**
 *
 * @author Peter
 */
public class RandomShapeGenerator {
  
private Random rand = new Random(47);
public Shape next() {
switch(rand.nextInt(3)) {
default:
case 0: return new Circle();
case 1: return new Square();
case 2: return new Triangle();


}

}
}