/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tba;

import java.awt.Dimension;
import java.awt.Toolkit;
import tubes.tba.view.*;

/**
 *
 * @author Atta
 */
public class TubesTBA {
    public static void main(String[] args) {
        Main L = new Main();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        L.setLocation(dim.width/2-L.getSize().width/2, dim.height/2-L.getSize().height/2);
        L.setVisible(true);
    }
    
}
