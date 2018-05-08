package AIONclasses;

public class Engineer extends Balaurs implements Abilities{
    @Override

    public int calculate_strength(){
        int strength=0;
        if(this.getMonster_attack()==true){
            strength=strength+50;
        }
        return strength;
    }
    public int calculate_health(){
        return 0;
    }
    public int calculate_inteligence(){
        return 0;
    }

    private String cannon;

    public void setCannon(String new_cannon){
        this.cannon=new_cannon;
    }
    public String getCannon(){
        return this.cannon;
    }

    public Engineer(){
        super();
        this.cannon="";
    }
    public Engineer(String cannon){
        this.cannon=cannon;
        this.setNick("Kusofc");
        this.setPlec("inżynier");
        this.setDevil("Jan Szmit");
        this.setMonster_attack(true);
    }
    public Engineer(String nick, String plec, String devil, boolean monster_attack, String cannon){
        super(nick,plec,devil,monster_attack);
        this.cannon=cannon;
    }
    public void drukuj(){
        super.drukuj();
        System.out.println("cannon :" + cannon);
        System.out.println("calculate strength " + this.getNick() + ": " + calculate_strength());
    }
    public boolean equals(Engineer postac){
        boolean flaga=true;
        if(!this.getNick().equals(postac.getNick())){
            flaga=false;
            return flaga;
        }
        if(!this.getPlec().equals(postac.getPlec())){
            flaga=false;
            return flaga;
        }
        if(!this.getDevil().equals(postac.getDevil())){
            flaga=false;
            return flaga;
        }
        if(this.getMonster_attack()!=postac.getMonster_attack()){
            flaga=false;
            return flaga;
        }
        if(!this.getCannon().equals(postac.getCannon())){
            flaga=false;
            return flaga;
        }
        return flaga;
    }
}
