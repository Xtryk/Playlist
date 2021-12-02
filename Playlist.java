import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {

    ArrayList <String> desertIslandPlaylist = new ArrayList <String> ();

    desertIslandPlaylist.add("Ooops");
    desertIslandPlaylist.add("I did it");
    desertIslandPlaylist.add("Again");
    desertIslandPlaylist.add("Rafonix");
    desertIslandPlaylist.add("Pyszne bułeczki");
    desertIslandPlaylist.add("\nKrakersy spod lady");
    desertIslandPlaylist.add("Pula");
    desertIslandPlaylist.add("znieczula");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Ooops");
    desertIslandPlaylist.remove("I did it");
    desertIslandPlaylist.remove("Again");

    System.out.println(desertIslandPlaylist.size());

    String a = desertIslandPlaylist.get(0);
    String b = desertIslandPlaylist.get(1);
    /*
    System.out.println(a);
    System.out.println(b);
    */

    desertIslandPlaylist.set(0, b);
    desertIslandPlaylist.set(1, a);

    System.out.println(desertIslandPlaylist.indexOf("Rafonix"));
    System.out.println(desertIslandPlaylist.indexOf("Pula"));

  }
  
}
