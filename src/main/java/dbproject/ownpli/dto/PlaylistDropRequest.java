package dbproject.ownpli.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class PlaylistDropRequest {

    private List<String> playlistIds;

}