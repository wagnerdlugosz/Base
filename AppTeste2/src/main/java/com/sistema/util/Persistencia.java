/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Wagner
 */
public class Persistencia {

    private static Persistencia instancia = new Persistencia();

    public static Persistencia getInstancia() {
        return instancia;
    }
    private EntityManagerFactory emf;

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public Persistencia() {
        emf = Persistence.createEntityManagerFactory("PU");
        //criarUsuarioPadrao();
    }

    public static void main(String args[]) {
        Persistencia.getInstancia();

    }

}

