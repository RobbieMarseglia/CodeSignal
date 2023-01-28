int solution(int n) {
    // Number of squares in central cross
    int cross = 4*(n-1)+1;
    
    // Number of squares in corners
    int corners = 0;
    if (n > 2) {
        corners = 2*(n-2)*(n-1);
    }
    
    return cross+corners;
}
