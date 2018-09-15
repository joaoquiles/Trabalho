/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1.monstro;

import trabalho1.habilidades.Habilidades;

/**
 *
 * @author Joao
 */
public abstract class Monstro implements Habilidades{
    
    protected int atq;
    protected int def;
    protected int vida;
    protected int velo;
    
    public Monstro(){
        
    }
    
    public Monstro(int atq, int def, int vida, int velo){
        this.atq = atq;
        this.def = def;
        this.vida = vida;
        this.velo = velo;   
    }
    public void setAtq(int velo){
        this.velo = velo;
    }
    public int getVelo(){
        return this.velo;
    }
    
    
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
