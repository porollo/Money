package com.porollo.money.servlets.validation;

import javax.servlet.http.HttpServlet;

/**
 * Created by Dmitriy S. Porollo on 01.04.2015.
 */

public class CountValidation extends HttpServlet{

    int count;
    int old_couunt;

    public void getCount() {
        if (count <= old_couunt) {
            System.out.println("Error");
        }
        else
            System.out.println(count);
    }
}
