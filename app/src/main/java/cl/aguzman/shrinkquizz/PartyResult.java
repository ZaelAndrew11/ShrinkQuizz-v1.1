package cl.aguzman.shrinkquizz;

public class PartyResult extends PartyAnswer {

    public PartyResult(String useranswer) {
        super(useranswer);
    }

    public String result(){return processing();}

    private String processing(){
        String userAnswer = getUserAnswer();
        if(userAnswer.contains("5 Cervezas")){
            return "Eres una Gallina Mc Fly, Sigue Bebiendo.";
        }else if(userAnswer.contains("10 Cerverzas")){
            return "Dale, Campeón una más.";
        }else{
            return "Eres un enfermo, deja de beber.";
        }
    }
}
