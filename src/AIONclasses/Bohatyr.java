package AIONclasses;

public class Bohatyr {
    private String nick;
    private String plec;

    public void setNick(String new_nick){
        this.nick=new_nick;
    }
    public String getNick(){
        return this.nick;
    }
    public void setPlec(String new_plec){
        this.plec=new_plec;
    }
    public String getPlec(){
        return this.plec;
    }

    public Bohatyr(){
        this.nick="";
        this.plec="";
    }
    public Bohatyr(String nick, String plec){
        this.nick=nick;
        this.plec=plec;

    }
    public void drukuj(){
        System.out.println("nick: " + nick);
        System.out.println("plec: " + plec);

    }
}
