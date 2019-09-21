/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skserver;

import Presentation.Server;

/**
 *
 * @author Nguy Minh Trong
 */
public class SKServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Server().setVisible(true);
        });
    }
    
}
