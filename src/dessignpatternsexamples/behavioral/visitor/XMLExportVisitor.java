/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public class XMLExportVisitor implements IExportVisitor {

    @Override
    public void doForIndustrialBuilding(IndustrialBuilding industrialBuilding) {
        System.out.println("XML Export for Industrial Building");
    }

    @Override
    public void doForPark(Park park) {
        System.out.println("XML Export for Industrial Park");
    }

    @Override
    public void doForPrivateBuilding(PrivateBuilding privateBuilding) {
        System.out.println("XML Export for Private Building");
    }

    @Override
    public void doForShoppingCenter(ShoppingCenter shoppingCenter) {
        System.out.println("XML Export for Shopping Center");
    }

}
