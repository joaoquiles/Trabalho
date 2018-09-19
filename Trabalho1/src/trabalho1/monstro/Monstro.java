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
    protected String nome;
    protected int atq;
    protected int def;
    protected int vida;
    protected int velo;
    protected String atqBas;
    protected String hab1;
    protected String hab2;
    protected String pass;
    
    public Monstro(){
    
    }
    public Monstro(int atq, int def, int velo, int vida){
        this.atq = atq;
        this.def = def;
        this.vida = vida;
        this.velo = velo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setAtqBas(String basico){
        this.atqBas = basico;
    }
    public String getAtqBas(){
        return this.atqBas;
    }
    public void SetHab1(String habi1){
        this.hab1 = habi1;
    }
    public String getHab1(){
        return this.hab1;
    }
    public void setHab2(String hab2){
        this.hab2 = hab2;
    }
    public String getHab2(){
        return this.hab2;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public String getPass(){
        return this.pass;
    }
    
    public void setAtq(int atq){
        this.atq = atq;
    }
    public int getAtq(){
        return this.atq;
    }
    public void setDef(int def){
        this.def = def;
    }
    public int getDef(){
        return this.def;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return this.vida;
    }
    public void setVelo(int velo){
        this.velo = velo;
    }
    public int getVelo(){
        return this.velo;
    }
    
    
   

    
    
}
