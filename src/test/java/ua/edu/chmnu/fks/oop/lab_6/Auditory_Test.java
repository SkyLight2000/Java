/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_6;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import ua.edu.chmnu.fks.oop.lab_6.Auditory.Parallelepiped;
import ua.edu.chmnu.fks.oop.lab_6.Auditory.Parallelogram;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeAngleException;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeHeightException;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeLengthException;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeWidthException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 *
 * @author User
 */
public class Auditory_Test {

    @Test
    public void parallelogramPerimeterTest(){
        Parallelogram par = mock(Parallelogram.class);
        when(par.perimeter()).thenReturn(20.0);
        assertEquals(20.0, par.perimeter());
    }

    @Test
    public void parallelogramSquareTest() throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        Parallelogram par = mock(Parallelogram.class);
        when(par.square()).thenReturn(77.26650019206264);
        assertEquals(77.26650019206264, par.square());
    }

    @Test
    public void getAngle1Test(){
        Parallelogram par = mock(Parallelogram.class);
        when(par.getAngle1()).thenReturn(12.0);
        assertEquals(12.0, par.getAngle1());
    }

    @Test
    public void setLengthTest() throws NegativeLengthException {
        Parallelogram par = mock(Parallelogram.class);
        par.setLength(2);
        par.setLength(5);
        par.setLength(5);
        par.setLength(5);
        par.setLength(6);

        verify(par, times(1)).setLength(2);
        verify(par, times(3)).setLength(5);
        verify(par, times(1)).setLength(6);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setLength(2);
        inOrder.verify(par, times(3)).setLength(5);
        inOrder.verify(par).setLength(6);

        doThrow(NegativeLengthException.class).when(par).setLength(-2);
    }

    @Test
    public void setWidthTest() throws NegativeWidthException {
        Parallelogram par = mock(Parallelogram.class);
        par.setWidth(3);
        par.setWidth(4);
        par.setWidth(4);
        par.setWidth(4);
        par.setWidth(7);

        verify(par, times(1)).setWidth(3);
        verify(par, times(3)).setWidth(4);
        verify(par, times(1)).setWidth(7);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setWidth(3);
        inOrder.verify(par, times(3)).setWidth(4);
        inOrder.verify(par).setWidth(7);

        doThrow(NegativeWidthException.class).when(par).setWidth(-4);
    }

    @Test
    public void setAngle1Test() throws NegativeAngleException {
        Parallelogram par = mock(Parallelogram.class);
        par.setAngle1(7);
        par.setAngle1(9);
        par.setAngle1(9);
        par.setAngle1(9);
        par.setAngle1(11);

        verify(par, times(1)).setAngle1(7);
        verify(par, times(3)).setAngle1(9);
        verify(par, times(1)).setAngle1(11);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setAngle1(7);
        inOrder.verify(par, times(3)).setAngle1(9);
        inOrder.verify(par).setAngle1(11);

        doThrow(NegativeAngleException.class).when(par).setAngle1(-7);
    }

    @Test
    public void parallelepipedPerimeterTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.perimeter()).thenReturn(80.0);
        assertEquals(80.0, par.perimeter());
    }

    @Test
    public void parallelepipedSquareTest() throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.square()).thenReturn(1005.3754420378682);
        assertEquals(1005.3754420378682, par.square());
    }

    @Test
    public void parallelepipedVolumeTest() throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.volume()).thenReturn(370.4353347064138);
        assertEquals(370.4353347064138, par.volume());
    }

    @Test
    public void getHeightTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.getHeight()).thenReturn(10.0);
        assertEquals(10.0, par.getHeight());
    }

    @Test
    public void getAngle2Test(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.getAngle2()).thenReturn(0.5);
        assertEquals(0.5, par.getAngle2());
    }

    @Test
    public void getAngle3Test(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.getAngle3()).thenReturn(0.4);
        assertEquals(0.4, par.getAngle3());
    }

    @Test
    public void setHeightTest() throws NegativeHeightException {
        Parallelepiped par = mock(Parallelepiped.class);
        par.setHeight(7);
        par.setHeight(9);
        par.setHeight(9);
        par.setHeight(9);
        par.setHeight(11);

        verify(par, times(1)).setHeight(7);
        verify(par, times(3)).setHeight(9);
        verify(par, times(1)).setHeight(11);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setHeight(7);
        inOrder.verify(par, times(3)).setHeight(9);
        inOrder.verify(par).setHeight(11);

        doThrow(NegativeHeightException.class).when(par).setHeight(-4);
    }

    @Test
    public void setAngle2Test() throws NegativeAngleException {
        Parallelepiped par = mock(Parallelepiped.class);
        par.setAngle2(0.1);
        par.setAngle2(0.4);
        par.setAngle2(0.4);
        par.setAngle2(0.4);
        par.setAngle2(0.6);

        verify(par, times(1)).setAngle2(0.1);
        verify(par, times(3)).setAngle2(0.4);
        verify(par, times(1)).setAngle2(0.6);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setAngle2(0.1);
        inOrder.verify(par, times(3)).setAngle2(0.4);
        inOrder.verify(par).setAngle2(0.6);

        doThrow(NegativeAngleException.class).when(par).setAngle2(-2);
    }

    @Test
    public void setAngle3Test() throws NegativeAngleException {
        Parallelepiped par = mock(Parallelepiped.class);
        par.setAngle3(0.2);
        par.setAngle3(0.5);
        par.setAngle3(0.5);
        par.setAngle3(0.5);
        par.setAngle3(0.8);

        verify(par, times(1)).setAngle3(0.2);
        verify(par, times(3)).setAngle3(0.5);
        verify(par, times(1)).setAngle3(0.8);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setAngle3(0.2);
        inOrder.verify(par, times(3)).setAngle3(0.5);
        inOrder.verify(par).setAngle3(0.8);

        doThrow(NegativeAngleException.class).when(par).setAngle2(-1);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
