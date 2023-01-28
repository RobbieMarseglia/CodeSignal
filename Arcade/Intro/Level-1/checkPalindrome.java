boolean solution(String inputString) {
    int len = inputString.length();
    int left = len/2 - 1;
    int right = left+1;
    
    // Ignore middle character if length is odd
    if (len % 2 == 1) {
        right++;
    }
    
    // Compare character equality moving outwards
    for (int i=0; i<len/2; i++) {
        if (inputString.charAt(left--) != inputString.charAt(right++)) return false;
    }
    
    return true;
}
