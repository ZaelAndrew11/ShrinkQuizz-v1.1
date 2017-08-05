package cl.aguzman.shrinkquizz;

public class LuckyResult extends LuckyAnswer {
    public LuckyResult(boolean userCheck) {
        super(userCheck);
    }

    public String result(){return  userLucky()+" "+userDayLucky();}

    private String userLucky(){
        boolean answerUser = isUserCheck();
        if(answerUser){
            return "Esas es la actitud!";
        }else{
            return "Anímate!";
        }
    }

    private String userDayLucky(){
        boolean answerDate = isLuckyDay();
        if(answerDate){
            return "y es tu día de suerte!";
        }else{
            return "vendrán mejores tiempos :)";
        }
    }
}
