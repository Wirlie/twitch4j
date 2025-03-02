package com.github.twitch4j.helix.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Setter(AccessLevel.PRIVATE)
public class SoundtrackPlaylistTracks {

    /**
     * The playlist’s title.
     */
    private String title;

    /**
     * The playlist’s ASIN (Amazon Standard Identification Number).
     */
    private String id;

    /**
     * A URL to the playlist’s image art.
     * Is empty if the playlist doesn't include art.
     */
    private String imageUrl;

    /**
     * A short description about the music that the playlist includes.
     */
    private String description;

    /**
     * The list of tracks in the playlist.
     */
    private List<SoundtrackTrack> catalogTracks;

}
