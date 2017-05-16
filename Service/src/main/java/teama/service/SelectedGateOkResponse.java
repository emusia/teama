package teama.service;

/**
 * Class for GET selected JSON response
 * @author MarcinPultyn
 */
public class SelectedGateOkResponse {
    public SelectedGateOkResponse(int gate) {
        this.gate = gate;
    }

    public int getGate() {
        return gate;
    }
    
    private final int gate;
}
