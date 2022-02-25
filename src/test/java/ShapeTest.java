import com.csc205.project2.Cube;
import com.csc205.project2.Cylinder;
import com.csc205.project2.Sphere;
import com.csc205.project2.Torus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ShapeTest {

    @Test
    public void testSphereVolume(){
        Sphere ball = new Sphere(15.0);
        Assertions.assertEquals(
                14137.166941154068,
                ball.volume());
    }

    @Test
    public void testSphereSurfaceArea(){
        Sphere ball = new Sphere(15.0);
        Assertions.assertEquals(
                2827.4333882308138,
                ball.surfaceArea());
    }

    @Test
    public void testCubeSurfaceArea(){
        Cube box = new Cube(15.0);
        Assertions.assertEquals(
                1350.0,
                box.surfaceArea());
    }

    @Test
    public void testCubeVolume(){
        Cube box = new Cube(15.0);
        Assertions.assertEquals(
                3375.0,
                box.volume());
    }

    @Test
    public void testCylinderSurfaceArea(){
        Cylinder can = new Cylinder(15.0, 5.0);
        Assertions.assertEquals(
                628.3185307179587,
                can.surfaceArea());
    }

    @Test
    public void testCylinderVolume(){
        Cylinder can = new Cylinder(15.0, 5.0);
        Assertions.assertEquals(
                628.3185307179587,
                can.surfaceArea());
    }

    @Test
    public void testTorusSurfaceArea(){
        Torus poolFloat = new Torus(5.0, 20.0);
        Assertions.assertEquals(
                3701.101650408509,
                poolFloat.surfaceArea());
    }

    @Test
    public void testTorusVolume(){
        Torus poolFloat = new Torus(5.0, 20.0);
        Assertions.assertEquals(
                3701.101650408509,
                poolFloat.surfaceArea());
    }

}
