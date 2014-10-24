package getmaxnumberwithcontroller;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class ListDao implements  IDao {
    List<Integer> mylist;
    public ListDao(List<Integer> mylist) {
        this.mylist=mylist;
    }
    public List<Integer> getNumbers() {
        //List<Integer> mylist = new ArrayList<>();
        return(mylist);
    }
    
}
