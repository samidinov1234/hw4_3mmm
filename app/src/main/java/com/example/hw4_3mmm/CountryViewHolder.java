package com.example.hw4_3mmm;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw4_3mmm.databinding.ItemCountryBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;
    public CountryViewHolder(@NonNull ItemCountryBinding countryBinding) {
        super(countryBinding.getRoot());
        this.binding = countryBinding;
    }

    public void bind(CountryModel countryModel) {
        binding.tvCountry.setText(countryModel.getCountryName());
        Glide.with(binding.imgCountry).load(countryModel.getImgCountry()).into(binding.imgCountry);
    }
}
