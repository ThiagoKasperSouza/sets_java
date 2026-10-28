package main.java.sets.br.com.aulas;

import java.util.HashSet;
import java.util.Set;

import main.java.sets.br.com.aulas.users.User;
import main.java.sets.br.com.aulas.Aula;

public class Exercicio1 implements Aula {
    @Override
    public void exibir() {
        Set<User> users = new HashSet<>();
        users.add(new User(1,"Teste1"));
        users.add(new User(2,"Teste2"));
        users.add(new User(3,"Teste3"));
        users.add(new User(4,"Teste4"));

        users.forEach(System.out::println);
    }
}
