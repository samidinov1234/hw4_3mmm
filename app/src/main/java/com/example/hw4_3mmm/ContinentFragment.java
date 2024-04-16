package com.example.hw4_3mmm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4_3mmm.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentContinentBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(list,this::onClick);
        binding.recyclerContinent.setAdapter(continentAdapter);

    }

    private void loadData() {
        list.add(new ContinentModel("https://vignette3.wikia.nocookie.net/thefutureofeuropes/images/d/db/Eurasia.png/revision/latest?cb=20150909165808","Eurasia"));
        list.add(new ContinentModel("https://avatars.mds.yandex.net/i?id=9a2a71fa8c3eeffe5acf4910d9122912daace3e1-10641531-images-thumbs&n=13","North America"));
        list.add(new ContinentModel("https://avatars.mds.yandex.net/i?id=9997fca15eb4da2b194795dbe54407ed6a08dce8-10869405-images-thumbs&n=13","South America"));
        list.add(new ContinentModel("https://avatars.mds.yandex.net/i?id=a1769e6b53a57d73798b1ef0e65e83b9298fbf73-9882580-images-thumbs&n=13","Africa"));
        list.add(new ContinentModel("https://img2.freepng.ru/20180325/owe/kisspng-mainland-australia-papua-new-guinea-antarctica-map-australia-5ab805edd084f7.9516531615220095818541.jpg","Australia"));
    }
    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("continentPosition", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,countryFragment).addToBackStack(null).commit();
    }
}