package com.example.androidplayground.dogs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidplayground.R;

public class DogsAdapter extends RecyclerView.Adapter<DogsAdapter.ViewHolder> {
    private String[] dataSet = new String[]{
            "dog0", "dog1", "dog2", "dog3", "dog4", "dog5", "dog6", "dog7",
            "dog8", "dog9", "dog10", "dog11", "dog12", "dog13", "dog14", "dog15",
            "dog16", "dog17", "dog18", "dog19", "dog20"
    };

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dogs_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getTextView().setText(dataSet[position]);
    }

    @Override
    public int getItemCount() {
        return dataSet.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        ViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.tv_dog);
        }

        public TextView getTextView() {
            return textView;
        }
    }
}
