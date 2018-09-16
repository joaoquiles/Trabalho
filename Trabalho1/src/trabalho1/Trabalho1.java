/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabalho1.monstro.Monstro;
import trabalho1.tiposMonstros.nuker.Nuker;

/**
 *
 * @author Joao
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Monstro> colecao = new ArrayList<>();
        int opcao = -1;
        while(opcao != 0){
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será a classe do monstro"
                    +"\n1 - Nuker"
                    +"\n2 - Tank"
                    +"\n3 - Suporte"));
            if (opcao == 1){
                Monstro monstro = new Nuker();
                int atq = Integer.parseInt(JOptionPane.showInputDialog("Defina o Ataque do Monstro"));
                monstro.setAtq(atq);
                int def = Integer.parseInt(JOptionPane.showInputDialog("Defina a defesa do Monstro"));
                monstro.setDef(def);
                int vida = Integer.parseInt(JOptionPane.showInputDialog("Defina a vida do Monstro"));
                monstro.setVida(vida);
                int velo = Integer.parseInt(JOptionPane.showInputDialog("Defina a velocidade do Monstro"));
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
                colecao.add(monstro);
                for (Monstro monstros : colecao){
                   JOptionPane.showMessageDialog(null,"Nome: "+monstros.getNome()
                                                +"\nAtque: "+monstros.getAtq()
                                                + "\nDefesa: "+monstros.getDef()
                                                +"\nVida: "+monstros.getVida()
                                                +"\nVelocidade: "+monstros.getVelo()
                                                +"\nAtaque Basico: "+monstros.getAtqBas()
                                                +"\nHabilidade 1: "+monstros.getHab1()
                                                +"\nHabilidade 2: "+monstros.getHab2()
                                                +"\nPassiva: "+monstros.getPass());
                }
            }
            
        }
        
        
    }
    
}
