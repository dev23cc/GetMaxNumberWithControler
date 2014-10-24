/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmaxnumberwithcontroller;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class GetMaxNumberWithController {

    IDao dao;
    public GetMaxNumberWithController(IDao dao) {
        this.dao =  dao;
    }
    
    /**
     * @param args the command line arguments
     */
    public int getMaxNumber() {
        
         List<Integer> number = dao.getNumbers();
         return(Collections.max(number));        
    }
    
}
