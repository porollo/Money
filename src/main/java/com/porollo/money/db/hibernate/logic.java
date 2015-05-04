package com.porollo.money.db.hibernate;

/**
 * Created by Dmitriy S. Porollo on 02.05.2015.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

public class logic {

    @Entity
    @Table(name="Electricity")

    public class Electricity {

        private Long id;
        private Date date;
        private Long count;

        public Electricity(){

            count = null;
        }



        }
    }