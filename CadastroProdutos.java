import java.util.Scanner;

class Produto {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidadeProdutos = scanner.nextInt();

        Produto[] produtos = new Produto[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            scanner.nextLine(); // Limpar o buffer do scanner

            Produto produto = new Produto();

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            produto.setNome(nome);

            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            produto.setValor(valor);

            produtos[i] = produto;
        }

        System.out.println("\nProdutos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor: " + produto.getValor());
            System.out.println();
        }

        scanner.close();
    }
    
}
