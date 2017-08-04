package cl.aguzman.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;


public class MatchFragment extends Fragment {


    public MatchFragment() {
    }

    public static MatchFragment newInstance(){
        return new MatchFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final TextView userYears = (TextView) view.findViewById(R.id.userAge);
        final SeekBar userSeekbar = (SeekBar) view.findViewById(R.id.userSb);
        final TextView loverYears = (TextView) view.findViewById(R.id.loverAge);
        final SeekBar loverSeekBar = (SeekBar) view.findViewById(R.id.loverSb);
        Button answer = (Button) view.findViewById(R.id.sendAnswer);

        userSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                userYears.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        loverSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                loverYears.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user = userSeekbar.getProgress();
                int lover = loverSeekBar.getProgress();
            }
        });

    }
}
