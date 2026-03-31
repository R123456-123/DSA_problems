class TrieNode {
    TrieNode[] children;
    boolean eow;

    public TrieNode() {
        children = new TrieNode[26];
        eow = false;
    }
}

class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;

        for(char c : word.toCharArray()) {
            int idx = c - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int j, TrieNode root) {
        TrieNode curr = root;
        
        for(int i = j; i < word.length(); i++) {
            char c = word.charAt(i);

            if(c == '.') {

                for(TrieNode child : curr.children) {
                    if(child != null && dfs(word, i + 1, child)) {
                        return true;
                    }
                }

            return false;

            } else {
                int idx = c - 'a';

                if(curr.children[idx] == null) {
                    return false;
                }

                curr = curr.children[idx];
            }
        }
        return curr.eow;
    }
}
