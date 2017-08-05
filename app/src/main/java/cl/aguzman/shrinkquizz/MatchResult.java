package cl.aguzman.shrinkquizz;

public class MatchResult extends MatchAnswer {
    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    public  String resultCompatibility(){return compareAge(getUserAge(), getLoverAge());}
    private String compareAge(int userOld, int loverOld){
        userOld = getUserAge();
        loverOld = getLoverAge();
        if(userOld > loverOld){
            return "No son compatibles, eres muy viejo";
        }else if(loverOld > userOld){
            return  "No son compatibles, ella es demaciado mayor";
        }else{
            return "Son Campatibles";
        }
    }
}
