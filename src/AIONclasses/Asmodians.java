package AIONclasses;

public class Asmodians extends Bohatyr {
    String ruler;
    boolean night_attack;

    public Asmodians(){
        super();
        this.ruler="";
        this.night_attack=true;
    }
    public Asmodians(String nick, String plec, String ruler, boolean night_attack){
        super(nick, plec);
        this.ruler=ruler;
        this.night_attack=night_attack;

    }
    public void drukuj(){
        super.drukuj();
        //System.out.println("nick :" + nick);
        //System.out.println("plec :" + plec);
        System.out.println("ruler :" + ruler);
        System.out.println("night attack? :" + night_attack);

    }

}
