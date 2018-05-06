package AIONclasses;

public class Sorcerer extends Elyos implements Abilities {
    @Override
    public int calculate_inteligence(){
        int inteligence=0;
        if(getDay_attack()==true){
            inteligence=inteligence+5;
        }
        if(getChief().equals("Mao")){
            inteligence=inteligence-1;
        }
        return inteligence;
    }
    public int calculate_strength(){
        return 0;
    }
    public int calculate_health(){
        return 0;
    }

    String spell_book;

    public Sorcerer(){
        super();
        this.spell_book="";
    }
    public Sorcerer(String spell_book){
        this.spell_book=spell_book;
        this.setNick("Dik");
        this.setPlec("woman");
        this.setChief("Mao");
        this.setDay_attack(true);
    }
    public Sorcerer(String nick, String plec, String chief, boolean day_attack, String spell_book){
        super(nick,plec,chief,day_attack);
        this.spell_book=spell_book;
    }
    public void drukuj(){
        super.drukuj();
        System.out.println("spell book: " + spell_book);
        System.out.println("calculate inteligence: " + this.getNick() + ": " + calculate_inteligence());
    }
}
