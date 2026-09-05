package ExemploArray;

public class Main {
    public static void main(String[] args) {

        Cliente ct = new Cliente("Matheus", "123.999.888-41", "47988999666");
        ContaBancaria cb = new ContaBancaria(ct, "1254", 4684.0);
        ContaBancaria cb2 = new ContaBancaria(ct, "1685", 468478.5);


        for (int i = 0; i < ct.getContas().toArray().length; i++) {
            System.out.println(ct.getContas().get(i).getAgencia());
        }


    }
}
