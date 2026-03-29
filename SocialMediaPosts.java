class SocialMediaPosts {
    String userName;
    String content;
    float views;
    String postDate;
    String platformName;
    long noOfLikes;
    long noOfShares;
    public SocialMediaPosts(String userName,String content,float views,String postDate,String platformName,long noOfLikes,long noOfShares) {
        System.out.println("I am the SocialMediaPosts "+
		"constructor with parameter:"+userName+","+content+","+views+","+postDate+","+platformName+","+noOfLikes+","+noOfShares);
    }
    public void displaySocialMediaPostsData() {
        System.out.println("--- SocialMediaPosts Data ---");
        System.out.println("Username: " + userName);
        System.out.println("Content: " + content);
        System.out.println("Views: " + views);
        System.out.println("Post Date: " + postDate);
        System.out.println("Platform Name: " + platformName);
        System.out.println("No. Of Likes: " + noOfLikes);
        System.out.println("No. Of Shares: " + noOfShares);
    }
}