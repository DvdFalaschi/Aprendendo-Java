//Aprendendo sobre indentação

//https://web.dio.me/course/aprendendo-a-sintaxe-java/learning/c3bef9d2-6154-40ce-91da-a7b57520a61f?back=/track/orange-tech-backend&tab=undefined&moduleId=undefined


public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 10;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
