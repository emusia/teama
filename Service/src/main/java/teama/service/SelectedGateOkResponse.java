/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teama.service;

/**
 *
 * @author emkej
 */
public class SelectedGateOkResponse {
    private int gate;
    
    public SelectedGateOkResponse(int gate)
    {
        this.gate = gate;
    }

    /**
     * @return the gate
     */
    public int getGate() {
        return gate;
    }
}
