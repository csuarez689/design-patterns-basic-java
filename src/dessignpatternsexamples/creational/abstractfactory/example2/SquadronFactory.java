package dessignpatternsexamples.creational.abstractfactory.example2;

/**
 *
 * @author Claudio
 */
public abstract class SquadronFactory {

    public abstract IMage createMage();

    public abstract IArcher createArcher();

    public abstract IWarrior createWarrior();
}
