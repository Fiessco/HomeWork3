package com.example.a5lesson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ViewHolder> {

    private final List<Planet> planets;
    private final LayoutInflater inflater;

    public PlanetAdapter(List<Planet> planets, Context context) {
        this.planets = planets;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Planet planet = planets.get(position);
    holder.planetView.setImageResource(planet.getPlanetRes());
    holder.nameView.setText(planet.getName());
    holder.planetDescriptionView.setText(planet.getPlanetDescription());
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView planetView;
        final TextView nameView, planetDescriptionView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            planetView = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.name);
            planetDescriptionView = itemView.findViewById(R.id.desc);
        }
    }

}
