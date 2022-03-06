/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public class PrivateBuilding implements IGeoElement {

    private double x;
    private double y;
    private String address;
    private int numberOfAppartments;

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
     * @return the numberOfAppartments
     */
    public int getNumberOfAppartments() {
        return numberOfAppartments;
    }

    /**
     * @param numberOfAppartments the numberOfAppartments to set
     */
    public void setNumberOfAppartments(int numberOfAppartments) {
        this.numberOfAppartments = numberOfAppartments;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.doForPrivateBuilding(this);
    }
}
