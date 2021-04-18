package com.example.a108590016_hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class FullRecipe extends AppCompatActivity {
    private TextView mPosition;
    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_recipe);
        mPosition = findViewById(R.id.textView);
        mImage = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String message = intent.getStringExtra(WordListAdapter.WordViewHolder.EXTRA_MESSAGE);
        int[] array = {R.drawable.chocolate_mint_bar, R.drawable.blueberry_cupcakes, R.drawable.fudge_brownies, R.drawable.lemon_cake, R.drawable.blueberry_ice_cream, R.drawable.sheet_cake, R.drawable.espresso_crinkles, R.drawable.chocolate_cherry_cookies, R.drawable.cheesecake, R.drawable.tiramisu, R.drawable.carrot_cake, R.drawable.cobbler};
        mImage.setImageResource(array[Integer.parseInt(message)]);
        mPosition.setText("Procedure:\n1. Prepare ingredients.\n2. I don't know.");
    }
}