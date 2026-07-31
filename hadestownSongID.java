import java.util.Scanner;
public class hadestownSongID {
    
    public static int identifyHadestownSong(String hadestownSong) {

int hadestownTrackNumber = 0;

if (hadestownSong.equals("Wait for Me")) {
    hadestownTrackNumber = 18;
}

if (hadestownSong.equals("Road to Hell")) {
    hadestownTrackNumber = 1;
}

    return hadestownTrackNumber;
}
    public static void main(String[] args) {
Scanner keyboard = new Scanner (System.in);
System.out.println();
System.out.println("Type the exact name of the Hadestown song you wish to ID:");
String hadestownSong = keyboard.nextLine();

int hadestownSongNumber = identifyHadestownSong(hadestownSong);

System.out.println(hadestownSong + " is track #" + hadestownSongNumber);
    }
}
