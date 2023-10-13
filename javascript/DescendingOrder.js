var array = [12, 10, 15, 11, 14, 13, 16];
var done = false;
while (!done) {
  done = true;
  for (var i = 1; i < array.length; i += 1) {
    if (array[i ] > array[i-1]) {
      done = false;
      var tmp = array[i ];
      array[i ] = array[i-1];
      array[i-1] = tmp;
    }
  }
}
   
  console.log(... array);