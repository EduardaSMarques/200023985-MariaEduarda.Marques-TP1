import java.util.Scanner;
import java.util.ArrayList;


public class TP1MariaEduardaMarques200023985 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList();
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		
		int opcao = 0;		 
		while(opcao != 7){	
		System.out.println("ESCOLHA UMA OPÇÃO ABAIXO");
		System.out.println("[1] Cadastro de novo cliente");
		System.out.println("[2] Busca por cliente");
		System.out.println("[3] Cadastro de novo produto");
		System.out.println("[4] Busca por produto");
		System.out.println("[5] Cadastro de venda");
		System.out.println("[6] Mostrar produtos em estoque");
		System.out.println("[7] Sair");
		System.out.println("Digite sua escolha:"); 
		opcao = ler.nextInt();
		
		 switch(opcao) {
		 case 1:
			 cadastrarCliente(cliente);
			 break;
			 
		 case 2:
			 buscarCliente(cliente);
			 break;
			 
		 case 3:
			 cadastrarProduto(produto);
			 break;
			 
		 case 4:
			 buscarProduto(produto);
			 break;
			 
		 case 5:
			 break;
			 
		 case 6:
			 break;
			 
		 case 7:
			 System.out.println("Saindo...");	 
			 break;
			 
			 default:
				 System.out.println("Operação inválida\n"); 
				 
		 	}
		
		} // final do while		
		System.out.println("Programa finalizado!!");		
	}	
	
	public static void cadastrarCliente(Cliente cliente) {
		ArrayList<Cliente> clientes = new ArrayList();
		Scanner ler = new Scanner(System.in);
		System.out.print("CADASTRO DE NOVO CLIENTE");
		System.out.print("\nDigite quantos clientes você vai cadastrar: \n");
		int A = ler.nextInt();
		ler.nextLine();
		for (int i = 0; i < A; i++) {
			System.out.println("Digite seu nome: ");
			String nome = ler.nextLine();
			cliente.setNome(nome);
			System.out.println("Digite seu endereço: ");
			String endereco = ler.nextLine();
			cliente.setEndereco(endereco);
			System.out.println("Digite seu telefone: ");
			String telefone = ler.nextLine();
			cliente.setTelefone(telefone);
			
			clientes.add(cliente);
			
					
		}	
	}
	
	public static void buscarCliente(Cliente cliente) {
		ArrayList<Cliente> clientes = new ArrayList();
		clientes.add(cliente);
		Scanner ler = new Scanner(System.in);
		System.out.print("BUSCA DE CLIENTE");
		System.out.print("\nDigite o nome do cliente:");
		String nome = ler.nextLine();
		for (int i = 0; i < clientes.size(); i++) {
			Cliente clienteTemp = clientes.get(i);
			if (nome.equals(clienteTemp.getNome())) {
				System.out.print("Cliente encontrado!!");
				System.out.print("\nNome: "+clienteTemp.getNome());
				System.out.print("\nEndereço: "+clienteTemp.getEndereco());
				System.out.println("\nTelefone: "+clienteTemp.getTelefone());
				
				System.out.println("\nDeseja alterar os dados? ");
				System.out.println("\n[1]SIM");
				System.out.println("[2]NÃO");
				System.out.println("\nDigite sua escolha:");
				int B = ler.nextInt();
				ler.nextLine();
				
				if(B == 1) {
					System.out.println("Digite o novo nome: ");
					String novoNome = ler.nextLine();
					System.out.print("Digite o novo endereço: ");
					String novoEndereco = ler.nextLine();
					System.out.print("Digite o novo telefone: ");
					String novoTelefone = ler.nextLine();
					ler.nextLine();
					
					Cliente u = clientes.get(i); 
					cliente.setNome(novoNome);
					cliente.setEndereco(novoEndereco);
					cliente.setTelefone(novoTelefone);
				}
				
			}else {
				System.out.println("Cliente não encontrado!");
			}
					
		}
			
	}
	
	public static void cadastrarProduto(Produto produto) {
		ArrayList<Produto> produtos = new ArrayList();
		Scanner ler = new Scanner(System.in);
		System.out.print("CADASTRO DE NOVO PRODUTO");
		System.out.print("\nDigite quantos produtos você vai cadastrar: \n");
		int A = ler.nextInt();
		ler.nextLine();
		for (int i = 0; i < A; i++) {
			System.out.println("Digite o nome do produto: ");
			String nomeProduto = ler.nextLine();
			produto.setNomeProduto(nomeProduto);
			System.out.println("Digite a descrição: ");
			String descricao = ler.nextLine();
			produto.setDescricao(descricao);
			System.out.println("Digite o valor: ");
			double valor = ler.nextDouble();
			produto.setValor(valor);
			System.out.println("Digite a porcentagem de lucro: ");
			double porcentagemLucro = ler.nextDouble();
			produto.setPorcentagemLucro(porcentagemLucro);
			System.out.println("Digite a quantidade de estoque: ");
			int quantidadeEstoque = ler.nextInt();
			produto.setQuantidadeEstoque(quantidadeEstoque);
			
			
			produtos.add(produto);
						
		}	
	}
	
	public static void buscarProduto(Produto produto) {
		ArrayList<Produto> produtos = new ArrayList();
		produtos.add(produto);
		Scanner ler = new Scanner(System.in);
		System.out.print("BUSCA DE PRODUTO");
		System.out.print("\nDigite o nome do produto:");
		String nome = ler.nextLine();
		for (int i = 0; i < produtos.size(); i++) {
			Produto produtoTemp = produtos.get(i);
			if (nome.equals(produtoTemp.getNomeProduto())) {
				System.out.println("\nProduto encontrado!!\n");
				System.out.println("Nome do produto: "+produtoTemp.getNomeProduto());
				System.out.println("Descrição: "+produtoTemp.getDescricao());
				System.out.println("Valor: "+produtoTemp.getValor());
				System.out.println("Porcentagem de lucro: "+produtoTemp. getPorcentagemLucro());
				System.out.println("Quantidade de estoque: "+produtoTemp.getQuantidadeEstoque());
				
				System.out.println("\nDeseja alterar os dados? ");
				System.out.println("\n[1]SIM");
				System.out.println("[2]NÃO");
				System.out.println("\nDigite sua escolha:");
				int B = ler.nextInt();
				ler.nextLine();
				
				if(B == 1) {
					System.out.println("Digite o novo nome do produto: ");
					String novoNomeProduto = ler.nextLine();
					System.out.print("Digite a nova descrição: ");
					String novaDescricao = ler.nextLine();
					System.out.print("Digite o novo valor: ");
					double novoValor = ler.nextDouble();
					System.out.println("Digite a nova porcentagem de Lucro: ");
					double novaPorcentagemLucro = ler.nextDouble();
					System.out.println("Digite a nova quantidade do Estoque: ");
					int novoQuantidadeEstoque = ler.nextInt();
					ler.nextLine();
					
					Produto u = produtos.get(i); 
					produto.setNomeProduto(novoNomeProduto);
					produto.setDescricao(novaDescricao);
					produto.setValor(novoValor);
					produto.setPorcentagemLucro(novaPorcentagemLucro);
					produto.setQuantidadeEstoque(novoQuantidadeEstoque);
				}
				
			}else {
				System.out.println("Produto não encontrado!\n");
			}
					
		}
			
	}
// Nas cases 5 e 6 deram error no código.	
	
	
}//final da classe principal




