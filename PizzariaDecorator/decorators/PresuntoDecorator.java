/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

import interfaces.PizzaComponent;
import interfaces.PizzaDecorator;

/**
 *
 * @author jeanp
 */
public class PresuntoDecorator extends PizzaDecorator{
    
    public PresuntoDecorator(PizzaComponent ingredient){
        super(ingredient);
    }
    
    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Adicionando presunto");
    }
    
}

