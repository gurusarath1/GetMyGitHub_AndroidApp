package com.example.getmygithub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MainViewAdapter extends RecyclerView.Adapter<MainViewAdapter.MainViewHolder>
{

    ArrayList<ListElementData> RecyclerViewData;

    public static class MainViewHolder extends RecyclerView.ViewHolder
    {

        public TextView Repo_url_textView;
        public TextView Repo_name_textView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            Repo_name_textView = (TextView) itemView.findViewById(R.id.RepoName);
            Repo_url_textView = (TextView) itemView.findViewById(R.id.RepoURL);
        }
    }

    public MainViewAdapter(ArrayList<ListElementData> dataX)
    {
        RecyclerViewData = dataX;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.list_element, parent, false);
        MainViewHolder mvh = new MainViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position)
    {
        ListElementData currentItem = RecyclerViewData.get(position);
        holder.Repo_name_textView.setText(currentItem.Repo_name);
        holder.Repo_url_textView.setText(currentItem.Repo_url);
    }

    @Override
    public int getItemCount() {
        return RecyclerViewData.size();
    }



}
