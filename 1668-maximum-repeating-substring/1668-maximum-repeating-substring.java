class Solution {

    public int maxRepeating(String sequence, String word) {
        StringBuilder s = new StringBuilder();
        s.append(word);
        int count = 0;
        while (sequence.contains(s.toString())) {
            count++;
            s.append(word);
        }

        return count;
    }
}
