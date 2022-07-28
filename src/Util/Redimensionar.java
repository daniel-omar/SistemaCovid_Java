/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author omar_
 */
public class Redimensionar {
     
    public static void redimensionar(JDesktopPane desktopPane,JInternalFrame jInternalFrame) {
        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = jInternalFrame.getSize();
        jInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
}
