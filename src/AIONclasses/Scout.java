package AIONclasses;

public class Scout extends Asmodians implements Abilities {
    @Override
    public int calculate_health(){
        int health=0;
        if(night_attack==true){
          health=health+3;
        }
       return health;
    }
    public int calculate_strength(){
        return 0;
    }
    public int calculate_inteligence(){
        return 0;
    }

    String dagger;
    public Scout(){
        super();
        this.dagger="";
    }
    public Scout(String dagger){
        this.dagger=dagger;
        this.setNick("Matt");
        this.setPlec("man");
        this.ruler="stalin";
        this.night_attack=true;
    }
    public Scout(String nick, String plec, String ruler, boolean night_attack, String dagger){
        super(nick,plec,ruler,night_attack);
        this.dagger=dagger;
    }

    public void drukuj(){
        super.drukuj();
        System.out.println("dagger: " + dagger);
        System.out.println("calculate health " + this.getNick()+ ": " + calculate_health());
    }

}
