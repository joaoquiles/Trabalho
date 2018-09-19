/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1.tiposMonstros.tank;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao
 */
public class Tank extends Tanke{
    @Override
    public void atqBasico() {
        JOptionPane.showMessageDialog(null,""+this.atqBas);
    }

    @Override
    public void primeiraHabilidade() {
        JOptionPane.showMessageDialog(null,""+this.hab1);
    }

    @Override
    public void segundaHabilidade() {
        JOptionPane.showMessageDialog(null,""+this.hab2);
    }

    @Override
    public void passiva() {
        JOptionPane.showMessageDialog(null,""+this.pass);
    }
}
