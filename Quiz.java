/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.*;  // importando a biblioteca utilizada para interação com o usuario
public class Quiz {
                       
  
    public static void main(String[] args) {
        int pontos =0;         // declarando pontos iniciais do jogador
        String jogador;         
        jogador = JOptionPane.showInputDialog("Digite seu nickname: ");     // pedindo nome de jogador
        JOptionPane.showConfirmDialog(null, "Seja Bem Vindo(a) ao Quiz,  " +jogador + "!"); // mensagem de boas vindas
        String rodada;           
        rodada = JOptionPane.showInputDialog("Jogador: "+jogador+ "             Pontos obtidos: "+pontos+"\n"+       // exibe na tela de entrada o nome do jogador, os pontos obtidos e logo em seguida as perguntas
                "Qual foi o equipamento mais importante utilizado no Administrador de Álcool em Gel?\n\n"+
                "(A) - Motor de Passos\n"+
                "(B) - Led\n"+
                "(C) - Sensor Ultrassônico\n "+
                "(D) - Resistor");                  // fechando a estrutura da Pane
        if (("C".equals (rodada))) {
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê acertou," +jogador+"!");
            pontos += 200;
        }
        else {  // caso erre o jogo se fechará e terá que reiniciar tudo novamente
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê errou rsrs!");
            JOptionPane.showMessageDialog (null, "Sua pontuação atual: "+pontos);
            System.exit (0);                 
        }
        rodada = JOptionPane.showInputDialog("Jogador: "+jogador+ "             Pontos obtidos: "+pontos+"\n"+       // exibe na tela de entrada o nome do jogador, os pontos obtidos e logo em seguida as perguntas
                "Qual a importância desse projeto?\n\n"+
                "(A) - Economia de recursos, acessibilidade, segurança\n"+
                "(B) - Prevenção, inovação residencial\n"+
                "(C) - Combate ao Corona e os gafanhotos\n "+
                "(D) - Nenhuma das alternativas");                  // fechando a estrutura da Pane
        if (("A".equals (rodada))) {
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê acertou," +jogador+"!");
            pontos += 200;
        }
        else {  // caso erre o jogo se fechará e terá que reiniciar tudo novamente
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê errou rsrs!");
            JOptionPane.showMessageDialog (null, "Sua pontuação atual: "+pontos);
            System.exit (0);                 
        }
        
        rodada = JOptionPane.showInputDialog("Jogador: "+jogador+ "             Pontos obtidos: "+pontos+"\n"+       // exibe na tela de entrada o nome do jogador, os pontos obtidos e logo em seguida as perguntas
                "Qual a distância máxima permitida pelo sensor?\n\n"+
                "(A) - 1 metro\n"+
                "(B) - 15 centímetros\n"+
                "(C) - 20 centímetros\n "+
               " (D) - 2 metros");                  // fechando a estrutura da Pane
        if (("B".equals (rodada))) {
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê acertou," +jogador+"!");
            pontos += 200;
        }
        else {  // caso erre o jogo se fechará e terá que reiniciar tudo novamente
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê errou rsrs!");
            JOptionPane.showMessageDialog (null, "Sua pontuação atual: "+pontos);
            System.exit (0);                 
        }
                    
        rodada = JOptionPane.showInputDialog("Jogador: "+jogador+ "             Pontos obtidos: "+pontos+"\n"+       // exibe na tela de entrada o nome do jogador, os pontos obtidos e logo em seguida as perguntas
                "Como funciona o circuito?\n\n"+
                "(A) - Ao aproximar as mãos dentro do alcance do sensor o alcool é disparado\n"+
                "(B) - Apertando o sensor para borrifar o alcool\n"+
                "(C) - Pisando no botão que fica em baixo para o sensor ser ativado\n "+
               " (D) - Nenhuma das alternativas");                  // fechando a estrutura da Pane
        if (("A".equals (rodada))) {
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê acertou," +jogador+"!");
            pontos += 200;
        }
        else {  // caso erre o jogo se fechará e terá que reiniciar tudo novamente
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê errou rsrs!");
            JOptionPane.showMessageDialog (null, "Sua pontuação atual: "+pontos);
            System.exit (0);                 
        }  
            
        rodada = JOptionPane.showInputDialog("Jogador: "+jogador+ "             Pontos obtidos: "+pontos+"\n"+       // exibe na tela de entrada o nome do jogador, os pontos obtidos e logo em seguida as perguntas
                "Em quanto tempo foi desenvolvido este projeto?\n\n"+
                "(A) - 2 meses\n"+
                "(B) - 2 semanas\n"+
                "(C) - 1 semana\n "+
               " (D) - 1 mês");                  // fechando a estrutura da Pane
        if (("B".equals (rodada))) {
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê acertou," +jogador+"!");
            pontos += 200;
        }
        else {  // caso erre o jogo se fechará e terá que reiniciar tudo novamente
            JOptionPane.showMessageDialog (null, "Parabéns!!!!\nVocê errou rsrs!");
            JOptionPane.showMessageDialog (null, "Sua pontuação atual: "+pontos);
            System.exit (0);                 
        }
        JOptionPane.showMessageDialog (null, "Você concluiu o Quiz com o total de pontos: "+pontos);
    }
    
}
