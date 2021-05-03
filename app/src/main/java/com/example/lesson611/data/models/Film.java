package com.example.lesson611.data.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Film implements Serializable {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("original_title_romanised")
    private String originalTitleRomanised;
    @SerializedName("description")
    private String description;
    @SerializedName("director")
    private String director;
    @SerializedName("producer")
    private String producer;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("running_time")
    private String runningTime;
    @SerializedName("rt_score")
    private String rtScore;

    @Override
    public String toString() {
        return "Film{" +
                "Id='" + id + ",\n" +
                "Title='" + title + ",\n" +
                "OriginalTitle='" + originalTitle + ",\n" +
                "OriginalTitleRomanised='" + originalTitleRomanised + ",\n" +
                "Description='" + description + ",\n" +
                "Director='" + director + ",\n" +
                "Producer='" + producer + ",\n" +
                "ReleaseDate='" + releaseDate + ",\n" +
                "RunningTime='" + runningTime + ",\n" +
                "RtScore='" + rtScore + '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOriginalTitleRomanised() {
        return originalTitleRomanised;
    }

    public void setOriginalTitleRomanised(String originalTitleRomanised) {
        this.originalTitleRomanised = originalTitleRomanised;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getRtScore() {
        return rtScore;
    }

    public void setRtScore(String rtScore) {
        this.rtScore = rtScore;
    }

}