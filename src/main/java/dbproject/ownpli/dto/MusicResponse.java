package dbproject.ownpli.dto;

import dbproject.ownpli.domain.music.MusicEntity;
import dbproject.ownpli.domain.music.MusicMoodEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MusicResponse {

    private String musicId;
    private String title;
    private String singer;
    private String genre;
    private Long likes;
    private String imageFile;
    private String album;
    private String year;
    private String country;

    @Builder
    public MusicResponse(String musicId, String title, String singer, String genre, Long likes, String imageFile, String album, String year, String country) {
        this.musicId = musicId;
        this.title = title;
        this.singer = singer;
        this.genre = genre;
        this.likes = likes;
        this.imageFile = imageFile;
        this.album = album;
        this.year = year;
        this.country = country;
    }

    public static MusicResponse ofMusic(MusicEntity musicEntity, Long likes) {

        return MusicResponse.builder()
                .musicId(musicEntity.getMusicId())
                .title(musicEntity.getTitle())
                .singer(musicEntity.getSinger())
                .genre(musicEntity.getGenreEntity().getGenre())
                .likes(likes)
                .album(musicEntity.getAlbum())
                .year(String.valueOf(musicEntity.getDate().getYear()))
                .country(musicEntity.getCountry())
                .build();
    }

    public static MusicResponse ofMusicMood(MusicMoodEntity musicMoodEntity, Long likes) {
        MusicEntity musicEntity = musicMoodEntity.getMusicEntity();

        return MusicResponse.builder()
                .musicId(musicEntity.getMusicId())
                .title(musicEntity.getTitle())
                .singer(musicEntity.getSinger())
                .genre(musicEntity.getGenreEntity().getGenre())
                .likes(likes)
                .album(musicEntity.getAlbum())
                .year(String.valueOf(musicEntity.getDate().getYear()))
                .country(musicEntity.getCountry())
                .build();
    }
}