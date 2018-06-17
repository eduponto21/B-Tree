
import utfpr.dainf.ct.ed.exemplo.ArvoreB;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Teste de implementação de árvore B.
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @author Eduardo Darrazão <darrazao@alunos.utfpr.edu.br>
 */
public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.testaArvoreB();
    }
    
    private void testaArvoreB() {
        System.out.println("TESTE DE ARVORE B");
        
        ArvoreB<Integer> a = new ArvoreB<>(3);
        a.insere(30);
        a.insere(70);
        a.insere(50);
        a.insere(10);
        a.insere(90);
        a.insere(40);
        a.insere(95);
        a.insere(20);
        a.insere(60);
        a.insere(45);
        a.insere(80);
        a.insere(25);
        a.insere(75);
        System.out.println("Árvore B(a): " + a);
        
        System.out.println(a.busca(50).toString());
        System.out.println(a.busca(25).toString());
        System.out.println(a.busca(40).toString());
        System.out.println(a.busca(70).toString());
        
        // H,M,C,W,R,K,Y,F,P,L,T,G,S,A,B,N,O,D,Q
        ArvoreB<Character> b = new ArvoreB<>(2);
        b.insere('H');
        b.insere('M');
        b.insere('C');
        b.insere('W');
        b.insere('R');
        b.insere('K');
        b.insere('Y');
        b.insere('F');
        b.insere('P');
        System.out.println("aaa\n");
        b.insere('L');
        System.out.println("Árvore B(b): " + b);
        System.out.println("bbb\n");
        b.insere('T');
        System.out.println("bbb\n");
        b.insere('G');
        b.insere('S');
        b.insere('A');
        b.insere('B');
        b.insere('N');
        b.insere('O');
        b.insere('D');
        b.insere('Q');
        System.err.println("Árvore B(b): " + b);
    }
}
