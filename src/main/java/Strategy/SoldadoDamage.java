package Strategy;

public class SoldadoDamage implements SkillsStrategy  {
    @Override
    public void damage(Player player) {
        System.out.println("Vida del " + player.getName() + " antes del ataque de Soldado : " + player.getHealth());
        player.setHealth(player.getHealth() - 15 );
        System.out.println("Soldado atacando ");
        System.out.println(player.getHealth() + " de vida del " + player.getName() + " despues del ataque de Soldado");
        System.out.println("Avanza 5MTS mas cerca al " + player.getName());
    }
}
