// Last updated: 7/13/2026, 10:02:53 AM

        
class Solution {
        public int prefixCount(String[] words, String pref) {
                int c = 0;
                        int n = pref.length();
                                for (String w : words) {
                                            if (w.length() >= n && w.startsWith(pref)) {
                                                            c++;
                                                                        }
                                                                                }
                                                                                        return c;
                                                                                            }
                                                                                            }

