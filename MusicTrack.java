 class MusicTrack {
    String trackName;
    String artistName;
    String albumName;
    float durationInMinutes;
    long totalStreams;
    String releaseDate;

    public MusicTrack(String trackName,String artistName,String albumName,float durationInMinutes,long totalStreams,String releaseDate) {
        System.out.println("I am the MusicTrack constructor with parameter:"+trackName+","+artistName+","+albumName+","+durationInMinutes+","+totalStreams+","+releaseDate);
    }

    
    public void getMusicTrackData() {
        System.out.println("--- Music Track Data ---");
        System.out.println("Track Name: " + trackName);
        System.out.println("Artist: " + artistName);
        System.out.println("Album: " + albumName);
        System.out.println("Duration: " + durationInMinutes);
        System.out.println("Total Streams: " + totalStreams);
        System.out.println("Released: " + releaseDate);
    }
}