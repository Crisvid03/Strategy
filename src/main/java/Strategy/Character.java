package Strategy;

public class Character {
    private String name;
    private SkillsStrategy damageStrategy;

    public Character (String name) {
         this.name = name;
         this.damageStrategy = new SoldadoDamage();
     }
    public void damage(Player player){
        damageStrategy.damage(player);
    }

    public String getName(){
         return name;
    }

    public void  setName(String name){
        this.name = name;
    }
    public SkillsStrategy getSkillsStrategy() {
        return damageStrategy;
    }

    public void setSkillsStrategy(SkillsStrategy damageStrategy) {
        this.damageStrategy = damageStrategy;
    }

}
