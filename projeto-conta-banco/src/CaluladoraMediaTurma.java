import java.util.Scanner;

public class CaluladoraMediaTurma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"Pedro", "Tiago", "joao", "Tobias" };

        double media = calculadoraMediaTurma(alunos , scan);

        System.out.println("A media da turma é %d " + media);
    }

    public static double calculadoraMediaTurma (String[] alunos , Scanner scanner ) {
        double soma = 0;
        for (String aluno : alunos){
            System.out.println("Nota do aluno: " + aluno );
            int nota = scanner.nextInt();

            soma += nota;
        }

        return soma / alunos.length;
    }
}
