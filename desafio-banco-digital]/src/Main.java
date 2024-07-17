public class Main {
    public static void main(String[] args) throws Exception {
      Cliente natalia = new Cliente();
      natalia.setNome("Natalia");

      Conta cc = new ContaCorrente(natalia);
      Conta poupanca = new ContaPoupanca(natalia);

      cc.depositar(300);
      cc.transferir(100, poupanca);

      cc.imprimirextrato();
      poupanca.imprimirextrato();
    }
}
