function filtraPares(arr) {
  return arr.filter(function (item) {
    if (item % 2 === 0) {
      return item;
    }
  });
}
let Array = [1, 2, 3, 4];
console.log(filtraPares(Array));
console.log(filtraPares([5, 6, 7, 8]));
