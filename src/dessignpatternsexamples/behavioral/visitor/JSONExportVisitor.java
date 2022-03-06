/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public class JSONExportVisitor implements IExportVisitor {

    @Override
    public void doForIndustrialBuilding(IndustrialBuilding industrialBuilding) {
        System.out.println("JSON Export for Industrial Building");
    }

    @Override
    public void doForPark(Park park) {
        System.out.println("JSON Export for Industrial Park");
    }

    @Override
    public void doForPrivateBuilding(PrivateBuilding privateBuilding) {
        System.out.println("JSON Export for Private Building");
    }

    @Override
    public void doForShoppingCenter(ShoppingCenter shoppingCenter) {
        System.out.println("JSON Export for Shopping Center");
    }

}
