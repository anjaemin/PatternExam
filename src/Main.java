import exam.pattern.strategy.GameCharacter;
import exam.pattern.strategy.Knife;
import exam.pattern.strategy.Sword;

public class Main {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

    }
}
