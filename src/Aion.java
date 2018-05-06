import AIONclasses.*;

public class Aion {
    public static void main (String args[]) {
        int x=6;
        int y=10;
      //  tablica_sorca_dwuwymiarowa(x,y);
        specyfikatorydostepu();
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
}
