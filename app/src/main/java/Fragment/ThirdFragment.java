package Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment implements View.OnClickListener {

    private EditText etPrincple,etRate,etTime;
    private Button btnInterest;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_third,container,false);

        etPrincple = view.findViewById(R.id.etPrincple);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);
        btnInterest =view.findViewById(R.id.btnInterest);
        btnInterest.setOnClickListener(this);
        return view;

    }
    @Override
    public void onClick(View v) {
        float P = Integer.parseInt(etPrincple.getText().toString());
        float R = Integer.parseInt(etRate.getText().toString());
        float T = Integer.parseInt(etTime.getText().toString());

        float SI = (P+T+R)/100;

        Toast.makeText(getActivity(), "Simple Interest is :" + SI,Toast.LENGTH_SHORT).show();
    }

}
