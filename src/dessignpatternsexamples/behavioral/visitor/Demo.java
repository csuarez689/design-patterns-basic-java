/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        var industrialBuilding = new IndustrialBuilding();
        var park = new Park();
        var privateBuilding = new PrivateBuilding();
        var shoppingCenter = new ShoppingCenter();

        IExportVisitor visitor = new XMLExportVisitor();
        visitor.export(industrialBuilding, park, privateBuilding, shoppingCenter);
        System.out.println("##################################################");
        visitor = new JSONExportVisitor();
        visitor.export(industrialBuilding, park, privateBuilding, shoppingCenter);
        System.out.println("##################################################");

    }
}
