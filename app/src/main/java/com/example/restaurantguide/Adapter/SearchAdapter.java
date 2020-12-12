package com.example.restaurantguide.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantguide.Model.Restaurant;
import com.example.restaurantguide.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{
    public TextView name,address,phone,tag,rating;
    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.name);
        address = (TextView)itemView.findViewById(R.id.address);
        phone = (TextView)itemView.findViewById(R.id.phone);
        tag = (TextView)itemView.findViewById(R.id.tag);
        rating = (TextView)itemView.findViewById(R.id.rating);
    }

}
public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder>{
    private Context context;
    private List<Restaurant> restaurantList;

    public SearchAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_restaurant,parent,false);
        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.name.setText(restaurantList.get(position).getrName());
        holder.address.setText(restaurantList.get(position).getrAddress());
        holder.phone.setText(restaurantList.get(position).getrPhone());
        holder.tag.setText(restaurantList.get(position).getrTag());
        holder.rating.setText(restaurantList.get(position).getrRating());

    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }
}
