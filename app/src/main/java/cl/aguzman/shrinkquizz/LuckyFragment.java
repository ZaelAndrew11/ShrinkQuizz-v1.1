package cl.aguzman.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class LuckyFragment extends Fragment {


    public LuckyFragment(){
    }

    public  static LuckyFragment newInstance(){
        return new LuckyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox happyCb = (CheckBox) view.findViewById(R.id.happyCb);
        final CheckBox cbMood = (CheckBox) view.findViewById(R.id.moodCb);
        Button luckyBtn = (Button) view.findViewById(R.id.luckyBtn);

        happyCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cbMood.setChecked(isChecked);
            }
        });

        luckyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = cbMood.isChecked();
                Log.d("Answer", String.valueOf(answer));
            }
        });
    }
}
