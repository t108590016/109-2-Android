package com.example.a108590016_hw7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDetailList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> wordList, LinkedList<String> detailList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        this.mDetailList = detailList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
        mCurrent = mDetailList.get(position);
        holder.detailItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView wordItemView;
        public final TextView detailItemView;
        final WordListAdapter mAdapter;
        public static final String EXTRA_MESSAGE = "com.example.android.activity_full_recipe.extra.MESSAGE";
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            detailItemView = itemView.findViewById(R.id.detail);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            Intent intent = new Intent(v.getContext(), FullRecipe.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(EXTRA_MESSAGE, Integer.toString(mPosition));
            v.getContext().startActivity(intent);
        }
    }
}