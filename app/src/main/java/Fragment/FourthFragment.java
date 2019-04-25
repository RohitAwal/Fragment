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
public class FourthFragment extends Fragment implements View.OnClickListener {


    private Button btnFTC;
    private EditText etTemperature;
    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        etTemperature =view.findViewById(R.id.etTemperature);
        btnFTC = view.findViewById(R.id.btnFTC);
        btnFTC.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float temperature = Integer.parseInt(etTemperature.getText().toString());
        float Cel =((temperature-32)*5)/9;
        Toast.makeText(getActivity(),"Temperature In celcius :" + Cel,Toast.LENGTH_SHORT).show();

    }


}
