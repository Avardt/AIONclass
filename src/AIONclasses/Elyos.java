package AIONclasses;

public class Elyos extends Bohatyr {
    private String chief;
    private boolean day_attack;

    public void setChief(String new_chief){
        this.chief=new_chief;
    }
    public String getChief(){
        return this.chief;
    }

    public void setDay_attack(boolean new_day_attack){
        this.day_attack=new_day_attack;
    }
    public boolean getDay_attack(){
        return this.day_attack;
    }


    public Elyos(){
        super();
        this.chief="";
        this.day_attack=true;
    }
    public Elyos(String nick, String plec, String chief, boolean day_attack){
        super(nick, plec);
        this.chief=chief;
        this.day_attack=day_attack;

    }
    public void drukuj(){
        super.drukuj();
        //System.out.println("nick :" + nick);
        //System.out.println("plec :" + plec);
        System.out.println("chief :" + chief);
        System.out.println("day attack? :" + day_attack);

    }
}
