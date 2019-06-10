/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karnaugh_map_generation;

import java.awt.Color;

/**
 *
 * @author Molock
 */
public class KarnaughMapGenerator {
    
    
//  ATRIBUTTES:   ____________________________________________________________
    
    javax.swing.JPanel graphicPanel;    // UI panel wich represents the k-map
    
    private short   id,                 // local object identifier
                    nVariables;         // quantity of bit variables
    private boolean[] map;
    
    static short    baseIdGeneration = -1;  // global id generator
    
    static Color    oneAgrupation,  // to remark an agrupation of one numbers
                    zeroAgrupation, // to remark an agrupation of zero numbers
                    mapForeGroung,  // karnaugh maps titles and numbers color
                    mapBackGroung;  // karnaugh maps backgrund
            
}
