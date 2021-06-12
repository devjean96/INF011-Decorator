/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import interfaces.PizzaComponent;

/**
 *
 * @author jeanp
 */
public class PizzaBasica implements PizzaComponent {

    @Override
    public void preparar() {
        System.out.println("Preparando a massa + molho + queijo");
    }
    
}
