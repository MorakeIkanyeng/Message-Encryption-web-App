/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entity.MiniProject;

/**
 *
 * @author morak
 */
@Stateless
public class MiniProjectFacade extends AbstractFacade<MiniProject> implements MiniProjectFacadeLocal {

    @PersistenceContext(unitName = "MiniProjectAEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MiniProjectFacade() {
        super(MiniProject.class);
    }

    @Override
    public MiniProject longestMessage() {
    String qs = "SELECT m FROM MiniProject m ORDER BY m.length DESC";
    Query q = em.createQuery(qs);
    MiniProject proj = (MiniProject) q.setMaxResults(1).getSingleResult(); // Get just the top result
    return proj;
    
}
    
}
