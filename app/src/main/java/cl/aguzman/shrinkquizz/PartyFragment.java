package cl.aguzman.shrinkquizz;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PartyFragment extends Fragment {

    public PartyFragment() {
    }

    public static PartyFragment newInstance() {
        return new PartyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_party, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroupParty = (RadioGroup) view.findViewById(R.id.partyRg);
        Button btnParty = (Button) view.findViewById(R.id.partyBtn);

        btnParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioCheck = radioGroupParty.getCheckedRadioButtonId();

                if (radioCheck != -1) {
                    RadioButton radioButton = (RadioButton) radioGroupParty.findViewById(radioCheck);
                    String answer = radioButton.getText().toString();
                    showDialog(answer);

                } else {
                    Toast.makeText(getContext(), "Debes seleccionar una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showDialog(String answer) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Consejo:");
        alertDialog.setMessage(new PartyResult(answer).result());
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alertDialog.show();
    }
}
