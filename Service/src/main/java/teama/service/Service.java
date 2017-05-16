package teama.service;

import java.util.ArrayList;
import com.google.gson.Gson;
import static spark.Spark.*;

public class Service 
{
    final static ArrayList<Gate> gates = new ArrayList<>();
    private static int currentGateNumber = -1;
    
    public static void main(String[] args)
    {
        Gson gson = new Gson();
        
        gates.add(new Gate(28, 54.38200, 18.46196));
        gates.add(new Gate(26, 54.38170, 18.46315));
        gates.add(new Gate(24, 54.38142, 18.46431));
        gates.add(new Gate(22, 54.38113, 18.46548));
        
        // sets server's port
        port(8080);
             
        // GET for gates list
        get("/gates", (req, res) -> gson.toJson(new GateList(gates)));
        
        get("gates/selected", (req, res) -> {
            if(currentGateNumber != -1)
                return gson.toJson(new SelectedGateOkResponse(currentGateNumber));
            else
            {
                res.status(400);
                return gson.toJson(new ErrorResponse("Captain did not select a gate"));
            }
        });
        
        put("/service/gates/:gateNumber", (req, res) -> {
            String gateNumber = req.params(":gateNumber");
            int parsedGateNumber;
            try{
                parsedGateNumber = Integer.parseInt(gateNumber);
            }
            catch(NumberFormatException e){
                res.status(400);
                return gson.toJson(new ErrorResponse("Invalid Gate Number"));
            }
            if(!gates.stream().anyMatch(g -> g.getNumber() == parsedGateNumber)){
                res.status(400);
                return gson.toJson(new ErrorResponse("Invalid Gate Number"));
            }
            currentGateNumber = parsedGateNumber;
            res.status(200);
            return res;
        });
    }
}
