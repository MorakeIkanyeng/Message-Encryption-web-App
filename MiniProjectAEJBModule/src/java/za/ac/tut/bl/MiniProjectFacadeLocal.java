/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.MiniProject;

/**
 *
 * @author morak
 */
@Local
public interface MiniProjectFacadeLocal {

    void create(MiniProject miniProject);

    void edit(MiniProject miniProject);

    void remove(MiniProject miniProject);

    MiniProject find(Object id);

    List<MiniProject> findAll();

    List<MiniProject> findRange(int[] range);

    int count();
    
    MiniProject longestMessage();
    
}
