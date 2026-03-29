class MusicTrackRunner
{
public static void main(String []agrs)
{
	 MusicTrack ref = new MusicTrack("Starboy","The Weeknd","After Hours",45.9f,6856754654l,"feb 13,2006");
        ref.trackName = "Blinding Lights";
        ref.artistName = "The Weeknd";
        ref.albumName = "After Hours";
        ref.durationInMinutes = 3.32f;
        ref.totalStreams = 4000000000L; 
        ref.releaseDate = "November 29, 2019";
        ref.getMusicTrackData();
    }
}
