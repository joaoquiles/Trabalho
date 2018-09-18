/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabalho1.excecoes.AtqInvalido;
import trabalho1.excecoes.DefInvalida;
import trabalho1.excecoes.VeloInvalido;
import trabalho1.excecoes.VidaInvalida;
import trabalho1.monstro.Monstro;
import trabalho1.tiposMonstros.nuker.Nuker;
import trabalho1.tiposMonstros.suporte.Suporte;
import trabalho1.tiposMonstros.tank.Tank;

/**
 *
 * @author Joao
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabalho1 metodo = new Trabalho1();
        ArrayList<Monstro> colecao = new ArrayList<>();
        int opcao = -1;
        while(opcao != 0){
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será a classe do monstro"
                    +"\n1 - Nuker"
                    +"\n2 - Tank"
                    +"\n3 - Suporte"));
            switch (opcao) {
                case 1:
                    colecao.add(metodo.criandoNuker());
                    break;
                case 2:
                    colecao.add(metodo.criandoTank());
                    break;
                case 3:
                    colecao.add(metodo.criandoSuporte());
                    break;
                default:
                    break;
            }
            
        }
        
        
        
    }
    
    private Monstro criandoNuker(){
        Monstro monstro;
        monstro = new Nuker();
        int atq = Integer.parseInt(JOptionPane.showInputDialog("Defina o Ataque do Monstro"));
                try{
                    if (atq < 1000 || atq>1300){
                        
                        throw new AtqInvalido();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    atq = Integer.parseInt(JOptionPane.showInputDialog("Defina um valor entre 1000 e 1300"));
                }
                monstro.setAtq(atq);
                int def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa do Monstro"));
                try{
                    if (def < 300 || def>500){
                        
                        throw new DefInvalida();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa entre 300 e 500:"));
                }
                monstro.setDef(def);
                int vida = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida do Monstro"));
                try{
                    if (vida < 8000 || vida>10000){
                        
                        throw new VidaInvalida();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida entre 8000 e 10000:"));
                }
                monstro.setVida(vida);
                int velo = Integer.parseInt(JOptionPane.showInputDialog("Defina a velocidade do Monstro"));
                try{
                    if (velo < 125 || velo>200){
                        
                        throw new VeloInvalido();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida entre 125 e 200:"));
                }
                monstro.setVelo(velo);
        String nome = JOptionPane.showInputDialog("Defina o nome do monstro:");
        monstro.setNome(nome);
        String atqBas = JOptionPane.showInputDialog("Defina o ataque basico do Monstro");
        monstro.setAtqBas(atqBas);
        String hab1 = JOptionPane.showInputDialog("Defina a habilidade 1 do Monstro:");
        monstro.SetHab1(hab1);
        String hab2 = JOptionPane.showInputDialog("Defina a habilidade 2 do Monstro:");
        monstro.setHab2(hab2);
        String pass = JOptionPane.showInputDialog("Defina a passiva do Monstro");
        monstro.setPass(pass);
        return monstro;
    }
    
    private Monstro criandoTank(){
        Monstro monstro = new Tank();
                int atq = Integer.parseInt(JOptionPane.showInputDialog("Defina o Ataque do Monstro"));
                try{
                    if (atq < 500 || atq>700){
                        
                        throw new AtqInvalido();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    atq = Integer.parseInt(JOptionPane.showInputDialog("Defina um valor entre 500 e 700"));
                }
                monstro.setAtq(atq);
                int def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa do Monstro"));
                try{
                    if (def < 700 || def>1000){
                        
                        throw new DefInvalida();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa entre 400 e 700:"));
                }
                monstro.setDef(def);
                int vida = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida do Monstro"));
                try{
                    if (vida < 10000 || vida>15000){
                        
                        throw new VidaInvalida();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida entre 8000 e 12000:"));
                }
                monstro.setVida(vida);
                int velo = Integer.parseInt(JOptionPane.showInputDialog("Defina a velocidade do Monstro"));
                try{
                    if (velo < 100 || velo>200){
                        
                        throw new VeloInvalido();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida entre 100 e 200:"));
                }
                monstro.setVelo(velo);
                String nome = JOptionPane.showInputDialog("Defina o nome do monstro:");
                monstro.setNome(nome);
                String atqBas = JOptionPane.showInputDialog("Defina o ataque basico do Monstro");
                monstro.setAtqBas(atqBas);
                String hab1 = JOptionPane.showInputDialog("Defina a habilidade 1 do Monstro:");
                monstro.SetHab1(hab1);
                String hab2 = JOptionPane.showInputDialog("Defina a habilidade 2 do Monstro:");
                monstro.setHab2(hab2);
                String pass = JOptionPane.showInputDialog("Defina a passiva do Monstro");
                monstro.setPass(pass);
                return monstro;
    }
    
    private Monstro criandoSuporte(){
        Monstro monstro = new Suporte();
                int atq = Integer.parseInt(JOptionPane.showInputDialog("Defina o Ataque do Monstro"));
                try{
                    if (atq < 600 || atq>1000){
                        
                        throw new AtqInvalido();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    atq = Integer.parseInt(JOptionPane.showInputDialog("Defina um valor entre 600 e 1000"));
                }
                monstro.setAtq(atq);
                int def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa do Monstro"));
                try{
                    if (def < 400 || def>700){
                        
                        throw new DefInvalida();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa entre 400 e 700:"));
                }
                monstro.setDef(def);
                int vida = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida do Monstro"));
                try{
                    if (vida < 8000 || vida>12000){
                        
                        throw new VidaInvalida();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida entre 8000 e 12000:"));
                }
                monstro.setVida(vida);
                int velo = Integer.parseInt(JOptionPane.showInputDialog("Defina a velocidade do Monstro"));
                try{
                    if (velo < 100 || velo>200){
                        
                        throw new VeloInvalido();
                    }
                
                }catch(AtqInvalido erro){
                    JOptionPane.showMessageDialog(null, "Valor inapropriado");
                    def = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida entre 100 e 200:"));
                }
                monstro.setVelo(velo);
                String nome = JOptionPane.showInputDialog("Defina o nome do monstro:");
                monstro.setNome(nome);
                String atqBas = JOptionPane.showInputDialog("Defina o ataque basico do Monstro");
                monstro.setAtqBas(atqBas);
                String hab1 = JOptionPane.showInputDialog("Defina a habilidade 1 do Monstro:");
                monstro.SetHab1(hab1);
                String hab2 = JOptionPane.showInputDialog("Defina a habilidade 2 do Monstro:");
                monstro.setHab2(hab2);
                String pass = JOptionPane.showInputDialog("Defina a passiva do Monstro");
                monstro.setPass(pass);
                return monstro;
    }
}
