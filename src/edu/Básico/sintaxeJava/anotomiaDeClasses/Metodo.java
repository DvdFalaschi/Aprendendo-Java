//Aprendendo sobre métodos

//https://web.dio.me/course/aprendendo-a-sintaxe-java/learning/cadad73e-4c94-4d13-a3b9-dad804bfe725?back=/track/orange-tech-backend&tab=undefined&moduleId=undefined


public class Metodo {

    public static void main(String[] args) throws Exception {

        String primeiroNome = "David";
        String segundoNome = "Falaschi";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.print(nomeCompleto);    
    }
       
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
            
}

