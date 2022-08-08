package Main;


import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;
import java.time.LocalDate;


/**
 *
 * @author Joao Paulo
 */
public class Main {
    public static void main(String[] args) {
        Curso course1 = new Curso ();
        course1.setTitulo("Curso Java");
        course1.setDescricao("Descrição curso java");
        course1.setCargaHoraria(8);
        
        Curso course2 = new Curso();
        course2.setTitulo("Curso Javascript");
        course2.setDescricao("Descrição curso java");
        course2.setCargaHoraria(3);
        
        Mentoria mento = new Mentoria ();
        mento.setTitulo("Mentoria do java");
        mento.setDescricao("Descriçao da mentoria");
        mento.setData(LocalDate.now());
        
        
        Bootcamp boot = new Bootcamp();
        boot.setNome("Bootcamp Java Developper");
        boot.setDescricao("Descrição do bootcamp Java");
        boot.getConteudos().add(course1);
        boot.getConteudos().add(course2);
        boot.getConteudos().add(mento);
        
        Dev devJoao = new Dev();
        
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(boot);
        
        Dev devMaria = new Dev();
        
        devMaria.setNome("Maria das graças");
        devMaria.inscreverBootcamp(boot);
        
        
        System.out.println("Conteúdos Inscritos João " 
                + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Concluidos João" 
                + devJoao.getConteudosConcluidos());
        
        System.out.println("Conteudos inscritos de Maria" 
                + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos concluidos de Maria" 
                + devMaria.getConteudosConcluidos());
        
   
    }
    
 }
