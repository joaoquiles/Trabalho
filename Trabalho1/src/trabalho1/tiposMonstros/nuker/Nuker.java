/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1.tiposMonstros.nuker;

import javax.swing.JOptionPane;
import trabalho1.habilidades.Habilidades;

/**
 *
 * @author Joao
 */
public class Nuker extends Nuke implements Habilidades{
    
    
    
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
