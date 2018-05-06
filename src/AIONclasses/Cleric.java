package AIONclasses;

public class Cleric extends Elyos implements Abilities {
    @Override
    public int calculate_inteligence(){
        int inteligence=0;
        if(this.getDay_attack()==true){
            inteligence=inteligence+10;
        }
        if(this.getChief().equals("Ariel")){
            inteligence=inteligence+5;
        }
        return inteligence;
    }
    public int calculate_strength(){
        return 0;
    }
    public int calculate_health(){
        return 0;
    }

    private String mace;

    public void setMace(String new_mace){
        this.mace=new_mace;
    }
    public String getMace(){
        return this.mace;
    }


    public Cleric(){
        super();
        this.mace="";
    }
    public Cleric(String mace){
        this.mace=mace;
        this.setNick("Dżejms");
        this.setPlec("chinease");
        this.setChief("Czang gej szejk");
        this.setDay_attack(true);
    }
    public Cleric(String nick, String plec, String chief, boolean day_attack, String mace){
        super(nick,plec,chief,day_attack);
        this.mace=mace;
    }

    public void drukuj(){
        super.drukuj();
        System.out.println("mace :" + mace);
        System.out.println("calculate inteligence " + this.getNick() + ": " + calculate_inteligence());
    }
}
