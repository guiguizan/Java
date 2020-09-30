package Celular;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Mensagem> mensagens;

    public Contato(String nome) {
        this.nome = nome;
        this.mensagens = new ArrayList<Mensagem>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Mensagem> getMensagens(){
        return this.mensagens;
    }

    public void imprimirMensagens() {
        for(Mensagem msg: this.mensagens) {
            System.out.println(msg.getTexto());
        }
    }
}