import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {

    private String nome;
    private int numero;
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas(){
        for (Conta conta :
                contas) {
            System.out.println("Listagem do banco: " + this.nome + " - " + this.numero) ;
            conta.imprimirInfo();
        }
        
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
