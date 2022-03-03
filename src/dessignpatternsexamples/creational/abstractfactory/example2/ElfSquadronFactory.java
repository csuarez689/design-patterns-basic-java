package dessignpatternsexamples.creational.abstractfactory.example2;

/**
 *
 * @author Claudio
 */
public class ElfSquadronFactory extends SquadronFactory {

    @Override
    public IMage createMage() {
        return new ElfMage();
    }

    @Override
    public IArcher createArcher() {
        return new ElfArcher();
    }

    @Override
    public IWarrior createWarrior() {
        return new ElfWarrior();
    }

}
