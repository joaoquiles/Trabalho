/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1.tiposMonstros.tank;

import trabalho1.monstro.Monstro;

/**
 *
 * @author Joao
 */
public abstract class Tanke extends Monstro{
    
    
    @Override
    public void atqBasico() {
        System.out.println(""+this.atqBas);
    }

    @Override
    public void primeiraHabilidade() {
        System.out.println(""+this.hab1);
    }

    @Override
    public void segundaHabilidade() {
        System.out.println(""+this.hab2);
    }

    @Override
    public void passiva() {
        System.out.println(""+this.pass);
    }
}
