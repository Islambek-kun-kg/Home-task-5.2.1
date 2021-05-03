package com.example.lesson611.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.lesson611.R;
import com.example.lesson611.data.models.Film;
import com.example.lesson611.data.remote.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmsFragDetails extends Fragment {
    private TextView title;
    private TextView original_title;
    private TextView original_title_romanised;
    private TextView description;
    private TextView director;
    private TextView producer;
    private TextView release_date;
    private TextView running_time;
    private TextView rt_score;
    private String id;

    public FilmsFragDetails() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) id = getArguments().getString("film");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_films_frag_details, container, false);
        init(view);
        openFilmFrag();
        return view;
    }

    private void init(View view) {
        title = view.findViewById(R.id.txtForFilmsTitle);
        original_title = view.findViewById(R.id.txtForFilmsOriginalTitle);
        original_title_romanised = view.findViewById(R.id.txtForFilmsOriginalTitleRomanised);
        description = view.findViewById(R.id.txtForFilmsDescription);
        director = view.findViewById(R.id.txtForFilmsDirector);
        producer = view.findViewById(R.id.txtForFilmsProducer);
        release_date = view.findViewById(R.id.txtForFilmsReleaseDate);
        running_time = view.findViewById(R.id.txtForFilmsRunningTime);
        rt_score = view.findViewById(R.id.txtForFilmsRtScore);
    }

    private void openFilmFrag() {
        RetrofitBuilder.getInstance().getFilms(id).enqueue(new Callback<Film>() {
            @Override
            public void onResponse(Call<Film> call, Response<Film> response) {
                if (response.isSuccessful() && response.body() != null) {
                    title.setText(response.body().getTitle());
                    original_title.setText(response.body().getOriginalTitle());
                    original_title_romanised.setText(response.body().getOriginalTitleRomanised());
                    description.setText(response.body().getDescription());
                    director.setText(response.body().getDirector());
                    producer.setText(response.body().getProducer());
                    release_date.setText(response.body().getReleaseDate());
                    running_time.setText(response.body().getRunningTime());
                    rt_score.setText(response.body().getRtScore());
                }
            }

            @Override
            public void onFailure(Call<Film> call, Throwable t) {
            }
        });
    }
}