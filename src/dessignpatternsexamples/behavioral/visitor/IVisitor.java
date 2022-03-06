/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public interface IVisitor {

    void doForIndustrialBuilding(IndustrialBuilding industrialBuilding);

    void doForPark(Park park);

    void doForPrivateBuilding(PrivateBuilding privateBuilding);

    void doForShoppingCenter(ShoppingCenter shoppingCenter);
}
