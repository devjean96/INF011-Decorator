/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author jeanp
 */
public abstract class PizzaDecorator implements PizzaComponent{
    
    private final PizzaComponent decorated;
    
    public PizzaDecorator(PizzaComponent ingredient){
        this.decorated = ingredient;
    }
    
    @Override
    public void preparar() {
        decorated.preparar();
    }
}
