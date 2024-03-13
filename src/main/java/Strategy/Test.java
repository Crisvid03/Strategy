package Strategy;

public class Test {
    public static void main(String[] args) {
        Player player = new Player("Imperio Peruano");
        Character character = new Character("Character 1");
        character.damage(player);
        System.out.println("_________________________");
        character.setSkillsStrategy(new ArqueroDamage());
        character.damage(player);
        System.out.println("_________________________");
        character.setSkillsStrategy(new CaballeroDamage());
        character.damage(player);
    }
}
