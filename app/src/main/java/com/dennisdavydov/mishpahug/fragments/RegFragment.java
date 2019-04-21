package com.dennisdavydov.mishpahug.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.util.Base64;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.dennisdavydov.mishpahug.R;
import com.dennisdavydov.mishpahug.singletons.SingletonFonts;

import java.nio.charset.StandardCharsets;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RegFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RegFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegFragment extends Fragment implements View.OnClickListener {

    ImageView avatarImage;
    TextInputLayout tilFirstName,tilLastName,tilEmail,tilPhone,tilPassword;
    EditText editFirstName,editLastName,editEmail,editPhone,editPassword;
    RadioButton familyRB,guestRB;
    Button regBtn;

    public static final String SHARED_PREFS = "shared_prefs";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String EMAIL = "email";
    public static final String PHONE = "phone";
    public static final String TOKEN = "token";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RegFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegFragment newInstance(String param1, String param2) {
        RegFragment fragment = new RegFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reg, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.regBtn){

            String firstName = editFirstName.getText().toString().trim();
            String lastName = editLastName.getText().toString().trim();
            String eMail = editEmail.getText().toString().trim();
            String phone = editPhone.getText().toString().trim();
            String password = editPassword.getText().toString().trim();

            if(firstName.isEmpty()){
                editFirstName.setError(getResources().getString(R.string.errFirstName));
                editFirstName.requestFocus();
                return;
            }
            if (lastName.isEmpty()){
                editLastName.setError(getResources().getString(R.string.errLastName));
                editLastName.requestFocus();
                return;
            }
            if (eMail.isEmpty()){
                editEmail.setError(getResources().getString(R.string.errEmail));
                editEmail.requestFocus();
                return;
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(eMail).matches()){
                editEmail.setError(getResources().getString(R.string.errValidationEmail));
                editEmail.requestFocus();
                return;
            }
            if (phone.isEmpty()){
                editPhone.setError(getResources().getString(R.string.errPhone));
                editPhone.requestFocus();
                return;
            }
            if (password.isEmpty()){
                editPassword.setError(getResources().getString(R.string.errPassword));
                editPassword.requestFocus();
                return;
            }
            if (password.length() < 6){
                editPassword.setError(getResources().getString(R.string.errValidationPassword));
                editPassword.requestFocus();
                return;
            }
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        tilFirstName = view.findViewById(R.id.tilFirstName);
        tilFirstName.setTypeface(SingletonFonts.getInstance(view.getContext()).getFont3());

        tilLastName = view.findViewById(R.id.tilLastName);
        tilLastName.setTypeface(SingletonFonts.getInstance(view.getContext()).getFont3());

        tilEmail = view.findViewById(R.id.tilEmail);
        tilEmail.setTypeface(SingletonFonts.getInstance(view.getContext()).getFont3());

        tilPhone = view.findViewById(R.id.tilPhone);
        tilPhone.setTypeface(SingletonFonts.getInstance(view.getContext()).getFont3());

        tilPassword = view.findViewById(R.id.tilPassword);
        tilPassword.setTypeface(SingletonFonts.getInstance(view.getContext()).getFont3());

        regBtn = view.findViewById(R.id.regBtn);
        regBtn.setOnClickListener(this);

        editFirstName = view.findViewById(R.id.editFirstName);
        editLastName = view.findViewById(R.id.editLastName);
        editEmail = view.findViewById(R.id.editEmail);
        editPhone = view.findViewById(R.id.editPhone);
        editPassword = view.findViewById(R.id.editPassword);

    }

    public void saveUserPrefs(){
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(SHARED_PREFS,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FIRST_NAME,editFirstName.getText().toString().trim());
        editor.putString(LAST_NAME,editLastName.getText().toString().trim());
        editor.putString(EMAIL,editEmail.getText().toString().trim());
        editor.putString(PHONE,editPhone.getText().toString().trim());
        editor.putString(TOKEN,encodeToken());
        editor.apply();

        Toast.makeText(getContext(),"Saved user prefs",Toast.LENGTH_SHORT).show();
    }

    private String encodeToken() {
            String token = editEmail.getText().toString().trim();
            token = token.concat(editPassword.getText().toString().trim());
            byte[] data = token.getBytes(StandardCharsets.UTF_8);
            String encodedToken = Base64.encodeToString(data, Base64.DEFAULT);
        return encodedToken;
    }
}
