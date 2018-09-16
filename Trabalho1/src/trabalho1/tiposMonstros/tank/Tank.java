/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1.tiposMonstros.tank;

/**
 *
 * @author Joao
 */
public class Tank extends Tanke{
    @Override
    public void atqBasico() {
        System.out.println("Atq Basico");
    }

    @Override
    public void primeiraHabilidade() {
        System.out.println("Habilidade 1");
    }

    @Override
    public void segundaHabilidade() {
        System.out.println("Habilidade 2");
    }

    @Override
    public void passiva() {
        System.out.println("Passiva");
    }
}
