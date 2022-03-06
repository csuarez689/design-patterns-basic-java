/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.structural.composite;

import java.awt.Graphics;

/**
 *
 * @author Claudio
 */
public interface IShape {

    public int getX();

    public int getY();

    public int getWidth();

    public int getHeight();

    public void move(int x, int y);

    public Boolean isInsideBounds(int x, int y);

    public void select();

    public void unSelect();

    public Boolean isSelected();

    public void paint(Graphics graphics);
}
