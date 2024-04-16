package com.example.hw4_3mmm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4_3mmm.databinding.FragmentContinentBinding;
import com.example.hw4_3mmm.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<CountryModel> countryModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int position = getArguments().getInt("continentPosition");
        checkPosition(position);
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.recyclerCountry.setAdapter(countryAdapter);
    }

    private void checkPosition(int position) {
       switch (position){
           case 0:
               loadEurasia();
            break;
           case 1:
               loadNorthAmerica();
               break;
           case 2:
               loadSouthAmerica();
               break;
           case 3:
               loadAfrica();
               break;
           case 4:
               loadAustralia();
               break;
        }
    }

    private void loadAustralia() {
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=162ef65acef1dd493e09fbc9cb735510d5616775-10995265-images-thumbs&n=13","New South Wales"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=82213cd90525116d6e169f7dd7c54a844101c770-12569903-images-thumbs&n=13","Queensland"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=537cd4b5f8bd13574e598f7fd33342f02cd86adb-10640295-images-thumbs&n=13","South Australia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=96f349cf4f1b2ea1c4ede136d35e0505-3996309-images-thumbs&n=13","Tasmania"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=03ac37f83c67bdba2632349e8bfcb9e1997bd4d9-10697115-images-thumbs&n=13","Victoria"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=e202907aafe3c2502a676c41c5526a075a2d356a-9197564-images-thumbs&n=13","Western Australia"));
    }

    private void loadAfrica() {
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=63f2ad9378ce6ae1dd408055b74e486645a8c98b-12714815-images-thumbs&n=13","Algeria"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=43812b7346019bce7c303b21598f65180d6a8509-8211098-images-thumbs&n=13","Ambazonia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=2bfb8f1696dbafc067508ebbd612782152c69156-9230514-images-thumbs&n=13","Angola"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=80d824de7ad03d9e25c79eb82e0495098073fc50-10700023-images-thumbs&n=13","Benin"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=d0356e8686f5137ffb449af399066b1a521085af-11404303-images-thumbs&n=13","Botswana"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=3bd968d7794456ba98e4abb210afd14a22ed26d5-9233247-images-thumbs&n=13","Burkina Faso"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=a9adeaf2c6fb1ad75b3c51a314c2bf0230ad286a-12371956-images-thumbs&n=13","Burundi"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=a35782c65d775d00041f6842bed82ea7412a1973-8497133-images-thumbs&n=13","Gabon"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=e1c8a2b00f039903cad533295b46af2be21e8992-10071204-images-thumbs&n=13","Gambia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=379489267cac4789ebcae622fe4bde6622ccd31a-12497179-images-thumbs&n=13","Ghana"));
    }

    private void loadSouthAmerica() {
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=88a78320e701aa83c1c84ce007c82a0680098b95-10878270-images-thumbs&n=13","Argentina"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=5100bc9cbb6018c0a4023262cf412ab344684317-5348153-images-thumbs&n=13","Bolivia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=7637453c7bd2307ed44c1ece8eb82b22ae13b2a8-12422218-images-thumbs&n=13","Brazil"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=c374f59e499297df30b471d1e5759dbb71e2d401-12528217-images-thumbs&n=13","Venezuela"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=b05f50d4849aba8f570a2302165579ca3386ed33-5345995-images-thumbs&n=13","Guyana"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=7adb9637374eb865c1f250df086fd70db8bfd5b4-12472308-images-thumbs&n=13","French Guiana"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=5d87ca95215489d208ca248bce5b737a7c44feb5-11270391-images-thumbs&n=13","Colombia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=6a13351df8127e70b0eca4002f6a06403b171245-10491961-images-thumbs&n=13","Paraguay"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=2155b9baa9ad2b806dde205c18e97b15c33e081a-10836596-images-thumbs&n=13","Peru"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=b250df530e492432ffe72cc69b4d3eb4f6b7cd4a-10597937-images-thumbs&n=13","Uruguay"));
    }

    private void loadNorthAmerica() {
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=22b9b8b8dcb8ce97d9dc6aaa7001bfaf39f5c6fd-12494956-images-thumbs&n=13","Canada"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=e9a1b4368179eddb7561cf92842334de76fbfd5f-12487149-images-thumbs&n=13","USA"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=8dcfb3bc9f11f955e36945f21bc9a679be04c21f-10636921-images-thumbs&n=13","Mexico"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=542c9905756c3592d2a8ef3958b1fa3b50d2456a-12610457-images-thumbs&n=13","Guatemala"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=5f20fa226bb87f645a8f72fac9d646aa9cd7e25e-11525436-images-thumbs&n=13","Honduras"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=08aff052a2796fa977eaee70b42d6654c32ee7ab-12618389-images-thumbs&n=13","El Salvador"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=b9739b6c2e3aedb0d83ac8c69753b0899c1fcb88-9855155-images-thumbs&n=13","Panama"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=470c2ba3852face9dc225443fc4f44c8cb9241c2-5233580-images-thumbs&n=13","Nicaragua"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=6f9e667ce605a149c9cf88d0f4696dd92f462b0e-11080322-images-thumbs&n=13","Costa Rica"));
            countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=22ad0ea5b184bf856dbc32b822f9912841b64881-10516767-images-thumbs&n=13","Haiti"));
    }

    private void loadEurasia() {
        countryModels.add(new CountryModel("https://cryptomic.ru/wp-content/uploads/2018/02/59229a8a6c5cb.jpg"," Kyrgyzstan"));
        countryModels.add(new CountryModel("https://interesnoznat.com/wp-content/uploads/china-flag_enl.jpg","China"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=2a97ca9acaad8c769a91f1010e3004b6de89f8fd-12813659-images-thumbs&n=13","Saudi Arabia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=4d934aa0870a98cfb790f7d66a5e50f69fbf6574-12523590-images-thumbs&n=13","Vietnam"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=85286e22ea622e54d051fdda98f003ac270125da-8567615-images-thumbs&n=13","Egypt"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=f7f4e7bc48f4ac97dc6fa9f37e6cca53b5f18ab3-12416107-images-thumbs&n=13","Uzbekistan"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=8002cc522d33232027a2997a16061c48d33aa39b-12371805-images-thumbs&n=13","Russia"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=cef409ea5ea76594ffe24f307934e1baf0bc02d2-12661511-images-thumbs&n=13","Portugal"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=c4504fe6d58fe0db2a63936784ab00183780861f-12544206-images-thumbs&n=13","Kazakhstan"));
        countryModels.add(new CountryModel("https://avatars.mds.yandex.net/i?id=2ab90b0f7a504a8ee9e99f61a3d5a1bd18877a5d-12517331-images-thumbs&n=13","Germany"));

    }
}