function sortDescending(arr) {
    var n = arr.length;
    var swapped;
    
    do {
      swapped = false;
      for (var i = 0; i < n - 1; i++) {
        if (arr[i] < arr[i + 1]) { 
          
          var temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;

        }
      }
    } while (swapped);
  
    return arr;
  }
  
  var arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
  console.log("Original array : ",arr);
  sortDescending(arr);
  console.log("Descending sort array : ",arr);
  