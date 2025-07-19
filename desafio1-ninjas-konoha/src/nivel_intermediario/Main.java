package nivel2_intermediario;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        Ninja sasuke = new Ninja();
        Ninja sakura = new Ninja();

        naruto.setNome("Naruto Uzumaki");
        sasuke.setNome("Sasuke Uchiha");
        sakura.setNome("Sakura Haruno");

        naruto.setIdade(14);
        sasuke.setIdade(16);
        sakura.setIdade(15);

        naruto.setMissao("Proteger a Vila da Folha");
        sasuke.setMissao("Investigar atividades da Akatsuki");
        sakura.setMissao("Prestar assistência médica aos aliados");

        naruto.setNivelMissao('B');
        sasuke.setNivelMissao('A');
        sakura.setNivelMissao('C');

        naruto.verificarStatusMisssao();
        sasuke.verificarStatusMisssao();
        sakura.verificarStatusMisssao();

        List<Ninja> listaNinjas = new ArrayList<>();
        listaNinjas.add(naruto);
        listaNinjas.add(sasuke);
        listaNinjas.add(sakura);

        for(Ninja ninja : listaNinjas){
            System.out.println("<-------------------------------------------------------------->");
            System.out.println(ninja);
        }
        System.out.println("<-------------------------------------------------------------->");
    }
}