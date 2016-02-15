import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TriangleTest {

  @Test
  public void newTriangle_instatiateCorrectly() {
    Triangle testTriangle = new Triangle(1,2,3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isEquilateral_true() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isIsosceles_Isosceles() {
    Triangle testTriangle = new Triangle(2,2,3);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isScalene_Scalene() {
    Triangle testTriangle = new Triangle(2,3,4);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void notTriangle_notTriangle() {
    Triangle testTriangle = new Triangle(2,4,7);
    assertEquals(true, testTriangle.notTriangle());
  }

}
