
public class Main {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        String nomeNinja2 = "Sasuke Uchiha";
        String nomeNinja3 = "Sakura Haruno";

        int idadeNinja1 = 14;
        int idadeNinja2 = 16;
        int idadeNinja3 = 15;

        String missaoNinja1 = "Proteger a Vila da Folha";
        String missaoNinja2 = "Investigar atividades da Akatsuki";
        String missaoNinja3 = "Prestar assistência médica aos aliados";

        char nivelDificuldadeMissao1 = 'B';
        char nivelDificuldadeMissao2 = 'A';
        char nivelDificuldadeMissao3 = 'C';

        String statusMissao1;
        String statusMissao2;
        String statusMissao3;

        System.out.println("<-------------------------------------------------------------->");
        System.out.println("Ninja: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + missaoNinja1);
        System.out.println("Nível: " + nivelDificuldadeMissao1);
        if(idadeNinja1>=15){
            statusMissao1 = "Concluída";
        }else{
            if(nivelDificuldadeMissao1 == 'C' || nivelDificuldadeMissao1 == 'D'){
                statusMissao1 = "Concluída";
            }else{
                statusMissao1 = "Não concluída";
            }
        }
        System.out.println("Status: " + statusMissao1);

        System.out.println("<-------------------------------------------------------------->");
        System.out.println("Ninja: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + missaoNinja2);
        System.out.println("Nível: " + nivelDificuldadeMissao2);
        if(idadeNinja2>=15){
            statusMissao2 = "Concluída";
        }else{
            if(nivelDificuldadeMissao2 == 'C' || nivelDificuldadeMissao2 == 'D'){
                statusMissao2 = "Concluída";
            }else{
                statusMissao2 = "Não concluída";
            }
        }
        System.out.println("Status: " + statusMissao2);

        System.out.println("<-------------------------------------------------------------->");
        System.out.println("Ninja: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + missaoNinja3);
        System.out.println("Nível: " + nivelDificuldadeMissao3);
        if(idadeNinja3>=15){
            statusMissao3 = "Concluída";
        }else{
            if(nivelDificuldadeMissao3 == 'C' || nivelDificuldadeMissao3 == 'D'){
                statusMissao3 = "Concluída";
            }else{
                statusMissao3 = "Não concluída";
            }
        }
        System.out.println("Status: " + statusMissao3);
        System.out.println("<-------------------------------------------------------------->");
    }
}
