public String longestWord(String[] words) {
        Map<String,Integer> myWords = new HashMap<String,Integer>();
        for (String word: words) myWords.put(word,0);
         Arrays.sort(words, new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            if(o1.length() == o2.length())
                return o1.compareTo(o2);
            return o2.length() - o1.length();
        }
    });
        
        for (String word: words) {
            boolean good = true;
            for (int k = 1; k < word.length(); ++k) {
                if (!myWords.containsKey(word.substring(0, k))) {
                    good = false;
                    break;
                }
            }
            if (good) return word;
        }

        return "";
    }
