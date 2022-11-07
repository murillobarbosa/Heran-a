package heranca;

import java.time.LocalDate;
import java.time.Month;

public class Heranca {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Paulo da Silva");
        p.setEmail("paulonn@gmail.com.br");
        p.setTelefone("(11) 4002-8922");
        p.cumprimentar();

        Pessoa p1 = new Pessoa();
        p1.setNome("Maria da Silva");
        p1.setEmail("mariadasilva@gmail.com.br");
        p1.setTelefone("(11) 944915589");
        p1.cumprimentar();
        
        Cliente c = new Cliente();
        c.setNome("Janaina Barbosa");
        c.setEmail("janainab@hotmail.com");
        c.setTelefone("(11) 94455-9966");
       c.setDataNascimento(LocalDate.of(2000, 5, 20));
        c.cumprimentar();

    }

}
