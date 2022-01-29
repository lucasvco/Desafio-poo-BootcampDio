import java.time.LocalDate;

public class Teste {
	public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdu��o � linguagem Java");
        curso1.setDescricao("Fundamentos Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Orienta��o a Objetos Java");
        curso2.setDescricao("Paradigma de orienta��o a objetos");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Ajuda aos iniciantes em Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("GFT Start #3 Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscrito:" + devLucas.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalExp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalExp());

    }
}
