function replaceParPorZero(array) {
  if (!array) return -1;
  if (array.length === 0) return -1;

  for (let i = 0; i < array.length; i++) {
    if (array[i] === 0) {
      console.log("Você já é zero");
    } else if (array[i] % 2 === 0) {
      array[i] = 0;
    }
  }
  return array;
}
arr = [];
console.log(replaceParPorZero(arr));
