package AIONclasses;

public class Warrior extends Asmodians implements Abilities {
    @Override
    public int calculate_strength(){
       int strength=0;
       if(night_attack==true){
           strength=strength+2;
       }
       if(ruler.equals("hitler")){
           strength=strength-2;
       }
       return strength;
    }
    public int calculate_inteligence(){
        return 0;
    }
    public int calculate_health(){
        return 0;
    }
    String sword;

    public Warrior(){
        super();
        this.sword="";
    }
    public Warrior(String sword){
        this.sword=sword;
        this.setNick("Dżon");
        this.setPlec("gender");
        this.ruler="hitler";
        this.night_attack=true;

    }
    public Warrior(String nick, String plec, String ruler, boolean night_attack, String sword){
        super(nick,plec,ruler,night_attack);
        this.sword=sword;
    }
    public void drukuj(){
        super.drukuj();
        System.out.println("sword :" + sword);
        System.out.println("calculate strength " + this.getNick() + ": " + calculate_strength());
    }

}
