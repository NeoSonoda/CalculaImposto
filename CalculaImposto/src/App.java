public class App {
    public static void main(String[] args) throws Exception {
        ImpostoRio impRio = new ImpostoRio();
        ImpostoSP impSP = new ImpostoSP();
        NotaFiscal nota = new NotaFiscal();
        String valor;
        String opcao;

        do {
            System.out.println("Digite o valor da nota fiscal:");
            valor = System.console().readLine().intern();
        } while (!valor.matches("[0-9]*"));

        do {
            System.out.println("Digite o opção relacionada a regiao de emissão da nota fiscal: \n 1 - São Paulo \n 2 - Rio de Janeiro");
            opcao = System.console().readLine().intern();
        } while (!opcao.matches("[1-2]"));
        
        if(opcao.intern()=="1")
            nota.valor = impSP.CalcularImposto(Double.parseDouble(valor.intern()));
        else
            nota.valor = impRio.CalcularImposto(Double.parseDouble(valor));
    }
}
