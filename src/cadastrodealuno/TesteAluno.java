import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TesteAluno {

    public static void main(String[] args) {
        // Cria uma imagem para o aluno
        BufferedImage foto = null;
        try {
            foto = ImageIO.read(new File("foto_aluno.jpg"));
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }

        // Cria um objeto Aluno com as informações
        Aluno aluno1 = new Aluno("João da Silva", 12345, "A", foto);

        // Exibe as informações do aluno na tela
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Turma: " + aluno1.getTurma());
        System.out.println("Foto: " + aluno1.getFoto());
    }
}
