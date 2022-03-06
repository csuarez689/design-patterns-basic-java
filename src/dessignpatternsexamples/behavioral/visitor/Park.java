/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public class Park implements IGeoElement {

    private double x;
    private double y;
    private String address;
    private String name;
    private int numberOfTrees;
    private int numberOfBenches;

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numberOfTrees
     */
    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    /**
     * @param numberOfTrees the numberOfTrees to set
     */
    public void setNumberOfTrees(int numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }

    /**
     * @return the numberOfBenches
     */
    public int getNumberOfBenches() {
        return numberOfBenches;
    }

    /**
     * @param numberOfBenches the numberOfBenches to set
     */
    public void setNumberOfBenches(int numberOfBenches) {
        this.numberOfBenches = numberOfBenches;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.doForPark(this);
    }
}
