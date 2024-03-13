package Strategy;

public class ArqueroDamage implements  SkillsStrategy {
    @Override
    public void damage(Player player) {
        System.out.println("Vida del " + player.getName() + " antes del ataque de Arquero : " + player.getHealth());
        player.setHealth(player.getHealth() - 45 );
        System.out.println("Arquero atacando ");
        System.out.println(player.getHealth() + " de vida del " + player.getName() + " despues del ataque de Arquero");
        System.out.println("Mantiene su distancia , avanza 0 MTS ");
    }
}
