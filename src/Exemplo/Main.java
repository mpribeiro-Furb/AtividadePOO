package Exemplo;

public class Main {
     static void main(String[] args) {

        Pessoa p = new Pessoa();
        Departamento dp = new Departamento();

        p.setNome("Pedro");
        p.setIdade(18);

        dp.setNome("Solutions");
        dp.setGerente(p);

        System.out.println(dp.getGerente().getNome());

    }
}
