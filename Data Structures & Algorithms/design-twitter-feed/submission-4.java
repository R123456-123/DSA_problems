class Twitter {
    int time;
    Map<Integer, List<int[]>> tweetMap;
    Map<Integer, Set<Integer>> connectMap;
    
    public Twitter() {
        time = 0;
        tweetMap = new HashMap<>();
        connectMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.putIfAbsent(userId, new ArrayList<>());
        tweetMap.get(userId).add(new int[] {time++, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<int[]> feeds = new ArrayList(tweetMap.getOrDefault(userId, new ArrayList<>()));
        for(int followeeId : connectMap.getOrDefault(userId, new HashSet<>())) {
           feeds.addAll(tweetMap.getOrDefault(followeeId, new ArrayList<>()));
        }

        feeds.sort((a, b) -> b[0] - a[0]);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < Math.min(10, feeds.size()); i++) {
           res.add(feeds.get(i)[1]);
        }

        return res;
    }
    
    public void follow(int followerId, int followeeId) {
       if (followerId != followeeId) {
            connectMap.putIfAbsent(followerId, new HashSet<>());
            connectMap.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        connectMap.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
