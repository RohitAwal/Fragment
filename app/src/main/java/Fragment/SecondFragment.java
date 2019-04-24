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
public class SecondFragment extends Fragment implements View.OnClickListener {


    private Button btnAreaofCircle;
    private EditText etRadius;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        etRadius =view.findViewById(R.id.etRadius);
        btnAreaofCircle = view.findViewById(R.id.btnAreaOfCircle);
        btnAreaofCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
    float radius = Integer.parseInt(etRadius.getText().toString());
    float area =3.14f*radius *radius;
        Toast.makeText(getActivity(),"Area of Cirle :" + area,Toast.LENGTH_SHORT).show();

    }
}
