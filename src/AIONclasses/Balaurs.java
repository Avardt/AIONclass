package AIONclasses;

public class Balaurs extends Bohatyr {
    private String devil;
    private boolean monster_attack;

    public void setDevil(String new_devil){
        this.devil=new_devil;
    }
    public String getDevil(){
        return this.devil;
    }

    public void setMonster_attack(boolean new_monster_attack){
        this.monster_attack=new_monster_attack;
    }
    public boolean getMonster_attack(){
        return this.monster_attack;
    }

    public Balaurs(){
        super();
        this.devil="";
        this.monster_attack=true;
    }
    public Balaurs(String nick, String plec, String devil, boolean monster_attack){
        super(nick,plec);
        this.devil=devil;
        this.monster_attack=monster_attack;

    }
    public void drukuj(){
        super.drukuj();
        //System.out.println("nick :" + nick);
        //System.out.println("plec :" + plec);
        System.out.println("devil :" + devil);
        System.out.println("monster attack? :" + monster_attack);

    }

}
