import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("TvShow Testing")

class TvShowTest {

    @Test
    @DisplayName("Testing getName method")
    public  void getName() {
        TvShow tvShow = new TvShow("The Boondocks", 200, "comedy");
        assertEquals("The Boondocks", tvShow.getName());
    }

    @Test
    @DisplayName("Testing getEpisodes method")
     public void getEpisodes() {
        TvShow tvShow1 = new TvShow("Simpsons", 500, "Comedy");
        assertEquals(500, tvShow1.getEpisodes());
    }

    @Test
    @DisplayName("Testing getGenre method")
     public void getGenre() {
        TvShow tvShow2 = new TvShow("Snowfall ", 50, "Drama");
        TvShow tvShow3 = new TvShow("Ozark", 110);
        assertEquals("Drama", tvShow2.getGenre());
        assertEquals("Unknown", tvShow3.getGenre());
    }
}