package Strategy;

public class CaballeroDamage implements  SkillsStrategy {

    @Override
    public void damage(Player player) {
        System.out.println("Vida del " + player.getName() + " antes del ataque de Caballero : " + player.getHealth());
        player.setHealth(player.getHealth() - 20 );
        System.out.println("Caballero atacando ");
        System.out.println(player.getHealth() + " de vida del " + player.getName() + " despues del ataque de Caballero");
        System.out.println("Avanza 8MT mas cerca al " + player.getName());
    }
}
