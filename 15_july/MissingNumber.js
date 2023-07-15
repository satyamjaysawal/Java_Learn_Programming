const arr = [1, 0, 2, 4];
const n = 4;
let total = n * (n + 1) / 2;

for (let i = 0; i < arr.length; i++) {
  total = total - arr[i];
}

console.log(total); //missing number=3
