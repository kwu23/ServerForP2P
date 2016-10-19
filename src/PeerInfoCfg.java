import java.util.List;

/**
 * Created by kevinwu on 10/19/16.
 */
public class PeerInfoCfg {
    private List<Peer> listOfPeers;

    public PeerInfoCfg(List<Peer> listOfPeers){
        this.listOfPeers = listOfPeers;
    }

    public List<Peer> getPeers(){
        return listOfPeers;
    }
}
