package cl.aguzman.shrinkquizz;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LuckyAnswer {
    private boolean userCheck;
    private boolean luckyDay;

    public LuckyAnswer(boolean userCheck) {
        this.userCheck = userCheck;
        luckyDay = new LuckyDate().getDate();
    }

    public boolean isUserCheck() {
        return userCheck;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private  class LuckyDate{
        private boolean getDate(){
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));
            Log.d("DAY", String.valueOf(day));
            if(day % 2 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
}

