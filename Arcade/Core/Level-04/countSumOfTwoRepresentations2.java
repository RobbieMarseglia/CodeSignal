int solution(int n, int l, int r) {
    // find pair (j,k) : l <= j <= k <= r, j+k=n, max(k-j) for all (j,k)
    // return floor((k-j)/2)+1
    int j = l;
    int k = l;
    while (j + k != n && j < r) {
        if (k < r) k++;
        else j++;
    }
    
    if (j + k != n) return 0;
    
    return ((k-j) / 2) + 1;
}
