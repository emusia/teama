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
public class ErrorResponse {
    private String error;
    
    public ErrorResponse(String errorMessage)
    {
        this.error = errorMessage;
    }

    /**
     * @return the error
     */
    public String getError() {
        return error;
    }
}
