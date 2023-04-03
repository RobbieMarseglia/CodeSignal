solution inputArray = [x | x <- inputArray, length x == len inputArray]

len (x:[]) = length x
len (x:xs) = max (length x) (len xs)
