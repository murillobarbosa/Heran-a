package heranca;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    
    public Cliente(){
        // System.out.println("Criando um objeto cliente...");
        super.cumprimentar();
    }

    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
   
    @Override
     public void cumprimentar() {
        System.out.printf("Olá! eu sou %s, sou um cliente, tudo bem?\n",this.getNome());
    }
}
