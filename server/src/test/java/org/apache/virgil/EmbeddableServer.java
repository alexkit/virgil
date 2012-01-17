package org.apache.virgil;

import org.apache.virgil.ws.VirgilService;

public class EmbeddableServer implements Runnable {
    String[] args = null;
    
    public EmbeddableServer(String[] args){
        this.args = args;        
    }

    @Override
    public void run() {
        try {
            VirgilService.main(this.args);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
    }
}
