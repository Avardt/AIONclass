import AIONclasses.*;

public class Aion {
    public static void main (String args[]) {
        int x=6;
        int y=10;
      //  tablica_sorca_dwuwymiarowa(x,y);
        //specyfikatorydostepu();
        //specyfikatordostepudlaengineera();
        demonstracjijakdzialaequals();
    }
    public static void tablica_sorca_dwuwymiarowa(int x, int y){
        Sorcerer tablica2D[][] = new Sorcerer [x][];
        for(int i=0;i<x;i++){
            tablica2D[i]=new Sorcerer [y];
        }
        for(int i=0;i<tablica2D.length;i++){
            for(int j=0;j<tablica2D[i].length;j++)
                tablica2D[i][j]=new Sorcerer("Koran");
        }
        for(int i=0;i<tablica2D.length;i++){
            for(int j=0;j<tablica2D[i].length;j++)
                tablica2D[i][j].drukuj();
        }
    }
    public static void specyfikatorydostepu(){
        Cleric postac1 = new Cleric ("buzdygan");
        postac1.setMace("młotek");
        System.out.println("mace: " + postac1.getMace());
    }

    public static void specyfikatordostepudlaengineera(){
        Engineer postac2 = new Engineer("kolumbryna");
        postac2.setCannon("falkonet");
       // System.out.println("cannon: " + postac2.getCannon());
        postac2.drukuj();
    }
    public static void demonstracjijakdzialaequals(){
        Engineer postac1 = new Engineer("Kósofc", "inżynier", "Jan Szmit", true, "falkonet");
        Engineer postac2 = new Engineer("Kósofc", "inżynier", "Jan Szmit", true, "falkonet");
        Engineer postac3 = new Engineer("Kósofc", "inżynier", "Jan Hus", false, "falkonet");


        System.out.println("Czy postac1 i postac2 som równe?: "+ postac1.equals(postac2));
        System.out.println("Czy postac1 i postac3 som równe?: "+ postac1.equals(postac3));
    }


}
