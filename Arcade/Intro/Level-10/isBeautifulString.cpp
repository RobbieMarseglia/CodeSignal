bool solution(string s) {
    map<char, int> freq;
    
    // Initialise a-z frequency to 0
    for (char c = 'a'; c != 'z'; c++) {
        freq[c] = 0;
    }
    
    // Calculate frequency of each letter
    for (char c : s) {
        freq[c]++;
    }
    
    char last;
    bool skip = false;
    for (auto e : freq) {
        // a
        if (!skip) {
            last = e.first;
            skip = true;
            
        // b-z
        } else {
            // If current element occurs more times than last
            if (e.second > freq[last]) return false;
            last = e.first;
        }
    }
    
    return true;
}
