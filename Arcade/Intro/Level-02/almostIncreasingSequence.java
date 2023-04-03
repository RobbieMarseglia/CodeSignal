boolean solution(int[] sequence) {
    int j = -1;
    
    for (int i=0; i<sequence.length-1; i++) {
        if (sequence[i+1] <= sequence[i]) {
            if (j!=-1) return false; // if > 1 pair violates condition, return false
            j = i;
        }
    }
    
    // Check if removing element j or j+1 creates a strictly increasing sequence
    return j==-1 || j==0 || j+1==sequence.length-1 || sequence[j-1] < sequence[j+1] || sequence[j] < sequence[j+2];
}
