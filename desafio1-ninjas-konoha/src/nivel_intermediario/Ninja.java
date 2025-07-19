package nivel2_intermediario;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private char nivelMissao;
    private String statusMissao;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String missao, char nivelMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelMissao = nivelMissao;
        verificarStatusMisssao();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMissao() {
        return missao;
    }

    public char getNivelMissao() {
        return nivelMissao;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public void setNivelMissao(char nivelMissao) {
        this.nivelMissao = nivelMissao;
    }

    public String verificarStatusMisssao(){
        if(idade>=15){
            statusMissao = "Concluída";
        }else{
            if(nivelMissao == 'C' || nivelMissao == 'D'){
                statusMissao = "Concluída";
            }else{
                statusMissao = "Não concluída";
            }
        }
        return statusMissao;
    }

    public void mostraDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível: " + nivelMissao);
        System.out.println("Status missão: " + statusMissao);
    }

    @Override
    public String toString() {
        return "Ninja: " + nome  +
                "\nIdade: " + idade +
                "\nMissão: '" + missao +
                "\nNível: " + nivelMissao +
                "\nStatus: " + statusMissao;
    }
}
