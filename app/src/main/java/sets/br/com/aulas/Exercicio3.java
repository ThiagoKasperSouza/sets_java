package sets.br.com.aulas;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;

import sets.br.com.aulas.Aula;
import sets.br.com.aulas.users.User;

public class Exercicio3 implements Aula {
    @Override 
    public void exibir() {
        Set<User> users = new TreeSet<>();
        users.add(new User(1,"Teste1"));
        users.add(new User(2,"Teste2"));
        users.add(new User(3,"Teste3"));
        users.add(new User(4,"Teste4"));

        System.out.println("Treeset: ");
        // Usa comparable para verificações na estrutura
        users.forEach(System.out::println);

        Set<User> users2 = new TreeSet<>(Comparator.comparingInt(User::getId));
        users2.add(new User(1,"Teste1"));
        users2.add(new User(2,"Teste2"));
        users2.add(new User(3,"Teste3"));
        users2.add(new User(4,"Teste4"));

        System.out.println("Treeset com comparator: ");
        // Usa comparable para verificações na estrutura
        users2.forEach(System.out::println);
    }
}
