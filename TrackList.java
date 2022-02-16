import java.util.HashMap;
import java.util.Set;


public class TrackList{
    public static void main (String args[]){
        HashMap<String,String> track = new HashMap<String,String>();
        track.put("the evil that men do", "Love is a razor And I walked the line on that silver blade");
        track.put("Hunting High And Low", "I feel the wind in my hair And it's whispering, telling me things");
        track.put("Boulevard of Broken Dreams","I walk a lonely road The only one that I have ever known");
        track.put("La leyenda del hada y el mago","Cuenta la historia de un mago Que un día en su bosque encantado lloró");

        System.out.println( track.get( "the evil that men do" ) );
        
        Set<String> Keys = track.keySet();

        for( String llave : Keys ){
            System.out.println( llave );
            System.out.println( track.get( llave ) );
        }
    }
}