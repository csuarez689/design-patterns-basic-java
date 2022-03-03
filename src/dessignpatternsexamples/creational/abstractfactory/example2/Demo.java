package dessignpatternsexamples.creational.abstractfactory.example2;

/**
 *
 * @author Claudio
 */
public class Demo {

    private SquadronFactory factory;

    private IMage mage;
    private IArcher archer;
    private IWarrior warrior;

    public Demo(SquadronFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        SquadronFactory factory = new ElfSquadronFactory();
        Demo client = new Demo(factory);

        client.createSquadron(factory);
        client.createSquadron();

    }

    private void createSquadron(SquadronFactory factory) {
        this.mage = factory.createMage();
        this.archer = factory.createArcher();
        this.warrior = factory.createWarrior();
    }

    // With DI factory
    private void createSquadron() {
        this.mage = this.factory.createMage();
        this.archer = this.factory.createArcher();
        this.warrior = this.factory.createWarrior();
    }

    public void setFactory(SquadronFactory factory) {
        this.factory = factory;
    }

}
