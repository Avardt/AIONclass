package AIONclasses;

public class Balaurs extends Bohatyr {
    String devil;
    boolean monster_attack;
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
