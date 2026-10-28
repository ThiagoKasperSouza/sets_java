package sets.br.com.aulas;

import java.util.LinkedHashSet;
import java.util.Set;

import sets.br.com.aulas.Aula;
import sets.br.com.aulas.users.User;

public class Exercicio2 implements Aula {
    @Override 
    public void exibir() {
        Set<User> users = new LinkedHashSet<>();
        users.add(new User(1,"Teste1"));
        users.add(new User(2,"Teste2"));
        users.add(new User(3,"Teste3"));
        users.add(new User(4,"Teste4"));

        System.out.println("Linked hashset: ");
        users.forEach(System.out::println);
    }
}
